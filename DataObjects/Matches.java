package DataObjects;

public class Matches {

	private int MatchID;
	private String Date;
	private int TeamID1;
	private int TeamID2;
	private String Venue;
	public int getMatchID() {
		return MatchID;
	}
	public void setMatchID(int matchID) {
		MatchID = matchID;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public int getTeamID1() {
		return TeamID1;
	}
	public void setTeamID1(int teamID1) {
		TeamID1 = teamID1;
	}
	public int getTeamID2() {
		return TeamID2;
	}
	public void setTeamID2(int teamID2) {
		TeamID2 = teamID2;
	}
	public String getVenue() {
		return Venue;
	}
	public void setVenue(String venue) {
		Venue = venue;
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
		   
		   if (this.Date != ((Matches) other).Date)
		   {
			   return false;
		   }
		   
		   if((this.Date != ((Matches) other).Date) && (this.TeamID1 != ((Matches) other).TeamID1) && (this.TeamID2 != ((Matches) other).TeamID2)){
			   return false;
		   }
		   
		return true;
		
	}
}
