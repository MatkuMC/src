package utils;

import java.util.ArrayList;

import main.MainSystem;

import DataObjects.*;


public class ActualData extends KeyData{
	
	private ArrayList<Penalties> PenaltiesTable = new ArrayList<Penalties>();
	private ArrayList<DirectFreeKicks> DFKicksTable = new ArrayList<DirectFreeKicks>();
	private ArrayList<InsideBox> InsideBoxTable = new ArrayList<InsideBox>();
	private ArrayList<OutsideBox> OutsideBoxTable = new ArrayList<OutsideBox>();
	private ArrayList<Headed> HeadedTable = new ArrayList<Headed>();
	private ArrayList<LeftFoot> LeftFootTable = new ArrayList<LeftFoot>();
	private ArrayList<RightFoot> RightFootTable =  new ArrayList<RightFoot>();
	private ArrayList<Other> OtherTable = new ArrayList<Other>();
	private ArrayList<ShotsCleared> ShotsClearedTable = new ArrayList<ShotsCleared> ();
	private ArrayList<Goals> GoalsTable = new ArrayList<Goals>();
	private ArrayList<AttemptsOnTarget> AttemptsOnTargetTable = new ArrayList<AttemptsOnTarget>();

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

	public ArrayList<InsideBox> getInsideBoxTable() {
		return InsideBoxTable;
	}

	public void setInsideBoxTable(ArrayList<InsideBox> insideBoxTable) {
		InsideBoxTable = insideBoxTable;
	}

	public ArrayList<OutsideBox> getOutsideBoxTable() {
		return OutsideBoxTable;
	}

	public void setOutsideBoxTable(ArrayList<OutsideBox> outsideBoxTable) {
		OutsideBoxTable = outsideBoxTable;
	}

	public ArrayList<Headed> getHeadedTable() {
		return HeadedTable;
	}

	public void setHeadedTable(ArrayList<Headed> headedTable) {
		HeadedTable = headedTable;
	}

	public ArrayList<LeftFoot> getLeftFootTable() {
		return LeftFootTable;
	}

	public void setLeftFootTable(ArrayList<LeftFoot> leftFootTable) {
		LeftFootTable = leftFootTable;
	}

	public ArrayList<RightFoot> getRightFootTable() {
		return RightFootTable;
	}

	public void setRightFootTable(ArrayList<RightFoot> rightFootTable) {
		RightFootTable = rightFootTable;
	}

	public ArrayList<Other> getOtherTable() {
		return OtherTable;
	}

	public void setOtherTable(ArrayList<Other> otherTable) {
		OtherTable = otherTable;
	}

	public ArrayList<ShotsCleared> getShotsClearedTable() {
		return ShotsClearedTable;
	}

	public void setShotsClearedTable(ArrayList<ShotsCleared> shotsClearedTable) {
		ShotsClearedTable = shotsClearedTable;
	}

	public ArrayList<Goals> getGoalsTable() {
		return GoalsTable;
	}

	public void setGoalsTable(ArrayList<Goals> goalsTable) {
		GoalsTable = goalsTable;
	}

	public ArrayList<AttemptsOnTarget> getAttemptsOnTargetTable() {
		return AttemptsOnTargetTable;
	}

