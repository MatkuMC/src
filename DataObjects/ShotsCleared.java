package DataObjects;

public class ShotsCleared {
	
	private int ID;
	private int OffLine;
	private int OffLineInsideArea;
	private int OffLineOutsideArea;
	
	public String TableHeaders = "ID,OffLine,OffLineInsideArea,OffLineOutsideArea";
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getOffLine() {
		return OffLine;
	}
	public void setOffLine(int offLine) {
		OffLine = offLine;
	}
	public int getOffLineInsideArea() {
		return OffLineInsideArea;
	}
	public void setOffLineInsideArea(int offLineInsideArea) {
		OffLineInsideArea = offLineInsideArea;
	}
	public int getOffLineOutsideArea() {
		return OffLineOutsideArea;
	}
	public void setOffLineOutsideArea(int offLineOutsideArea) {
		OffLineOutsideArea = offLineOutsideArea;
	}
	

}
