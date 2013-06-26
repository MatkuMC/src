package DataObjects;

public class ThrowIn {
	
	private int ID;
	private int OwnPlayer;
	private int OppPlayer;
	
	public String TableHeaders = "ID,OwnPlayer,OppPlayer";
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getOwnPlayer() {
		return OwnPlayer;
	}
	public void setOwnPlayer(int ownPlayer) {
		OwnPlayer = ownPlayer;
	}
	public int getOppPlayer() {
		return OppPlayer;
	}
	public void setOppPlayer(int oppPlayer) {
		OppPlayer = oppPlayer;
	}

}
