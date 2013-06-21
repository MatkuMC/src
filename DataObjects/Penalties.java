package DataObjects;

public class Penalties {
	private int ID;
	private int Taken;
	private int Goals;
	private int Saved;
	private int OffTarget;
	private int NotScored;
	
	public String TableHeaders = "ID,Taken,Goals,Saved,OffTarget,NotScored";
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTaken() {
		return Taken;
	}
	public void setTaken(int taken) {
		Taken = taken;
	}
	public int getGoals() {
		return Goals;
	}
	public void setGoals(int goals) {
		Goals = goals;
	}
	public int getSaved() {
		return Saved;
	}
	public void setSaved(int saved) {
		Saved = saved;
	}
	public int getOffTarget() {
		return OffTarget;
	}
	public void setOffTarget(int offTarget) {
		OffTarget = offTarget;
	}
	public int getNotScored() {
		return NotScored;
	}
	public void setNotScored(int notScored) {
		NotScored = notScored;
	}

}
