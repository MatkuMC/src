package DataObjects;

public class Duels {
	
	private int ID;
	private int Won;
	private int Lost;
	
	public String TableHeaders = "ID,Won,Lost";

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getWon() {
		return Won;
	}

	public void setWon(int won) {
		Won = won;
	}

	public int getLost() {
		return Lost;
	}

	public void setLost(int lost) {
		Lost = lost;
	}
	
	

}
