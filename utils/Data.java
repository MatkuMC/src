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
	private int counterMatchesID;
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

	public int getCounterMatchesID() {
		return counterMatchesID;
	}

	public void setCounterMatchesID(int counterMatchesID) {
		this.counterMatchesID = counterMatchesID;
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
	}

	public void incrementCounter(CounterType ct){
		if(ct == CounterType.Team) setCounterTeamID(getCounterTeamID() + 1);
		if(ct == CounterType.Player) setCounterPlayerID(getCounterPlayerID() + 1);
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
				throw new IdNotFoundException("Could not find TeamID");
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

	public void addMatchesData(String strLine, ArrayList<Players> playersTable) throws IdNotFoundException  {
		
		
	}

}
