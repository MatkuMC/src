package DataObjects;

public class SuccessfulPasses {

	private int ID;
	private int Total;
	private int TECC;
	private int OwnHalf;
	private int OppHalf;
	private int DefensiveThird;
	private int MiddleThird;
	private int FinalThird;
	private int ShortPasses;
	private int LongPasses;
	
	public String TableHeaders = "ID,Total,TECC,OwnHalf,OppHalf,DefensiveThird,MiddleThird,FinalThird,ShortPasses,LongPasses";
	
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
	public int getTECC() {
		return TECC;
	}
	public void setTECC(int tECC) {
		TECC = tECC;
	}
	public int getOwnHalf() {
		return OwnHalf;
	}
	public void setOwnHalf(int ownHalf) {
		OwnHalf = ownHalf;
	}
	public int getOppHalf() {
		return OppHalf;
	}
	public void setOppHalf(int oppHalf) {
		OppHalf = oppHalf;
	}
	public int getDefensiveThird() {
		return DefensiveThird;
	}
	public void setDefensiveThird(int defensiveThird) {
		DefensiveThird = defensiveThird;
	}
	public int getMiddleThird() {
		return MiddleThird;
	}
	public void setMiddleThird(int middleThird) {
		MiddleThird = middleThird;
	}
	public int getFinalThird() {
		return FinalThird;
	}
	public void setFinalThird(int finalThird) {
		FinalThird = finalThird;
	}
	public int getShortPasses() {
		return ShortPasses;
	}
	public void setShortPasses(int shortPasses) {
		ShortPasses = shortPasses;
	}
	public int getLongPasses() {
		return LongPasses;
	}
	public void setLongPasses(int longPasses) {
		LongPasses = longPasses;
	}
}
