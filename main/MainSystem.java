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
		
		fileObj.readHeaderFile(HeaderFileLocation);
		
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
		}
		
		// Read in Data Tables...
		fileObj.readDataTables(DataFileLocation);
		
		if(run){
			//Insert Penalties Table
			dbObj.RunSQLInsert(queryObj.getPenaltiesInsertSQL(fileObj.getPenaltiesTable()));
		
			System.out.println("Completed Insert of Penalties Table...");
			
			//Insert DFKicks Table
			dbObj.RunSQLInsert(queryObj.getDFKicksInsertSQL(fileObj.getDFKicksTable()));
			
			System.out.println("Completed Insert of Direct Free Kicks Table...");
			
			//Insert InsideBox Table
			
			//Insert OutSideBox Table
			
			//Insert Headed Table
			
			//Insert LeftFoot Table
			
			//Insert RightFoot Table
			
			//Insert Other Table
			
			//Insert ShotsCleared Table
			
			//Insert Goals Table
			
			//Insert AttemptsOnTarget Table
		}
		
		
		
		String sqlInsert = "";
		
		sqlInsert = queryObj.getAttemptsOnTargetInsertSQL(fileObj.getAttemptsOnTargetTable());
		
		System.out.println(sqlInsert);
		
		//dbObj.RunSQLSelectQuery("Select * from Teams");	
		
		//String rs = dbObj.executeSQLStoredProcedure("{call prcGetKey(?, ?)}", 10006, 1001, 1);
		
		//System.out.println(rs);
		

	}
	
}
