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
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
