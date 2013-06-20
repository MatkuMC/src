package DataObjects;

public class PlayerMatches {
	
	private int ID;
	private int MatchID;
	private int PlayerID;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getMatchID() {
		return MatchID;
	}
	public void setMatchID(int matchID) {
		MatchID = matchID;
	}
	public int getPlayerID() {
		return PlayerID;
	}
	public void setPlayerID(int playerID) {
		PlayerID = playerID;
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
		   
		   //TODO - Check that this logic makes sense...
		   if (this.MatchID != ((PlayerMatches) other).MatchID)
		   {
			   return false;
		   } else if(this.PlayerID != ((PlayerMatches) other).PlayerID){
			   
			   return false;
		   }
		   
		return true;
		
	}
}
