package DataObjects;

public class Goals {
	
	private int ID;
	private int OpenPlay;
	private int Corners;
	private int Throws;
	private int DFKicks;
	private int SetPlay;
	private int Penalties;
	
	public String TableHeaders = "ID,OpenPlay,Corners,Throws,DFKicks,SetPlay,Penalties";
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getOpenPlay() {
		return OpenPlay;
	}

	public void setOpenPlay(int openPlay) {
		OpenPlay = openPlay;
	}

	public int getCorners() {
		return Corners;
	}

	public void setCorners(int corners) {
		Corners = corners;
	}

	public int getThrows() {
		return Throws;
	}

	public void setThrows(int throws1) {
		Throws = throws1;
	}

	public int getDFKicks() {
		return DFKicks;
	}

	public void setDFKicks(int dFKicks) {
		DFKicks = dFKicks;
	}

	public int getSetPlay() {
		return SetPlay;
	}

	public void setSetPlay(int setPlay) {
		SetPlay = setPlay;
	}

	public int getPenalties() {
		return Penalties;
	}

	public void setPenalties(int penalties) {
		Penalties = penalties;
	}

}
