package utils;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import DataObjects.*;


public class FileReader {
	
	private ArrayList<String> Headers = new ArrayList<String>();
	
	// Key Tables
	private ArrayList<Teams> TeamsTable = new ArrayList<Teams>();
	private ArrayList<Players> PlayersTable = new ArrayList<Players>();
	private ArrayList<Matches> MatchesTable = new ArrayList<Matches>();
	private ArrayList<PlayerMatches> PlayerMatchesTable = new ArrayList<PlayerMatches>();
	
	//Data Tables
	private ArrayList<Penalties> PenaltiesTable = new ArrayList<Penalties>();
	private ArrayList<DirectFreeKicks> DFKicksTable = new ArrayList<DirectFreeKicks>();
	private ArrayList<InsideBox> InsideBoxTable = new ArrayList<InsideBox>();
	private ArrayList<OutsideBox> OutsideBoxTable = new ArrayList<OutsideBox>();
	private ArrayList<Headed> HeadedTable = new ArrayList<Headed>();
	private ArrayList<LeftFoot> LeftFootTable = new ArrayList<LeftFoot>();
	private ArrayList<RightFoot> RightFootTable = new ArrayList<RightFoot>();
	private ArrayList<Other> OtherTable = new ArrayList<Other>();
	private ArrayList<ShotsCleared> ShotsClearedTable = new ArrayList<ShotsCleared>();
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
	
	public ArrayList<String> getHeaders() {
		return Headers;
	}

	public void setHeaders(ArrayList<String> headers) {
		Headers = headers;
	}
	
	public ArrayList<Teams> getTeamsTable() {
		return TeamsTable;
	}

	public void setTeamsTable(ArrayList<Teams> teamsTable) {
		TeamsTable = teamsTable;
	}

	public ArrayList<Players> getPlayersTable() {
		return PlayersTable;
	}

