package DataObjects;

public class GoalAssists {
	
	private int ID;
	private int Corner;
	private int FreeKick;
	private int ThrowIn;
	private int GoalKick;
	private int SetPiece;
	
	public String TableHeaders = "ID,Corner,FreeKick,ThrowIn,GoalKick,SetPiece";

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getCorner() {
		return Corner;
	}

	public void setCorner(int corner) {
		Corner = corner;
	}

	public int getFreeKick() {
		return FreeKick;
	}

	public void setFreeKick(int freeKick) {
		FreeKick = freeKick;
	}

	public int getThrowIn() {
		return ThrowIn;
	}

	public void setThrowIn(int throwIn) {
		ThrowIn = throwIn;
	}

	public int getGoalKick() {
		return GoalKick;
	}

	public void setGoalKick(int goalKick) {
		GoalKick = goalKick;
	}

	public int getSetPiece() {
		return SetPiece;
	}

	public void setSetPiece(int setPiece) {
		SetPiece = setPiece;
	}

}
