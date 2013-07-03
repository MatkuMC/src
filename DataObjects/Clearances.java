package DataObjects;

public class Clearances {
	
	private int ID;
	private int Total;
	private int Headed;
	private int OffLine;
	private int Other;
	
	public String TableHeaders ="ID,Total,Headed,Other,OffLine";

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

	public int getHeaded() {
		return Headed;
	}

	public void setHeaded(int headed) {
		Headed = headed;
	}

	public int getOffLine() {
		return OffLine;
	}

	public void setOffLine(int offLine) {
		OffLine = offLine;
	}

	public int getOther() {
		return Other;
	}

	public void setOther(int other) {
		Other = other;
	}
	
	

}
