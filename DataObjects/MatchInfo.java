package DataObjects;

public class MatchInfo {

	private int ID;
	private int PositionID;
	private int Time;
	private int Starts;
	private int SubOn;
	private int SubOff;
	
	public String TableHeaders = "ID,PositionID,Time,Starts,SubOn,SubOff";
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPositionID() {
		return PositionID;
	}
	public void setPositionID(int positionID) {
		PositionID = positionID;
	}
	public int getTime() {
		return Time;
	}
	public void setTime(int time) {
		Time = time;
	}
	public int getStarts() {
		return Starts;
	}
	public void setStarts(int starts) {
		Starts = starts;
	}
	public int getSubOn() {
		return SubOn;
	}
	public void setSubOn(int subOn) {
		SubOn = subOn;
	}
	public int getSubOff() {
		return SubOff;
	}
	public void setSubOff(int subOff) {
		SubOff = subOff;
	}
	
}
