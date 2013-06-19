package DataObjects;

public class Players {

	private int PlayerID;
	private String Surname;
	private String Forename;
	private int TeamID;
	private int OptaPlayerID;
	
	public final String TableHeaders = "PlayerID,Surname,Forename,TeamID,OptaPlayerID";

	public int getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(int playerID) {
		PlayerID = playerID;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		surname = surname.replace('\'', ' ');
		Surname = surname;
	}

	public String getForename() {
		return Forename;
	}

	public void setForename(String forename) {
		forename = forename.replace('\'', ' ');
		Forename = forename;
	}

	public int getTeamID() {
		return TeamID;
	}

	public void setTeamID(int teamID) {
		TeamID = teamID;
	}

	public int getOptaPlayerID() {
		return OptaPlayerID;
	}

	public void setOptaPlayerID(int optaPlayerID) {
		OptaPlayerID = optaPlayerID;
	}
	
	public boolean equals(Object other){
		if (other == null)
		   {
		      return false;
		   }

		   if (this.getClass() != other.getClass())
		   {
		      return false;
		   }
		   
		   if(this.OptaPlayerID != ((Players) other).OptaPlayerID){
			   return false;
		   }
		   
		return true;
		
	}
	
}
