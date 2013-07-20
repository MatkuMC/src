package DataObjects;

public class GoalsConceded {
	
	private int ID;
	private int Total;
	private int InsideBox;
	private int OutsideBox;
	
	public String TableHeaders ="ID,Total,InsideBox,OutsideBox";
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public int getInsideBox() {
		return InsideBox;
	}
	public void setInsideBox(int insideBox) {
		InsideBox = insideBox;
	}
	public int getOutsideBox() {
		return OutsideBox;
	}
	public void setOutsideBox(int outsideBox) {
		OutsideBox = outsideBox;
	}
	

}
