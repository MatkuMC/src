package DataObjects;

public class Fouls {
	
	private int ID;
	private int Conceded;
	private int CEHP;
	private int Won;
	private int WonInDangerArea;
	private int WonOutDangerArea;
	private int WonPenalty;
	
	public String TableHeaders = "ID,Conceded,CEHP,Won,WonInDangerArea,WonOutDangerArea,WonPenalty";
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getConceded() {
		return Conceded;
	}
	public void setConceded(int conceded) {
		Conceded = conceded;
	}
	public int getCEHP() {
		return CEHP;
	}
	public void setCEHP(int cEHP) {
		CEHP = cEHP;
	}
	public int getWon() {
		return Won;
	}
	public void setWon(int won) {
		Won = won;
	}
	public int getWonInDangerArea() {
		return WonInDangerArea;
	}
	public void setWonInDangerArea(int wonInDangerArea) {
		WonInDangerArea = wonInDangerArea;
	}
	public int getWonOutDangerArea() {
		return WonOutDangerArea;
	}
	public void setWonOutDangerArea(int wonOutDangerArea) {
		WonOutDangerArea = wonOutDangerArea;
	}
	public int getWonPenalty() {
		return WonPenalty;
	}
	public void setWonPenalty(int wonPenalty) {
		WonPenalty = wonPenalty;
	}

}
