package main;


import utils.DBConnector;
import utils.FileReader;
import utils.FileReader.ReadType;
import utils.Query;


public class MainSystem {

	/**
	 * @param args
	 */
	public static final String DataFileLocation = "/Users/kritarthsaurabh/Documents/MScProject/OptaData.csv";
	public static final String HeaderFileLocation = "/Users/kritarthsaurabh/Documents/MScProject/Headers.txt";
	public static final String dbName = "testdb";
	public static final String userName = "root";
	public static final String password = "root";
	
	public static void main(String[] args) {
		
		FileReader fileObj = new FileReader();
		
		boolean run = false;
		
		//fileObj.readHeaderFile(HeaderFileLocation);
		
		//Read in Key Tables
		fileObj.readDataFile(DataFileLocation, ReadType.Team);
		
		fileObj.readDataFile(DataFileLocation, ReadType.Player);
		
		fileObj.readDataFile(DataFileLocation, ReadType.Matches);
		
		//Create the Insert SQL from ArrayList
		Query queryObj = new Query(dbName);
			
		DBConnector dbObj = new DBConnector(dbName,userName,password);
		
		// Insert the Key Tables
		if(run) {
			//Insert Teams
			dbObj.RunSQLInsert(queryObj.getTeamInsertSQL(fileObj.getTeamsTable()));
			
			System.out.println("Completed Insert of Teams Table...");
			
			//Insert Players
			dbObj.RunSQLInsert(queryObj.getPlayerInsertSQL(fileObj.getPlayersTable()));
			
			System.out.println("Completed Insert of Players Table...");
			
			//Insert Matches
			dbObj.RunSQLInsert(queryObj.getMatchesInsertSQL(fileObj.getMatchesTable()));
			
			System.out.println("Completed Insert of Matches Table...");
			
			//Insert PlayerMatches
			dbObj.RunSQLInsert(queryObj.getPlayerMatchesInsertSQL(fileObj.getPlayerMatchesTable()));
			
			System.out.println("Completed Insert of PlayerMatches Table...");
			
			//Insert Positions
			dbObj.RunSQLInsert(queryObj.getPositionsInsertSQL(fileObj.getPositionsTable()));
			
			System.out.println("Completed Insert of Positions Table...");
		}
		
		// Read in Data Tables...
		fileObj.readDataTables(DataFileLocation);
		
		if(run){

			//Insert Match Info Table
			dbObj.RunSQLInsert(queryObj.getMatchInfoTableInsertSQL(fileObj.getMatchInfoTable()));
			
			System.out.println("Completed Insert of Match Info Table...");
			
			//Insert Penalties Table
			dbObj.RunSQLInsert(queryObj.getPenaltiesInsertSQL(fileObj.getPenaltiesTable()));
		
			System.out.println("Completed Insert of Penalties Table...");
			
			//Insert DFKicks Table
			dbObj.RunSQLInsert(queryObj.getDFKicksInsertSQL(fileObj.getDFKicksTable()));
			
			System.out.println("Completed Insert of Direct Free Kicks Table...");
			
			//Insert InsideBox Table
			dbObj.RunSQLInsert(queryObj.getInsideBoxInsertSQL(fileObj.getInsideBoxTable()));
			
			System.out.println("Completed Insert of InsideBox Table...");
			
			//Insert OutSideBox Table
			dbObj.RunSQLInsert(queryObj.getOutsideBoxInsertSQL(fileObj.getOutsideBoxTable()));
			
			System.out.println("Completed Insert of OutsideBox Table...");
			
			//Insert Headed Table
			dbObj.RunSQLInsert(queryObj.getHeadedInsertSQL(fileObj.getHeadedTable()));
			
			System.out.println("Completed Insert of Headed Table...");
			
			//Insert LeftFoot Table
			dbObj.RunSQLInsert(queryObj.getLeftFootInsertSQL(fileObj.getLeftFootTable()));
			
			System.out.println("Completed Insert of LeftFoot Table...");
			
			//Insert RightFoot Table
			dbObj.RunSQLInsert(queryObj.getRightFootInsertSQL(fileObj.getRightFootTable()));
			
			System.out.println("Completed Insert of RightFoot Table...");
			
			//Insert Other Table
			dbObj.RunSQLInsert(queryObj.getOtherInsertSQL(fileObj.getOtherTable()));
			
			System.out.println("Completed Insert of Other Table...");
			
			//Insert ShotsCleared Table
			dbObj.RunSQLInsert(queryObj.getShotsClearedInsertSQL(fileObj.getShotsClearedTable()));
			
			System.out.println("Completed Insert of Shots Cleared Table...");
			
			//Insert Goals Table
			dbObj.RunSQLInsert(queryObj.getGoalsInsertSQL(fileObj.getGoalsTable()));
			
			System.out.println("Completed Insert of Goals Table...");
			
			//Insert AttemptsOnTarget Table
			dbObj.RunSQLInsert(queryObj.getAttemptsOnTargetInsertSQL(fileObj.getAttemptsOnTargetTable()));
			
			System.out.println("Completed Insert of Attempts On Target Table...");
			
			//Insert AttemptsOffTarget Table
			dbObj.RunSQLInsert(queryObj.getAttemptsOffTargetInsertSQL(fileObj.getAttemptsOffTargetTable()));
			
			System.out.println("Completed Insert of Attempts Off Target Table...");
			
			//Insert SuccessfullPasses Table
			dbObj.RunSQLInsert(queryObj.getSuccessfulPassesInsertSQL(fileObj.getSuccessfulPassesTable()));
			
			System.out.println("Completed Insert of Successful Passes Table...");
			
			//Insert UnsuccessfullPasses Table
			dbObj.RunSQLInsert(queryObj.getUnsuccessfulPassesInsertSQL(fileObj.getUnsuccessfulPassesTable()));
			
			System.out.println("Completed Insert of Unsuccessful Passes Table...");
			
			//Insert FlickOn Table
			dbObj.RunSQLInsert(queryObj.getFlickOnInsertSQL(fileObj.getFlickOnTable()));
			
			System.out.println("Completed Insert of FlickOn Table...");

			//Insert Crosses Corners Table
			dbObj.RunSQLInsert(queryObj.getCrossesCornersInsertSQL(fileObj.getCrossesCornersTable()));
			
			System.out.println("Completed Insert of Crosses Corners Table...");
			
			//Insert Corners Into Box Table
			dbObj.RunSQLInsert(queryObj.getCornersIntoBoxInsertSQL(fileObj.getCornersIntoBoxTable()));
			
			System.out.println("Completed Insert of Corners Into Box Table...");
			
			//Insert Throw In Table
			dbObj.RunSQLInsert(queryObj.getThrowInInsertSQL(fileObj.getThrowInTable()));
			
			System.out.println("Completed Insert of Throw In Table...");
			
			//Insert Dribbles Table..
			dbObj.RunSQLInsert(queryObj.getDribblesTableInsertSQL(fileObj.getDribblesTable()));
			
			System.out.println("Completed Insert of Dribbles Table...");
			
			//Insert Crosses Corners Left Table
			dbObj.RunSQLInsert(queryObj.getCrossesCornersLeftTableInsertSQL(fileObj.getCrossesCornersLeftTable()));
			
			System.out.println("Completed Insert of Crosses Corners Left Table...");
			
			//Insert Crosses Left Table
			dbObj.RunSQLInsert(queryObj.getCrossesLeftTableInsertSQL(fileObj.getCrossesLeftTable()));
			
			System.out.println("Completed Insert of Crosses Left Table...");
			
			//Insert Corners Left Table
			dbObj.RunSQLInsert(queryObj.getCornersLeftTableInsertSQL(fileObj.getCornersLeftTable()));
			
			System.out.println("Completed Insert of Corners Left Table...");
			
			//Insert Crosses Corners Right Table
			dbObj.RunSQLInsert(queryObj.getCrossesCornersRightTableInsertSQL(fileObj.getCrossesCornersRightTable()));
			
			System.out.println("Completed Insert of Crosses Corners Right Table...");
			
			//Insert Crosses Right Table
			dbObj.RunSQLInsert(queryObj.getCrossesRightTableInsertSQL(fileObj.getCrossesRightTable()));
			
			System.out.println("Completed Insert of Crosses Right Table...");
			
			//Insert Corners Right Table
			dbObj.RunSQLInsert(queryObj.getCornersRightTableInsertSQL(fileObj.getCornersRightTable()));
			
			System.out.println("Completed Insert of Corners Right Table...");
			
			//Insert Long Balls Table
			dbObj.RunSQLInsert(queryObj.getLongBallsTableInsertSQL(fileObj.getLongBallsTable()));
			
			System.out.println("Completed Insert of Long Balls Table...");
			
			//Insert Lay Offs Table
			dbObj.RunSQLInsert(queryObj.getLayOffsTableInsertSQL(fileObj.getLayOffsTable()));
			
			System.out.println("Completed Insert of Lay Offs Table...");
			
			//Insert Crosses Corners Air Table
			dbObj.RunSQLInsert(queryObj.getCrossesCornersAirTableInsertSQL(fileObj.getCrossesCornersAirTable()));
			
			System.out.println("Completed Insert of Crosses Corners Air Table...");
			
			//Insert Crosses Air Table
			dbObj.RunSQLInsert(queryObj.getCrossesAirTableInsertSQL(fileObj.getCrossesAirTable()));
			
			System.out.println("Completed Insert of Crosses Air Table...");
			
			//Insert Open Play Crosses Table
			dbObj.RunSQLInsert(queryObj.getOpenPlayCrossesTableInsertSQL(fileObj.getOpenPlayCrossesTable()));
			
			System.out.println("Completed Insert of Open Play Crosses Table...");
			
			//Insert Goal Assists Table
			dbObj.RunSQLInsert(queryObj.getGoalAssistsTableInsertSQL(fileObj.getGoalAssistsTable()));
			
			System.out.println("Completed Insert of Goal Assists Table...");
			
			//Insert Key Table Table
			dbObj.RunSQLInsert(queryObj.getKeyTableInsertSQL(fileObj.getKeyTable()));
			
			System.out.println("Completed Insert of Key Table...");
			
			//Insert Duels Table
			dbObj.RunSQLInsert(queryObj.getDuelsTableInsertSQL(fileObj.getDuelsTable()));
			
			System.out.println("Completed Insert of Duels Table...");
			
			//Insert Aerial Duels Table
			dbObj.RunSQLInsert(queryObj.getAerialDuelsTableInsertSQL(fileObj.getAerialDuelsTable()));
			
			System.out.println("Completed Insert of Aerial Duels Table...");
			
			//Insert Ground Duels Table
			dbObj.RunSQLInsert(queryObj.getGroundDuelsTableInsertSQL(fileObj.getGroundDuelsTable()));
			
			System.out.println("Completed Insert of Ground Duels Table...");
			
			//Insert Tackles Table
			dbObj.RunSQLInsert(queryObj.getTacklesTableInsertSQL(fileObj.getTacklesTable()));
			
			System.out.println("Completed Insert of Tackles Table...");
			
			//Insert Clearances Table*
		}
		
		/*String sqlInsert = "";
		
		sqlInsert = queryObj.getThrowInInsertSQL(fileObj.getThrowInTable());
		
		System.out.println(sqlInsert);*/
		
		/*dbObj.RunSQLSelectQuery("Select * from Teams");	
		
		String rs = dbObj.executeSQLStoredProcedure("{call prcGetKey(?, ?)}", 10006, 1001, 1);
		
		System.out.println(rs);*/
		

	}
	
}
