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
	private ArrayList<AttemptsOffTarget> AttemptsOffTargetTable = new ArrayList<AttemptsOffTarget>();
	private ArrayList<SuccessfulPasses> SuccessfulPassesTable = new ArrayList<SuccessfulPasses>();
	private ArrayList<UnsuccessfulPasses> UnsuccessfulPassesTable = new ArrayList<UnsuccessfulPasses>();
	private ArrayList<FlickOn> FlickOnTable = new ArrayList<FlickOn>();
	private ArrayList<CrossesCorners> CrossesCornersTable = new ArrayList<CrossesCorners>();
	private ArrayList<CornersIntoBox> CornersIntoBoxTable = new ArrayList<CornersIntoBox>();
	private ArrayList<ThrowIn> ThrowInTable = new ArrayList<ThrowIn>();
	private ArrayList<Dribbles> DribblesTable = new ArrayList<Dribbles>();
	private ArrayList<CrossesCornersLeft> CrossesCornersLeftTable = new ArrayList<CrossesCornersLeft>();
	private ArrayList<CrossesLeft> CrossesLeftTable = new ArrayList<CrossesLeft>();
	private ArrayList<CornersLeft> CornersLeftTable = new ArrayList<CornersLeft>();
	private ArrayList<CrossesCornersRight> CrossesCornersRightTable = new ArrayList<CrossesCornersRight>();
	private ArrayList<CrossesRight> CrossesRightTable = new ArrayList<CrossesRight>();
	private ArrayList<CornersRight> CornersRightTable = new ArrayList<CornersRight>();
	private ArrayList<LongBalls> LongBallsTable = new ArrayList<LongBalls>();
	private ArrayList<LayOffs> LayOffsTable = new ArrayList<LayOffs>();
	private ArrayList<CrossesCornersAir> CrossesCornersAirTable = new ArrayList<CrossesCornersAir>();
	private ArrayList<CrossesAir> CrossesAirTable = new ArrayList<CrossesAir>();
	private ArrayList<OpenPlayCrosses> OpenPlayCrossesTable = new ArrayList<OpenPlayCrosses>();
	private ArrayList<GoalAssists> GoalAssistsTable = new ArrayList<GoalAssists>();
	private ArrayList<Key> KeyTable = new ArrayList<Key>();
	private ArrayList<Duels> DuelsTable = new ArrayList<Duels>();
	private ArrayList<AerialDuels> AerialDuelsTable = new ArrayList<AerialDuels>();
	private ArrayList<GroundDuels> GroundDuelsTable = new ArrayList<GroundDuels>();
	private ArrayList<Tackles> TacklesTable = new ArrayList<Tackles>();
	private ArrayList<Clearances> ClearancesTable = new ArrayList<Clearances>();
	private ArrayList<Fouls> FoulsTable = new ArrayList<Fouls>();

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

	public ArrayList<AttemptsOffTarget> getAttemptsOffTargetTable() {
		return AttemptsOffTargetTable;
	}

	public void setAttemptsOffTargetTable(ArrayList<AttemptsOffTarget> attemptsOffTargetTable) {
		AttemptsOffTargetTable = attemptsOffTargetTable;
	}

	public ArrayList<SuccessfulPasses> getSuccessfulPassesTable() {
		return SuccessfulPassesTable;
	}

	public void setSuccessfulPassesTable(ArrayList<SuccessfulPasses> successFulPassesTable) {
		SuccessfulPassesTable = successFulPassesTable;
	}

	public ArrayList<UnsuccessfulPasses> getUnsuccessfulPassesTable() {
		return UnsuccessfulPassesTable;
	}

	public void setUnsuccessfulPassesTable(
			ArrayList<UnsuccessfulPasses> unsuccessfulPassesTable) {
		UnsuccessfulPassesTable = unsuccessfulPassesTable;
	}

	public ArrayList<FlickOn> getFlickOnTable() {
		return FlickOnTable;
	}

	public void setFlickOnTable(ArrayList<FlickOn> flickOnTable) {
		FlickOnTable = flickOnTable;
	}

	public ArrayList<CrossesCorners> getCrossesCornersTable() {
		return CrossesCornersTable;
	}

	public void setCrossesCornersTable(ArrayList<CrossesCorners> crossesCornersTable) {
		CrossesCornersTable = crossesCornersTable;
	}

	public ArrayList<CornersIntoBox> getCornersIntoBoxTable() {
		return CornersIntoBoxTable;
	}

	public void setCornersIntoBoxTable(ArrayList<CornersIntoBox> cornersIntoBoxTable) {
		CornersIntoBoxTable = cornersIntoBoxTable;
	}

	public ArrayList<ThrowIn> getThrowInTable() {
		return ThrowInTable;
	}

	public void setThrowInTable(ArrayList<ThrowIn> throwInTable) {
		ThrowInTable = throwInTable;
	}

	public ArrayList<Dribbles> getDribblesTable() {
		return DribblesTable;
	}

	public void setDribblesTable(ArrayList<Dribbles> dribblesTable) {
		DribblesTable = dribblesTable;
	}

	public ArrayList<CrossesCornersLeft> getCrossesCornersLeftTable() {
		return CrossesCornersLeftTable;
	}

	public void setCrossesCornersLeftTable(ArrayList<CrossesCornersLeft> crossesCornersLeftTable) {
		CrossesCornersLeftTable = crossesCornersLeftTable;
	}

	public ArrayList<CrossesLeft> getCrossesLeftTable() {
		return CrossesLeftTable;
	}

	public void setCrossesLeftTable(ArrayList<CrossesLeft> crossesLeftTable) {
		CrossesLeftTable = crossesLeftTable;
	}

	public ArrayList<CornersLeft> getCornersLeftTable() {
		return CornersLeftTable;
	}

	public void setCornersLeftTable(ArrayList<CornersLeft> cornersLeftTable) {
		CornersLeftTable = cornersLeftTable;
	}

	public ArrayList<CrossesCornersRight> getCrossesCornersRightTable() {
		return CrossesCornersRightTable;
	}

	public void setCrossesCornersRightTable(
			ArrayList<CrossesCornersRight> crossesCornersRightTable) {
		CrossesCornersRightTable = crossesCornersRightTable;
	}

	public ArrayList<CrossesRight> getCrossesRightTable() {
		return CrossesRightTable;
	}

	public void setCrossesRightTable(ArrayList<CrossesRight> crossesRightTable) {
		CrossesRightTable = crossesRightTable;
	}

	public ArrayList<CornersRight> getCornersRightTable() {
		return CornersRightTable;
	}

	public void setCornersRightTable(ArrayList<CornersRight> cornersRightTable) {
		CornersRightTable = cornersRightTable;
	}

	public ArrayList<LongBalls> getLongBallsTable() {
		return LongBallsTable;
	}

	public void setLongBallsTable(ArrayList<LongBalls> longBallsTable) {
		LongBallsTable = longBallsTable;
	}

	public ArrayList<LayOffs> getLayOffsTable() {
		return LayOffsTable;
	}

	public void setLayOffsTable(ArrayList<LayOffs> layOffsTable) {
		LayOffsTable = layOffsTable;
	}

	public ArrayList<CrossesCornersAir> getCrossesCornersAirTable() {
		return CrossesCornersAirTable;
	}

	public void setCrossesCornersAirTable(
			ArrayList<CrossesCornersAir> crossesCornersAirTable) {
		CrossesCornersAirTable = crossesCornersAirTable;
	}

	public ArrayList<CrossesAir> getCrossesAirTable() {
		return CrossesAirTable;
	}

	public void setCrossesAirTable(ArrayList<CrossesAir> crossesAirTable) {
		CrossesAirTable = crossesAirTable;
	}

	public ArrayList<OpenPlayCrosses> getOpenPlayCrossesTable() {
		return OpenPlayCrossesTable;
	}

	public void setOpenPlayCrossesTable(ArrayList<OpenPlayCrosses> openPlayCrossesTable) {
		OpenPlayCrossesTable = openPlayCrossesTable;
	}

	public ArrayList<GoalAssists> getGoalAssistsTable() {
		return GoalAssistsTable;
	}

	public void setGoalAssistsTable(ArrayList<GoalAssists> goalAssistsTable) {
		GoalAssistsTable = goalAssistsTable;
	}

	public ArrayList<Fouls> getFoulsTable() {
		return FoulsTable;
	}

	public void setFoulsTable(ArrayList<Fouls> foulsTable) {
		FoulsTable = foulsTable;
	}

	public ArrayList<Key> getKeyTable() {
		return KeyTable;
	}

	public void setKeyTable(ArrayList<Key> keyTable) {
		KeyTable = keyTable;
	}
	
	public ArrayList<Duels> getDuelsTable() {
		return DuelsTable;
	}

	public void setDuelsTable(ArrayList<Duels> duelsTable) {
		DuelsTable = duelsTable;
	}

	public ArrayList<AerialDuels> getAerialDuelsTable() {
		return AerialDuelsTable;
	}

	public void setAerialDuelsTable(ArrayList<AerialDuels> aerialDuelsTable) {
		AerialDuelsTable = aerialDuelsTable;
	}

	public ArrayList<GroundDuels> getGroundDuelsTable() {
		return GroundDuelsTable;
	}

	public void setGroundDuelsTable(ArrayList<GroundDuels> groundDuelsTable) {
		GroundDuelsTable = groundDuelsTable;
	}
	
	public ArrayList<Tackles> getTacklesTable() {
		return TacklesTable;
	}

	public void setTacklesTable(ArrayList<Tackles> tacklesTable) {
		TacklesTable = tacklesTable;
	}

	public ArrayList<Clearances> getClearancesTable() {
		return ClearancesTable;
	}

	public void setClearancesTable(ArrayList<Clearances> clearancesTable) {
		ClearancesTable = clearancesTable;
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
	
	public void populateAttemptsOffTargetTable(int key, String dataLine) {
		ArrayList<AttemptsOffTarget> tempTable = new ArrayList<AttemptsOffTarget>();
		
		tempTable = getAttemptsOffTargetTable();
		
		AttemptsOffTarget tempObj = new AttemptsOffTarget();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setOpenPlay(Integer.parseInt(data[69]));
		tempObj.setCorners(Integer.parseInt(data[70]));
		tempObj.setThrows(Integer.parseInt(data[71]));
		tempObj.setDFKicks(Integer.parseInt(data[72]));
		tempObj.setSetPlay(Integer.parseInt(data[73]));
		tempObj.setPenalties(Integer.parseInt(data[74]));

		tempTable.add(tempObj);
		
		setAttemptsOffTargetTable(tempTable);
		
	}

	public void populateSuccessfulPassesTable(int key, String dataLine) {
		ArrayList<SuccessfulPasses> tempTable = new ArrayList<SuccessfulPasses>();
		
		tempTable = getSuccessfulPassesTable();
		
		SuccessfulPasses tempObj = new SuccessfulPasses();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setTotal(Integer.parseInt(data[76]));
		tempObj.setTECC(Integer.parseInt(data[80]));
		tempObj.setOwnHalf(Integer.parseInt(data[82]));
		tempObj.setOppHalf(Integer.parseInt(data[84]));
		tempObj.setDefensiveThird(Integer.parseInt(data[86]));
		tempObj.setMiddleThird(Integer.parseInt(data[88]));
		tempObj.setFinalThird(Integer.parseInt(data[90]));
		tempObj.setShortPasses(Integer.parseInt(data[92]));
		tempObj.setLongPasses(Integer.parseInt(data[94]));
		
		tempTable.add(tempObj);
		
		setSuccessfulPassesTable(tempTable);
		
	}
	
	public void populateUnsuccessfulPassesTable(int key, String dataLine) {
		ArrayList<UnsuccessfulPasses> tempTable = new ArrayList<UnsuccessfulPasses>();
		
		tempTable = getUnsuccessfulPassesTable();
		
		UnsuccessfulPasses tempObj = new UnsuccessfulPasses();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setTotal(Integer.parseInt(data[77]));
		tempObj.setTECC(Integer.parseInt(data[81]));
		tempObj.setOwnHalf(Integer.parseInt(data[83]));
		tempObj.setOppHalf(Integer.parseInt(data[85]));
		tempObj.setDefensiveThird(Integer.parseInt(data[87]));
		tempObj.setMiddleThird(Integer.parseInt(data[89]));
		tempObj.setFinalThird(Integer.parseInt(data[91]));
		tempObj.setShortPasses(Integer.parseInt(data[93]));
		tempObj.setLongPasses(Integer.parseInt(data[95]));
		
		tempTable.add(tempObj);
		
		setUnsuccessfulPassesTable(tempTable);
		
	}

	public void populateFlickOnTable(int key, String dataLine) {
		ArrayList<FlickOn> tempTable = new ArrayList<FlickOn>();
		
		tempTable = getFlickOnTable();
		
		FlickOn tempObj = new FlickOn();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[96]));
		tempObj.setUnsuccessful(Integer.parseInt(data[97]));
		
		tempTable.add(tempObj);
		
		setFlickOnTable(tempTable);	
		
	}

	public void populateCrossesCornersTable(int key, String dataLine) {
		ArrayList<CrossesCorners> tempTable = new ArrayList<CrossesCorners>();
		
		tempTable = getCrossesCornersTable();
		
		CrossesCorners tempObj = new CrossesCorners();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[98]));
		tempObj.setUnsuccessful(Integer.parseInt(data[99]));
		
		tempTable.add(tempObj);
		
		setCrossesCornersTable(tempTable);
		
	}
	

	public void populateCornersIntoBoxTable(int key, String dataLine) {
		ArrayList<CornersIntoBox> tempTable = new ArrayList<CornersIntoBox>();
		
		tempTable = getCornersIntoBoxTable();
		
		CornersIntoBox tempObj = new CornersIntoBox();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[102]));
		tempObj.setUnsuccessful(Integer.parseInt(data[103]));
		
		tempTable.add(tempObj);
		
		setCornersIntoBoxTable(tempTable);
		
	}

	public void populateThrowInTable(int key, String dataLine) {
		ArrayList<ThrowIn> tempTable = new ArrayList<ThrowIn>();
		
		tempTable = getThrowInTable();
		
		ThrowIn tempObj = new ThrowIn();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setOwnPlayer(Integer.parseInt(data[105]));
		tempObj.setOppPlayer(Integer.parseInt(data[106]));
		
		tempTable.add(tempObj);
		
		setThrowInTable(tempTable);
		
	}

	public void populateDribblesTable(int key, String dataLine) {
		ArrayList<Dribbles> tempTable = new ArrayList<Dribbles>();
		
		tempTable = getDribblesTable();
		
		Dribbles tempObj = new Dribbles();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[107]));
		tempObj.setUnsuccessful(Integer.parseInt(data[108]));
		
		tempTable.add(tempObj);
		
		setDribblesTable(tempTable);
		
	}

	public void populateCrossesCornersLeftTable(int key, String dataLine) {
		ArrayList<CrossesCornersLeft> tempTable = new ArrayList<CrossesCornersLeft>();
		
		tempTable = getCrossesCornersLeftTable();
		
		CrossesCornersLeft tempObj = new CrossesCornersLeft();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[109]));
		tempObj.setUnsuccessful(Integer.parseInt(data[110]));
		
		tempTable.add(tempObj);
		
		setCrossesCornersLeftTable(tempTable);
		
	}

	public void populateCrossesLeftTable(int key, String dataLine) {
		ArrayList<CrossesLeft> tempTable = new ArrayList<CrossesLeft>();
		
		tempTable = getCrossesLeftTable();
		
		CrossesLeft tempObj = new CrossesLeft();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[111]));
		tempObj.setUnsuccessful(Integer.parseInt(data[112]));
		
		tempTable.add(tempObj);
		
		setCrossesLeftTable(tempTable);
		
	}

	public void populateCornersLeftTable(int key, String dataLine) {
		ArrayList<CornersLeft> tempTable = new ArrayList<CornersLeft>();
		
		tempTable = getCornersLeftTable();
		
		CornersLeft tempObj = new CornersLeft();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[113]));
		tempObj.setUnsuccessful(Integer.parseInt(data[114]));
		
		tempTable.add(tempObj);
		
		setCornersLeftTable(tempTable);
		
	}
	
	public void populateCrossesCornersRightTable(int key, String dataLine) {
		ArrayList<CrossesCornersRight> tempTable = new ArrayList<CrossesCornersRight>();
		
		tempTable = getCrossesCornersRightTable();
		
		CrossesCornersRight tempObj = new CrossesCornersRight();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[115]));
		tempObj.setUnsuccessful(Integer.parseInt(data[116]));
		
		tempTable.add(tempObj);
		
		setCrossesCornersRightTable(tempTable);
		
	}

	public void populateCrossesRightTable(int key, String dataLine) {
		ArrayList<CrossesRight> tempTable = new ArrayList<CrossesRight>();
		
		tempTable = getCrossesRightTable();
		
		CrossesRight tempObj = new CrossesRight();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[117]));
		tempObj.setUnsuccessful(Integer.parseInt(data[118]));
		
		tempTable.add(tempObj);
		
		setCrossesRightTable(tempTable);
		
	}

	public void populateCornersRightTable(int key, String dataLine) {
		ArrayList<CornersRight> tempTable = new ArrayList<CornersRight>();
		
		tempTable = getCornersRightTable();
		
		CornersRight tempObj = new CornersRight();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[119]));
		tempObj.setUnsuccessful(Integer.parseInt(data[120]));
		
		tempTable.add(tempObj);
		
		setCornersRightTable(tempTable);
		
	}
	

	public void populateLongBallsTable(int key, String dataLine) {
		ArrayList<LongBalls> tempTable = new ArrayList<LongBalls>();
		
		tempTable = getLongBallsTable();
		
		LongBalls tempObj = new LongBalls();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[121]));
		tempObj.setUnsuccessful(Integer.parseInt(data[122]));
		
		tempTable.add(tempObj);
		
		setLongBallsTable(tempTable);
		
	}

	public void populateLayOffsTable(int key, String dataLine) {
		ArrayList<LayOffs> tempTable = new ArrayList<LayOffs>();
		
		tempTable = getLayOffsTable();
		
		LayOffs tempObj = new LayOffs();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[123]));
		tempObj.setUnsuccessful(Integer.parseInt(data[124]));
		
		tempTable.add(tempObj);
		
		setLayOffsTable(tempTable);
		
	}
	
	public void populateCrossesCornersAirTable(int key, String dataLine) {
		ArrayList<CrossesCornersAir> tempTable = new ArrayList<CrossesCornersAir>();
		
		tempTable = getCrossesCornersAirTable();
		
		CrossesCornersAir tempObj = new CrossesCornersAir();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[126]));
		tempObj.setUnsuccessful(Integer.parseInt(data[127]));
		
		tempTable.add(tempObj);
		
		setCrossesCornersAirTable(tempTable);
		
	}

	public void populateCrossesAirTable(int key, String dataLine) {
		ArrayList<CrossesAir> tempTable = new ArrayList<CrossesAir>();
		
		tempTable = getCrossesAirTable();
		
		CrossesAir tempObj = new CrossesAir();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[128]));
		tempObj.setUnsuccessful(Integer.parseInt(data[129]));
		
		tempTable.add(tempObj);
		
		setCrossesAirTable(tempTable);
		
	}

	public void populateOpenPlayCorsses(int key, String dataLine) {
		ArrayList<OpenPlayCrosses> tempTable = new ArrayList<OpenPlayCrosses>();
		
		tempTable = getOpenPlayCrossesTable();
		
		OpenPlayCrosses tempObj = new OpenPlayCrosses();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setSuccessful(Integer.parseInt(data[130]));
		tempObj.setUnsuccessful(Integer.parseInt(data[131]));
		
		tempTable.add(tempObj);
		
		setOpenPlayCrossesTable(tempTable);		
	}

	public void populateGoalAssistsTable(int key, String dataLine) {
		ArrayList<GoalAssists> tempTable = new ArrayList<GoalAssists>();
		
		tempTable = getGoalAssistsTable();
		
		GoalAssists tempObj = new GoalAssists();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setCorner(Integer.parseInt(data[133]));
		tempObj.setFreeKick(Integer.parseInt(data[134]));
		tempObj.setThrowIn(Integer.parseInt(data[135]));
		tempObj.setGoalKick(Integer.parseInt(data[136]));
		tempObj.setSetPiece(Integer.parseInt(data[137]));
		
		tempTable.add(tempObj);
		
		setGoalAssistsTable(tempTable);
		
	}

	public void populateKeyTable(int key, String dataLine) {
		ArrayList<Key> tempTable = new ArrayList<Key>();
		
		tempTable = getKeyTable();
		
		Key tempObj = new Key();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setCorner(Integer.parseInt(data[138]));
		tempObj.setFreeKick(Integer.parseInt(data[139]));
		tempObj.setThrowIn(Integer.parseInt(data[140]));
		tempObj.setGoalKick(Integer.parseInt(data[141]));
		tempObj.setSetPiece(Integer.parseInt(data[142]));
		
		tempTable.add(tempObj);
		
		setKeyTable(tempTable);
		
	}
	

	public void populateDuelsTable(int key, String dataLine) {
		ArrayList<Duels> tempTable = new ArrayList<Duels>();
		
		tempTable = getDuelsTable();
		
		Duels tempObj = new Duels();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setWon(Integer.parseInt(data[143]));
		tempObj.setLost(Integer.parseInt(data[144]));
		
		tempTable.add(tempObj);
		
		setDuelsTable(tempTable);	
		
	}

	public void populateAerialDuelsTable(int key, String dataLine) {
		ArrayList<AerialDuels> tempTable = new ArrayList<AerialDuels>();
		
		tempTable = getAerialDuelsTable();
		
		AerialDuels tempObj = new AerialDuels();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setWon(Integer.parseInt(data[145]));
		tempObj.setLost(Integer.parseInt(data[146]));
		
		tempTable.add(tempObj);
		
		setAerialDuelsTable(tempTable);
	}

	public void populateGroundDuelsTable(int key, String dataLine) {
		ArrayList<GroundDuels> tempTable = new ArrayList<GroundDuels>();
		
		tempTable = getGroundDuelsTable();
		
		GroundDuels tempObj = new GroundDuels();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setWon(Integer.parseInt(data[147]));
		tempObj.setLost(Integer.parseInt(data[148]));
		
		tempTable.add(tempObj);
		
		setGroundDuelsTable(tempTable);
		
	}

	public void populateTacklesTable(int key, String dataLine) {
		ArrayList<Tackles> tempTable = new ArrayList<Tackles>();
		
		tempTable = getTacklesTable();
		
		Tackles tempObj = new Tackles();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setWon(Integer.parseInt(data[149]));
		tempObj.setLost(Integer.parseInt(data[150]));
		
		tempTable.add(tempObj);
		
		setTacklesTable(tempTable);		
	}
	

	public void popuateClearancesTable(int key, String dataLine) {
		ArrayList<Clearances> tempTable = new ArrayList<Clearances>();
		
		tempTable = getClearancesTable();
		
		Clearances tempObj = new Clearances();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setTotal(Integer.parseInt(data[152]));
		tempObj.setHeaded(Integer.parseInt(data[153]));
		tempObj.setOther(Integer.parseInt(data[154]));
		tempObj.setOffLine(Integer.parseInt(data[155]));
		
		tempTable.add(tempObj);
		
		setClearancesTable(tempTable);
		
	}

	public void populateFoulsTable(int key, String dataLine) {
		ArrayList<Fouls> tempTable = new ArrayList<Fouls>();
		
		tempTable = getFoulsTable();
		
		Fouls tempObj = new Fouls();
		
		String[] data = dataLine.split(",");
		
		tempObj.setID(key);
		tempObj.setConceded(Integer.parseInt(data[159]));
		tempObj.setCEHP(Integer.parseInt(data[160]));
		tempObj.setWon(Integer.parseInt(data[161]));
		tempObj.setWonInDangerArea(Integer.parseInt(data[162]));
		tempObj.setWonOutDangerArea(Integer.parseInt(data[163]));
		tempObj.setWonPenalty(Integer.parseInt(data[164]));
		
		tempTable.add(tempObj);
		
		setFoulsTable(tempTable);
		
	}

}
