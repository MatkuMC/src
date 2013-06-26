package DataObjects;

public class FlickOn {
	private int ID;
	private int Successful;
	private int Unsuccessful;
	
	public String TableHeaders = "ID,Successful,Unsuccessful";
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getSuccessful() {
		return Successful;
	}
	public void setSuccessful(int successful) {
		Successful = successful;
	}
	public int getUnsuccessful() {
		return Unsuccessful;
	}
	public void setUnsuccessful(int unsuccessful) {
		Unsuccessful = unsuccessful;
	}

}
