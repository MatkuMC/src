package utils;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import DataObjects.*;


public class FileReader {
	
	private ArrayList<String> Headers = new ArrayList<String>();
	
	private ArrayList<Teams> TeamsTable = new ArrayList<Teams>();
	private ArrayList<Players> PlayersTable = new ArrayList<Players>();
	private ArrayList<Matches> MatchesTable = new ArrayList<Matches>();
	private ArrayList<PlayerMatches> PlayerMatchesTable = new ArrayList<PlayerMatches>();
	

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
			
			Data dataObj = new Data();
			
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

}
