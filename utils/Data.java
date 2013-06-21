package utils;
import java.util.ArrayList;

import DataObjects.*;


public class Data {
	
	private ArrayList<Teams> TeamsTable = new ArrayList<Teams>();
	private ArrayList<Players> PlayersTable = new ArrayList<Players>();
	private ArrayList<Matches> MatchesTable = new ArrayList<Matches>();
	private ArrayList<PlayerMatches> PlayerMatchesTable = new ArrayList<PlayerMatches>();
	
	private int counterTeamID;
	private int counterPlayerID;
	private int counterMatchID;
	private int counterPlayerMatchesID;

	public ArrayList<Teams> getTeamsTable() {
		return TeamsTable;
	}

	public void setTeamsTable(ArrayList<Teams> teamsTable) {
		TeamsTable = teamsTable;
	} 
	
	public int getCounterTeamID() {
		return counterTeamID;
	}

	public void setCounterTeamID(int counterTeamID) {
		this.counterTeamID = counterTeamID;
	}
	
	public ArrayList<Players> getPlayersTable() {
		return PlayersTable;
	}

	public void setPlayersTable(ArrayList<Players> playersTable) {
		PlayersTable = playersTable;
	}

	public int getCounterPlayerID() {
		return counterPlayerID;
	}

	public void setCounterPlayerID(int counterPlayerID) {
		this.counterPlayerID = counterPlayerID;
	}

	public int getCounterMatchID() {
		return counterMatchID;
	}

	public void setCounterMatchID(int counterMatchesID) {
		this.counterMatchID = counterMatchesID;
	}

	public int getCounterPlayerMatchesID() {
		return counterPlayerMatchesID;
	}

	public void setCounterPlayerMatchesID(int counterPlayerMatchesID) {
		this.counterPlayerMatchesID = counterPlayerMatchesID;
	}

	public ArrayList<Matches> getMatchesTable() {
		return MatchesTable;
	}

	public void setMatchesTable(ArrayList<Matches> matchesTable) {
		MatchesTable = matchesTable;
	}

	public ArrayList<PlayerMatches> getPlayerMatchesTable() {
		return PlayerMatchesTable;
	}

	public void setPlayerMatchesTable(ArrayList<PlayerMatches> playerMatchesTable) {
		PlayerMatchesTable = playerMatchesTable;
	}

	public enum CounterType {
		Team, Player, Matches, PlayerMatches;
	}
	
	public Data(){
		setCounterTeamID(100);
		setCounterPlayerID(1000);
		setCounterMatchID(10000);
		setCounterPlayerMatchesID(2000);
	}

	public void incrementCounter(CounterType ct){
		if(ct == CounterType.Team) setCounterTeamID(getCounterTeamID() + 1);
		if(ct == CounterType.Player) setCounterPlayerID(getCounterPlayerID() + 1);
		if(ct == CounterType.Matches) setCounterMatchID(getCounterMatchID() + 1);
		if(ct == CounterType.PlayerMatches) setCounterPlayerMatchesID(getCounterPlayerMatchesID() + 1);
	}
	
	public int getTeamIDfromOptaID(int optaTeamID, ArrayList<Teams> TeamsTable){
		int TeamID = 0;
		
		for(Teams team : TeamsTable){
			if(team.getOptaTeamID() == optaTeamID) 
				{
					TeamID = team.getTeamID();
					break;
				}	
		}
		
		return TeamID;
	}
	
	private int getPlayerIDfromOptaID(int optaPlayerID, ArrayList<Players> PlayersTable) {
		int PlayerID = 0;
		
		for(Players player : PlayersTable){
			if(player.getOptaPlayerID() == optaPlayerID) 
				{
					PlayerID = player.getPlayerID();
					break;
				}	
		}
		
		return PlayerID;
	}
	
	private int getMatchIDfromObj(Matches matchObj, ArrayList<Matches> MatchesTable){
		int MatchID = 0;
		
		for(Matches match : MatchesTable){
			//Check that the dates are equal..
			if((match.getDate().compareTo(matchObj.getDate()) == 0)) {
				//If the dates are equal check that Team1 == Team1 and Team2 == Team2... or if Team1 == Team2 and Team2 = Team1
				if((match.getTeamID1() == matchObj.getTeamID1()) && (match.getTeamID2() == matchObj.getTeamID2())){
					MatchID = match.getMatchID();
					break;
				} else  if ((match.getTeamID1() == matchObj.getTeamID2()) && (match.getTeamID2() == matchObj.getTeamID1())){
					MatchID = match.getMatchID();
					break;
				}
			}
		}
		
		return MatchID;
	}
	
