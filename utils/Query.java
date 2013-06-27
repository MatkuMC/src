package utils;
import java.util.ArrayList;

import DataObjects.*;


public class Query {
	
	private String dbname;
	
	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	
	public Query(String dbName) {
		setDbname(dbName);
	}

	public String getColumnNames(String tableHeaders){
		String colNames ="";
		String[] headers = tableHeaders.split(",");
		
		for(String header: headers){
			colNames = colNames + "`" + header + "`,";
		}
		
		//remove the last comma
		colNames = colNames.substring(0, colNames.length() - 1);
		
		return colNames;
	}
	
	public String getTeamInsertSQL(ArrayList<Teams> TeamsTable){
		
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Teams` (" + getColumnNames(TeamsTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Teams team : TeamsTable){
			Values = Values + "(" + "'" + team.getTeamID() + "'," + "'" + team.getTeamName() + "'" + ",'" + team.getOptaTeamID() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getPlayerInsertSQL(ArrayList<Players> PlayersTable){
		
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Players` (" + getColumnNames(PlayersTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Players player : PlayersTable){
			Values = Values + "(" + "'" + player.getPlayerID() + "'," + "'" + player.getSurname() + "'" + ",'" + player.getForename() + "'," 
								+ "'" + player.getTeamID() + "'," + "'" + player.getOptaPlayerID() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getMatchesInsertSQL(ArrayList<Matches> MatchesTable){
		
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Matches` (" + getColumnNames(MatchesTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Matches match : MatchesTable){
			Values = Values + "(" + "'" + match.getMatchID() + "'," + "'" + match.getDate() + "'" + ",'" + match.getTeamID1() + "'," 
								+ "'" + match.getTeamID2() + "'," + "'" + match.getVenue() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getPlayerMatchesInsertSQL(ArrayList<PlayerMatches> PlayerMatchesTable){
		
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`PlayerMatches` (" + getColumnNames(PlayerMatchesTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (PlayerMatches playermatch : PlayerMatchesTable){
			Values = Values + "(" + "'" + playermatch.getID() + "'," + "'" + playermatch.getMatchID() + "'" + ",'" + playermatch.getPlayerID() + "')" + ",";
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}

	public String getPenaltiesInsertSQL(ArrayList<Penalties> PenaltiesTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Penalties` (" + getColumnNames(PenaltiesTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Penalties penalty : PenaltiesTable){
			Values = Values + "(" + "'" + penalty.getID() + "','" + penalty.getTaken() + "','" + penalty.getGoals() + "','" 
								 + penalty.getSaved() + "','" + penalty.getOffTarget() + "','" + penalty.getNotScored() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}

	public String getDFKicksInsertSQL(ArrayList<DirectFreeKicks> DFKicksTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`DirectFreeKicks` (" + getColumnNames(DFKicksTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (DirectFreeKicks dfkick : DFKicksTable){
			Values = Values + "(" + "'" + dfkick.getID() + "','" + dfkick.getGoals() + "','" + dfkick.getOnTarget() + "','" + dfkick.getOffTarget() 
					+ "','" + dfkick.getBlocked() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}

	public String getInsideBoxInsertSQL(ArrayList<InsideBox> InsideBoxTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`InsideBox` (" + getColumnNames(InsideBoxTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (InsideBox ibox : InsideBoxTable){
			Values = Values + "(" + "'" + ibox.getID() + "','" + ibox.getGoals() + "','" + ibox.getShotsOn() + "','" + ibox.getShotsOff() 
					+ "','" + ibox.getBlocked() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getOutsideBoxInsertSQL(ArrayList<OutsideBox> OutsideBoxTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`OutsideBox` (" + getColumnNames(OutsideBoxTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (OutsideBox obox : OutsideBoxTable){
			Values = Values + "(" + "'" + obox.getID() + "','" + obox.getGoals() + "','" + obox.getShotsOn() + "','" + obox.getShotsOff() 
					+ "','" + obox.getBlocked() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getHeadedInsertSQL(ArrayList<Headed> HeadedTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Headed` (" + getColumnNames(HeadedTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Headed head : HeadedTable){
			Values = Values + "(" + "'" + head.getID() + "','" + head.getGoals() + "','" + head.getShotsOn() + "','" + head.getShotsOff() 
					+ "','" + head.getBlocked() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getLeftFootInsertSQL(ArrayList<LeftFoot> LeftFootTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`LeftFoot` (" + getColumnNames(LeftFootTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (LeftFoot lf : LeftFootTable){
			Values = Values + "(" + "'" + lf.getID() + "','" + lf.getGoals() + "','" + lf.getShotsOn() + "','" + lf.getShotsOff() 
					+ "','" + lf.getBlocked() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getRightFootInsertSQL(ArrayList<RightFoot> RightFootTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`RightFoot` (" + getColumnNames(RightFootTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (RightFoot rf : RightFootTable){
			Values = Values + "(" + "'" + rf.getID() + "','" + rf.getGoals() + "','" + rf.getShotsOn() + "','" + rf.getShotsOff() 
					+ "','" + rf.getBlocked() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getOtherInsertSQL(ArrayList<Other> OtherTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Other` (" + getColumnNames(OtherTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Other oth : OtherTable){
			Values = Values + "(" + "'" + oth.getID() + "','" + oth.getGoals() + "','" + oth.getShotsOn() + "','" + oth.getShotsOff() 
					+ "','" + oth.getBlocked() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
		
	}
	
	public String getShotsClearedInsertSQL(ArrayList<ShotsCleared> ShotsClearedTable){
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`ShotsCleared` (" + getColumnNames(ShotsClearedTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (ShotsCleared sc : ShotsClearedTable){
			Values = Values + "(" + "'" + sc.getID() + "','" + sc.getOffLine() + "','" + sc.getOffLineInsideArea() 
					+ "','" + sc.getOffLineOutsideArea() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}

	public String getGoalsInsertSQL(ArrayList<Goals> GoalsTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Goals` (" + getColumnNames(GoalsTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Goals goal : GoalsTable){
			Values = Values + "(" + "'" + goal.getID() + "','" + goal.getOpenPlay() + "','" + goal.getCorners()
					+ "','" + goal.getThrows() + "','" + goal.getDFKicks() + "','" + goal.getSetPlay() + "','" + goal.getPenalties() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getAttemptsOnTargetInsertSQL(ArrayList<AttemptsOnTarget> AttemptsOnTargetTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`AttemptsOnTarget` (" + getColumnNames(AttemptsOnTargetTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (AttemptsOnTarget aot : AttemptsOnTargetTable){
			Values = Values + "(" + "'" + aot.getID() + "','" + aot.getOpenPlay() + "','" + aot.getCorners()
					+ "','" + aot.getThrows() + "','" + aot.getDFKicks() + "','" + aot.getSetPlay() + "','" + aot.getPenalties() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getAttemptsOffTargetInsertSQL(ArrayList<AttemptsOffTarget> AttemptsOffTargetTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`AttemptsOffTarget` (" + getColumnNames(AttemptsOffTargetTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (AttemptsOffTarget aot : AttemptsOffTargetTable){
			Values = Values + "(" + "'" + aot.getID() + "','" + aot.getOpenPlay() + "','" + aot.getCorners()
					+ "','" + aot.getThrows() + "','" + aot.getDFKicks() + "','" + aot.getSetPlay() + "','" + aot.getPenalties() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getSuccessfulPassesInsertSQL(ArrayList<SuccessfulPasses> SuccessfulPassesTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`SuccessfulPasses` (" + getColumnNames(SuccessfulPassesTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (SuccessfulPasses sp : SuccessfulPassesTable){
			Values = Values + "(" + "'" + sp.getID() + "','" + sp.getTotal() + "','" + sp.getTECC()
					+ "','" + sp.getOwnHalf() + "','" + sp.getOppHalf() + "','" + sp.getDefensiveThird() + "','" + sp.getMiddleThird()
					+ "','" + sp.getFinalThird() + "','" + sp.getShortPasses() + "','" + sp.getLongPasses() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getUnsuccessfulPassesInsertSQL(ArrayList<UnsuccessfulPasses> UnsuccessfulPassesTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`UnsuccessfulPasses` (" + getColumnNames(UnsuccessfulPassesTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (UnsuccessfulPasses usp : UnsuccessfulPassesTable){
			Values = Values + "(" + "'" + usp.getID() + "','" + usp.getTotal() + "','" + usp.getTECC()
					+ "','" + usp.getOwnHalf() + "','" + usp.getOppHalf() + "','" + usp.getDefensiveThird() + "','" + usp.getMiddleThird()
					+ "','" + usp.getFinalThird() + "','" + usp.getShortPasses() + "','" + usp.getLongPasses() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getFlickOnInsertSQL(ArrayList<FlickOn> FlickOnTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`FlickOn` (" + getColumnNames(FlickOnTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (FlickOn fo : FlickOnTable){
			Values = Values + "(" + "'" + fo.getID() + "','" + fo.getSuccessful()+ "','" + fo.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCrossesCornersInsertSQL(ArrayList<CrossesCorners> CrossesCornersTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CrossesCorners` (" + getColumnNames(CrossesCornersTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CrossesCorners cc : CrossesCornersTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCornersIntoBoxInsertSQL(ArrayList<CornersIntoBox> CornersIntoBoxTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CornersIntoBox` (" + getColumnNames(CornersIntoBoxTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CornersIntoBox cc : CornersIntoBoxTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getThrowInInsertSQL(ArrayList<ThrowIn> ThrowInTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`ThrowIn` (" + getColumnNames(ThrowInTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (ThrowIn ti : ThrowInTable){
			Values = Values + "(" + "'" + ti.getID() + "','" + ti.getOwnPlayer() + "','" + ti.getOppPlayer() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getDribblesTable(ArrayList<Dribbles> DribblesTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`Dribbles` (" + getColumnNames(DribblesTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (Dribbles cc : DribblesTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCrossesCornersLeftTable(ArrayList<CrossesCornersLeft> CrossesCornersLeftTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CrossesCornersLeft` (" + getColumnNames(CrossesCornersLeftTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CrossesCornersLeft cc : CrossesCornersLeftTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCrossesLeftTable(ArrayList<CrossesLeft> CrossesLeftTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CrossesLeft` (" + getColumnNames(CrossesLeftTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CrossesLeft cc : CrossesLeftTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCornersLeftTable(ArrayList<CornersLeft> CornersLeftTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CornersLeft` (" + getColumnNames(CornersLeftTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CornersLeft cc : CornersLeftTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCrossesCornersRightTable(ArrayList<CrossesCornersRight> CrossesCornersRightTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CrossesCornersRight` (" + getColumnNames(CrossesCornersRightTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CrossesCornersRight cc : CrossesCornersRightTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCrossesRightTable(ArrayList<CrossesRight> CrossesRightTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CrossesRight` (" + getColumnNames(CrossesRightTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CrossesRight cc : CrossesRightTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCornersRightTable(ArrayList<CornersRight> CornersRightTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CornersRight` (" + getColumnNames(CornersRightTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CornersRight cc : CornersRightTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getLongBallsTable(ArrayList<LongBalls> LongBallsTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`LongBalls` (" + getColumnNames(LongBallsTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (LongBalls cc : LongBallsTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getLayOffsTable(ArrayList<LayOffs> LayOffsTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`LayOffs` (" + getColumnNames(LayOffsTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (LayOffs cc : LayOffsTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCrossesCornersAirTable(ArrayList<CrossesCornersAir> CrossesCornersAirTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CrossesCornersAir` (" + getColumnNames(CrossesCornersAirTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CrossesCornersAir cc : CrossesCornersAirTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}
	
	public String getCrossesAirTable(ArrayList<CrossesAir> CrossesAirTable) {
		String InsertSQL = "INSERT INTO " + "`" + getDbname() + "`.`CrossesAir` (" + getColumnNames(CrossesAirTable.get(0).TableHeaders) + ")";
		
		String Values  = " VALUES ";
		
		for (CrossesAir cc : CrossesAirTable){
			Values = Values + "(" + "'" + cc.getID() + "','" + cc.getSuccessful()+ "','" + cc.getUnsuccessful() + "')" + ",";	
		}
		
		Values = Values.substring(0, Values.length() - 1);
		
		InsertSQL = InsertSQL + Values + ";";
		
		return InsertSQL;
	}


}
