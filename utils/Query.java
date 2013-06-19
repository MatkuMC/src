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

}