	public void addTeamData(String dataLine){
		ArrayList<Teams> tempTeamsTable = new ArrayList<Teams>();
		
		tempTeamsTable = getTeamsTable();
		
		String[] data = dataLine.split(",");
		
		//Create the Team object to add to the ArrayList.
		Teams tempObj = new Teams();
		
		tempObj.setTeamName(data[4]); // Team Name
		tempObj.setOptaTeamID(Integer.parseInt(data[5])); // OptaTeamID
		
		if(!tempTeamsTable.contains(tempObj)){
			tempObj.setTeamID(getCounterTeamID());
			incrementCounter(CounterType.Team);
			tempTeamsTable.add(tempObj);
		}
		
		setTeamsTable(tempTeamsTable);
		
	}

	public void addPlayersData(String dataLine, ArrayList<Teams> TeamsTable) throws IdNotFoundException {
		
		ArrayList<Players> tempPlayersTable = new ArrayList<Players>();
		
		tempPlayersTable = getPlayersTable();
		
		String [] data = dataLine.split(",");
		
		Players tempObj = new Players();
		
		tempObj.setOptaPlayerID(Integer.parseInt(data[1])); // OptaPlayerID
		
		if(!tempPlayersTable.contains(tempObj)){
			
			int TeamID = getTeamIDfromOptaID(Integer.parseInt(data[5]), TeamsTable);
			
			if(TeamID == 0) {
				throw new IdNotFoundException("addPlayersData: Could not find TeamID");
			} else {
				tempObj.setTeamID(TeamID);
				tempObj.setSurname(data[2]);
				tempObj.setForename(data[3]);
				tempObj.setPlayerID(getCounterPlayerID());
				incrementCounter(CounterType.Player);
				tempPlayersTable.add(tempObj);
			}	
		}
		
		setPlayersTable(tempPlayersTable);
		
	}

	public void addMatchesData(String dataLine, ArrayList<Teams> TeamsTable, ArrayList<Players> PlayersTable) throws IdNotFoundException  {
		ArrayList<Matches> tempMatchesTable = new ArrayList<Matches>();
		
		ArrayList<PlayerMatches> tempPMtable = new ArrayList<PlayerMatches>();
		
		tempMatchesTable = getMatchesTable();
		tempPMtable = getPlayerMatchesTable();
		
		String [] data = dataLine.split(",");
		
		Matches tempObj = new Matches();
		
		PlayerMatches tempPMObj = new PlayerMatches();
		
		tempObj.setDate(data[0]); // Date
		
		int TeamID1 = getTeamIDfromOptaID(Integer.parseInt(data[5]), TeamsTable); // Team ID
		int TeamID2 = getTeamIDfromOptaID(Integer.parseInt(data[7]), TeamsTable); // Opposition ID	
		
		int PlayerID = getPlayerIDfromOptaID(Integer.parseInt(data[1]), PlayersTable);
		
		if((TeamID1 == 0) || (TeamID2 == 0)) {
			throw new IdNotFoundException("addMatchesData: Could not find TeamID");
		} else {
			tempObj.setTeamID1(TeamID1);
			tempObj.setTeamID2(TeamID2);
		}
		
		if(PlayerID == 0){
			throw new IdNotFoundException("addMatchesData: Could not find PlayerID");
		} else {
			tempPMObj.setPlayerID(PlayerID);
		}
		
		tempObj.setVenue(data[8]); // Venue
		
		
		if(!tempMatchesTable.contains(tempObj)) {
			tempObj.setMatchID(getCounterMatchID());
			tempPMObj.setMatchID(getCounterMatchID());
			
			tempPMObj.setID(getCounterPlayerMatchesID());
			
			incrementCounter(CounterType.PlayerMatches);
			incrementCounter(CounterType.Matches);
			
			tempMatchesTable.add(tempObj);
			tempPMtable.add(tempPMObj);
		} else {
			// Add the Player and previous MatchID.
			int MatchID = getMatchIDfromObj(tempObj, tempMatchesTable);
			
			if(MatchID == 0) {
				throw new  IdNotFoundException("addMatchesData: Could not find MatchID");
			}else {
				tempPMObj.setMatchID(MatchID);
				
				tempPMObj.setID(getCounterPlayerMatchesID());
				
				incrementCounter(CounterType.PlayerMatches);
				tempPMtable.add(tempPMObj);
			}
			
		}
		
		setMatchesTable(tempMatchesTable);
		setPlayerMatchesTable(tempPMtable);
		
	}

}
