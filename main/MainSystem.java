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
		
		fileObj.readDataFile(DataFileLocation, ReadType.Team);
		
		fileObj.readDataFile(DataFileLocation, ReadType.Player);
		
		fileObj.readDataFile(DataFileLocation, ReadType.Matches);
		
		//Create the Insert SQL from ArrayList
		Query queryObj = new Query(dbName);
			
		DBConnector dbObj = new DBConnector(dbName,userName,password);
		
		if(run) {
			//Insert Teams
			dbObj.RunSQLInsert(queryObj.getTeamInsertSQL(fileObj.getTeamsTable()));
			
			//Insert Players
			dbObj.RunSQLInsert(queryObj.getPlayerInsertSQL(fileObj.getPlayersTable()));
			
			//Insert Matches
			dbObj.RunSQLInsert(queryObj.getMatchesInsertSQL(fileObj.getMatchesTable()));
			
			//Insert PlayerMatches
			dbObj.RunSQLInsert(queryObj.getPlayerMatchesInsertSQL(fileObj.getPlayerMatchesTable()));
			
		}
		
		/*String sqlInsert = "";
		
		sqlInsert = queryObj.getPlayerMatchesInsertSQL(fileObj.getPlayerMatchesTable());
		
		System.out.println(sqlInsert);*/
		
		//dbObj.RunSQLSelectQuery("Select * from Teams");	

	}
	
}
