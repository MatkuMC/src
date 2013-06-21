package DataObjects;

public class DirectFreeKicks {
	
	private int ID;
	private int Goals;
	private int OnTarget;
	private int OffTarget;
	private int Blocked;
	
	public String TableHeaders = "ID,Goals,OnTarget,OffTarget,Blocked";
	
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
	public int getOnTarget() {
		return OnTarget;
	}
	public void setOnTarget(int onTarget) {
		OnTarget = onTarget;
	}
	public int getOffTarget() {
		return OffTarget;
	}
	public void setOffTarget(int offTarget) {
		OffTarget = offTarget;
	}
	public int getBlocked() {
		return Blocked;
	}
	public void setBlocked(int blocked) {
		Blocked = blocked;
	}

}