	public void setPlayersTable(ArrayList<Players> playersTable) {
		PlayersTable = playersTable;
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

	public void setUnsuccessfulPassesTable(ArrayList<UnsuccessfulPasses> unsuccessfulPassesTable) {
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
	
	public ArrayList<CornersLeft> getCornersLeftTable() {
		return CornersLeftTable;
	}

	public void setCornersLeftTable(ArrayList<CornersLeft> cornersLeftTable) {
		CornersLeftTable = cornersLeftTable;
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

	public ArrayList<Fouls> getFoulsTable() {
		return FoulsTable;
	}

	public void setFoulsTable(ArrayList<Fouls> foulsTable) {
		FoulsTable = foulsTable;
	}

	public enum ReadType {
		Team, Player, Matches;
	}
	
	public void readHeaderFile(String fileLocation){
		ArrayList<String> tempHeaders = new ArrayList<String>();
		
		try {
			FileInputStream fstream = new FileInputStream(fileLocation);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			
			while ((strLine = br.readLine()) != null) {
				tempHeaders.add(strLine.trim());
			}
			
			in.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setHeaders(tempHeaders);
	}
	
	public void readDataFile(String fileLocation, ReadType rt){
		try {
			FileInputStream fstream = new FileInputStream(fileLocation);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			
			KeyData dataObj = new KeyData();
			
			//Read the first line in as this is the headers line...
			br.readLine();
			
			while ((strLine = br.readLine()) != null) {
				strLine.trim();
				// TODO - Could speed up by reading the two in the same pass..
				if(rt == ReadType.Team) dataObj.addTeamData(strLine);
				if(rt == ReadType.Player) dataObj.addPlayersData(strLine, getTeamsTable());
				if(rt == ReadType.Matches) dataObj.addMatchesData(strLine, getTeamsTable(), getPlayersTable());
			}
			
			in.close();
			
			if(rt == ReadType.Team) setTeamsTable(dataObj.getTeamsTable());
			if(rt == ReadType.Player) setPlayersTable(dataObj.getPlayersTable());
			if(rt == ReadType.Matches) {
				setMatchesTable(dataObj.getMatchesTable());
				setPlayerMatchesTable(dataObj.getPlayerMatchesTable());
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void readDataTables(String fileLocation) {
		
		try {
			FileInputStream fstream = new FileInputStream(fileLocation);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			
			//Do not read the header line.
			br.readLine();
			
			ActualData dataObj = new ActualData();
			
			while ((strLine = br.readLine()) != null) {
				int key = dataObj.getKey(getMatchesTable(), getPlayersTable(), getTeamsTable(), strLine);
				
				dataObj.populatePenaltiesTable(key, strLine.trim());
				dataObj.populateDFKicksTable(key, strLine.trim());
				dataObj.populateInsideBoxTable(key, strLine.trim());
				dataObj.populateOutsideBoxTable(key, strLine.trim());
				dataObj.populateHeadedTable(key,strLine.trim());
				dataObj.populateLeftFootTable(key, strLine.trim());
				dataObj.populateRightFootTable(key,strLine.trim());
				dataObj.populateOtherTable(key, strLine.trim());
				dataObj.populateShotsClearedTable(key, strLine.trim());
				dataObj.populateGoalsTable(key, strLine.trim());
				dataObj.populateAttemptsOnTargetTable(key, strLine.trim());
				dataObj.populateAttemptsOffTargetTable(key, strLine.trim());
				dataObj.populateSuccessfulPassesTable(key, strLine.trim());
				dataObj.populateUnsuccessfulPassesTable(key, strLine.trim());
				dataObj.populateFlickOnTable(key, strLine.trim());
				dataObj.populateCrossesCornersTable(key,strLine.trim());
				dataObj.populateCornersIntoBoxTable(key,strLine.trim());
				dataObj.populateThrowInTable(key, strLine.trim());
				dataObj.populateDribblesTable(key, strLine.trim());
				dataObj.populateCrossesCornersLeftTable(key, strLine.trim());
				dataObj.populateCrossesLeftTable(key, strLine.trim());
				dataObj.populateCornersLeftTable(key, strLine.trim());
				dataObj.populateCrossesCornersRightTable(key, strLine.trim());
				dataObj.populateCrossesRightTable(key, strLine.trim());
				dataObj.populateCornersRightTable(key, strLine.trim());
				dataObj.populateLongBallsTable(key, strLine.trim());
				dataObj.populateLayOffsTable(key, strLine.trim());
				dataObj.populateCrossesCornersAirTable(key, strLine.trim());
				dataObj.populateCrossesAirTable(key, strLine.trim());
				dataObj.populateOpenPlayCorsses(key, strLine.trim());
				dataObj.populateGoalAssistsTable(key, strLine.trim());
				dataObj.populateKeyTable(key, strLine.trim());
				dataObj.populateDuelsTable(key, strLine.trim());
				dataObj.populateAerialDuelsTable(key, strLine.trim());
				dataObj.populateGroundDuelsTable(key, strLine.trim());
				dataObj.populateTacklesTable(key, strLine.trim());
				dataObj.popuateClearancesTable(key, strLine.trim());
				dataObj.populateFoulsTable(key, strLine.trim());
			}
			
			in.close();
			
			setPenaltiesTable(dataObj.getPenaltiesTable());
			setDFKicksTable(dataObj.getDFKicksTable());
			setInsideBoxTable(dataObj.getInsideBoxTable());
			setOutsideBoxTable(dataObj.getOutsideBoxTable());
			setHeadedTable(dataObj.getHeadedTable());
			setLeftFootTable(dataObj.getLeftFootTable());
			setRightFootTable(dataObj.getRightFootTable());
			setOtherTable(dataObj.getOtherTable());
			setShotsClearedTable(dataObj.getShotsClearedTable());
			setGoalsTable(dataObj.getGoalsTable());
			setAttemptsOnTargetTable(dataObj.getAttemptsOnTargetTable());
			setAttemptsOffTargetTable(dataObj.getAttemptsOffTargetTable());
			setSuccessfulPassesTable(dataObj.getSuccessfulPassesTable());
			setUnsuccessfulPassesTable(dataObj.getUnsuccessfulPassesTable());
			setFlickOnTable(dataObj.getFlickOnTable());
			setCrossesCornersTable(dataObj.getCrossesCornersTable());
			setCornersIntoBoxTable(dataObj.getCornersIntoBoxTable());
			setThrowInTable(dataObj.getThrowInTable());
			setDribblesTable(dataObj.getDribblesTable());
			setCrossesCornersLeftTable(dataObj.getCrossesCornersLeftTable());
			setCrossesLeftTable(dataObj.getCrossesLeftTable());
			setCornersLeftTable(dataObj.getCornersLeftTable());
			setCrossesCornersRightTable(dataObj.getCrossesCornersRightTable());
			setCrossesRightTable(dataObj.getCrossesRightTable());
			setCornersRightTable(dataObj.getCornersRightTable());
			setLongBallsTable(dataObj.getLongBallsTable());
			setLayOffsTable(dataObj.getLayOffsTable());
			setCrossesCornersAirTable(dataObj.getCrossesCornersAirTable());
			setCrossesAirTable(dataObj.getCrossesAirTable());
			setOpenPlayCrossesTable(dataObj.getOpenPlayCrossesTable());
			setGoalAssistsTable(dataObj.getGoalAssistsTable());
			setKeyTable(dataObj.getKeyTable());
			setDuelsTable(dataObj.getDuelsTable());
			setAerialDuelsTable(dataObj.getAerialDuelsTable());
			setGroundDuelsTable(dataObj.getGroundDuelsTable());
			setTacklesTable(dataObj.getTacklesTable());
			setClearancesTable(dataObj.getClearancesTable());
			setFoulsTable(dataObj.getFoulsTable());
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



}
