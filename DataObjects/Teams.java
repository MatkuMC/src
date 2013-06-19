package DataObjects;

public class Teams {
	private int TeamID;
	private String TeamName;
	private int OptaTeamID;
	
	public final String TableHeaders = "TeamID,Team Name,OptaTeamID";

	public int getTeamID() {
		return TeamID;
	}

	public void setTeamID(int teamID) {
		TeamID = teamID;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public int getOptaTeamID() {
		return OptaTeamID;
	}

	public void setOptaTeamID(int optaTeamID) {
		OptaTeamID = optaTeamID;
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
		   
		   if(this.OptaTeamID != ((Teams) other).OptaTeamID){
			   return false;
		   }
		   
		   if (!this.TeamName.equals(((Teams)other).TeamName))
		   {
		      return false;
		   }
		   
		return true;
		
	}
	

}
