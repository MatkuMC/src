package DataObjects;

public class Positions {
	private int PositionID;
	private String Position;
	
	public String TableHeaders = "PositionID, Position";
	
	public int getPositionID() {
		return PositionID;
	}
	public void setPositionID(int positionID) {
		PositionID = positionID;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	

}