	public void setAttemptsOnTargetTable(ArrayList<AttemptsOnTarget> attemptsOnTargetTable) {
		AttemptsOnTargetTable = attemptsOnTargetTable;
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
	
	public void populateInsideBoxTable(int key, String dataLine) {
		ArrayList<InsideBox> tempTable = new ArrayList<InsideBox>();
		
		tempTable = getInsideBoxTable();
		
		InsideBox tempObj = new InsideBox();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setGoals(Integer.parseInt(data[30]));
		tempObj.setShotsOn(Integer.parseInt(data[31]));
		tempObj.setShotsOff(Integer.parseInt(data[32]));
		tempObj.setBlocked(Integer.parseInt(data[33]));
		
		tempTable.add(tempObj);
		
		setInsideBoxTable(tempTable);
		
	}
	
	public void populateOutsideBoxTable(int key, String dataLine) {
		ArrayList<OutsideBox> tempTable = new ArrayList<OutsideBox>();
		
		tempTable = getOutsideBoxTable();
		
		OutsideBox tempObj = new OutsideBox();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setGoals(Integer.parseInt(data[34]));
		tempObj.setShotsOn(Integer.parseInt(data[35]));
		tempObj.setShotsOff(Integer.parseInt(data[36]));
		tempObj.setBlocked(Integer.parseInt(data[37]));
		
		tempTable.add(tempObj);
		
		setOutsideBoxTable(tempTable);
		
	}

	public void populateHeadedTable(int key, String dataLine) {
		
		ArrayList<Headed> tempTable = new ArrayList<Headed>();
		
		tempTable = getHeadedTable();
		
		Headed tempObj = new Headed();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setGoals(Integer.parseInt(data[38]));
		tempObj.setShotsOn(Integer.parseInt(data[39]));
		tempObj.setShotsOff(Integer.parseInt(data[40]));
		tempObj.setBlocked(Integer.parseInt(data[41]));
		
		tempTable.add(tempObj);
		
		setHeadedTable(tempTable);
	}

	public void populateLeftFootTable(int key, String dataLine) {
		
		ArrayList<LeftFoot> tempTable = new ArrayList<LeftFoot>();
		
		tempTable = getLeftFootTable();
		
		LeftFoot tempObj = new LeftFoot();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setGoals(Integer.parseInt(data[42]));
		tempObj.setShotsOn(Integer.parseInt(data[43]));
		tempObj.setShotsOff(Integer.parseInt(data[44]));
		tempObj.setBlocked(Integer.parseInt(data[45]));
		
		tempTable.add(tempObj);
		
		setLeftFootTable(tempTable);
		
	}

	public void populateRightFootTable(int key, String dataLine) {
		
		ArrayList<RightFoot> tempTable = new ArrayList<RightFoot>();
		
		tempTable = getRightFootTable();
		
		RightFoot tempObj = new RightFoot();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setGoals(Integer.parseInt(data[46]));
		tempObj.setShotsOn(Integer.parseInt(data[47]));
		tempObj.setShotsOff(Integer.parseInt(data[48]));
		tempObj.setBlocked(Integer.parseInt(data[49]));
		
		tempTable.add(tempObj);
		
		setRightFootTable(tempTable);
	}

	public void populateOtherTable(int key, String dataLine) {
		ArrayList<Other> tempTable = new ArrayList<Other>();
		
		tempTable = getOtherTable();
		
		Other tempObj = new Other();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setGoals(Integer.parseInt(data[50]));
		tempObj.setShotsOn(Integer.parseInt(data[51]));
		tempObj.setShotsOff(Integer.parseInt(data[52]));
		tempObj.setBlocked(Integer.parseInt(data[53]));
		
		tempTable.add(tempObj);
		
		setOtherTable(tempTable);
		
	}

	public void populateShotsClearedTable(int key, String dataLine) {
		ArrayList<ShotsCleared> tempTable = new ArrayList<ShotsCleared>();
		
		tempTable = getShotsClearedTable();
		
		ShotsCleared tempObj = new ShotsCleared();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setOffLine(Integer.parseInt(data[54]));
		tempObj.setOffLineInsideArea(Integer.parseInt(data[55]));
		tempObj.setOffLineOutsideArea(Integer.parseInt(data[56]));
		
		
		tempTable.add(tempObj);
		
		setShotsClearedTable(tempTable);
		
	}

	public void populateGoalsTable(int key, String dataLine) {
		ArrayList<Goals> tempTable = new ArrayList<Goals>();
		
		tempTable = getGoalsTable();
		
		Goals tempObj = new Goals();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setOpenPlay(Integer.parseInt(data[57]));
		tempObj.setCorners(Integer.parseInt(data[58]));
		tempObj.setThrows(Integer.parseInt(data[59]));
		tempObj.setDFKicks(Integer.parseInt(data[60]));
		tempObj.setSetPlay(Integer.parseInt(data[61]));
		tempObj.setPenalties(Integer.parseInt(data[62]));

		tempTable.add(tempObj);
		
		setGoalsTable(tempTable);
		
	}

	public void populateAttemptsOnTargetTable(int key, String dataLine) {
		ArrayList<AttemptsOnTarget> tempTable = new ArrayList<AttemptsOnTarget>();
		
		tempTable = getAttemptsOnTargetTable();
		
		AttemptsOnTarget tempObj = new AttemptsOnTarget();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setOpenPlay(Integer.parseInt(data[63]));
		tempObj.setCorners(Integer.parseInt(data[64]));
		tempObj.setThrows(Integer.parseInt(data[65]));
		tempObj.setDFKicks(Integer.parseInt(data[66]));
		tempObj.setSetPlay(Integer.parseInt(data[67]));
		tempObj.setPenalties(Integer.parseInt(data[68]));

		tempTable.add(tempObj);
		
		setAttemptsOnTargetTable(tempTable);
		
	}

}
