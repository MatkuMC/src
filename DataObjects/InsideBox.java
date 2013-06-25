package DataObjects;

public class InsideBox {
	
	private int ID;
	private int Goals;
	private int ShotsOn;
	private int ShotsOff;
	private int Blocked;
	
	public String TableHeaders = "ID,Goals,ShotsOn,ShotsOff,Blocked";
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getGoals() {
		return Goals;
	}
	public void setGoals(int goals) {
		Goals = goals;
	}
	public int getShotsOn() {
		return ShotsOn;
	}
	public void setShotsOn(int shotsOn) {
		ShotsOn = shotsOn;
	}
	public int getShotsOff() {
		return ShotsOff;
	}
	public void setShotsOff(int shotsOff) {
		ShotsOff = shotsOff;
	}
	public int getBlocked() {
		return Blocked;
	}
	public void setBlocked(int blocked) {
		Blocked = blocked;
	}
	
}
