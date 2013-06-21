package utils;

import java.util.ArrayList;

import main.MainSystem;

import DataObjects.*;


public class ActualData extends KeyData{
	
	private ArrayList<Penalties> PenaltiesTable = new ArrayList<Penalties>();
	private ArrayList<DirectFreeKicks> DFKicksTable = new ArrayList<DirectFreeKicks>();

	public ArrayList<Penalties> getPenaltiesTable() {
		return PenaltiesTable;
	}

	public void setPenaltiesTable(ArrayList<Penalties> penaltiesTable) {
		PenaltiesTable = penaltiesTable;
	}

	public ArrayList<DirectFreeKicks> getDFKicksTable() {
		return DFKicksTable;
	}

	public void setDFKicksTable(ArrayList<DirectFreeKicks> dFKicksTable) {
		DFKicksTable = dFKicksTable;
	}

	public int getKey(ArrayList<Matches> matchesTable,ArrayList<Players> playersTable, ArrayList<Teams> teamsTable, String dataLine) 
			throws IdNotFoundException  {
		int key = 0;
		int PlayerID, MatchID = 0;
		
		String[] data = dataLine.split(",");
		
		PlayerID = getPlayerIDfromOptaID(Integer.parseInt(data[1]), playersTable); //OptaID
		
		if(PlayerID == 0){
			throw new IdNotFoundException("getKey: Could not find PlayerID");
		}
		else {
			Matches matObj = new Matches();
		
			matObj.setDate(data[0]); //Date
		
			int TeamID1 = getTeamIDfromOptaID(Integer.parseInt(data[5]), teamsTable); // Team ID
			int TeamID2 = getTeamIDfromOptaID(Integer.parseInt(data[7]), teamsTable); // Opposition ID	
		
			if((TeamID1 == 0) || (TeamID2 == 0)) {
				throw new IdNotFoundException("getKey: Could not find TeamID");
			} else {
				matObj.setTeamID1(TeamID1);
				matObj.setTeamID2(TeamID2);
				
				MatchID = getMatchIDfromObj(matObj, matchesTable);
				
				if(MatchID == 0) {
					throw new  IdNotFoundException("getKey: Could not find MatchID");
				}else {
					//Everything is fine...now connect to the DB to get the Key.
					DBConnector dbObj = new DBConnector(MainSystem.dbName,MainSystem.userName,MainSystem.password);
					
					String res = dbObj.executeSQLStoredProcedure("{call prcGetKey(?, ?)}", MatchID, PlayerID, 1);
					
					key = Integer.parseInt(res);
				}
			}			
		}
		return key;
	}

	public void populatePenaltiesTable(int key, String dataLine) {
		
		ArrayList<Penalties> tempTable = new ArrayList<Penalties>();
		
		tempTable = getPenaltiesTable();
		
		Penalties tempObj = new Penalties();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setTaken(Integer.parseInt(data[21]));
		tempObj.setGoals(Integer.parseInt(data[22]));
		tempObj.setSaved(Integer.parseInt(data[23]));
		tempObj.setOffTarget(Integer.parseInt(data[24]));
		tempObj.setNotScored(Integer.parseInt(data[25]));
		
		tempTable.add(tempObj);
		
		setPenaltiesTable(tempTable);	
		
	}

	public void populateDFKicksTable(int key, String dataLine) {
		
		ArrayList<DirectFreeKicks> tempTable = new ArrayList<DirectFreeKicks>();
		
		tempTable = getDFKicksTable();
		
		DirectFreeKicks tempObj = new DirectFreeKicks();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setGoals(Integer.parseInt(data[26]));
		tempObj.setOnTarget(Integer.parseInt(data[27]));
		tempObj.setOffTarget(Integer.parseInt(data[28]));
		tempObj.setBlocked(Integer.parseInt(data[29]));
		
		tempTable.add(tempObj);
		
		setDFKicksTable(tempTable);
		
	}

}
