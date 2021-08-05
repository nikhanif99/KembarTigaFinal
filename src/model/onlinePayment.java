package model;

public class onlinePayment extends payment {

	int  CVV,PAYMENTID;
	
	public int getPAYMENTID() {
		return PAYMENTID;
	}
	public void setPAYMENTID(int pAYMENTID) {
		PAYMENTID = pAYMENTID;
	}
	String CARDNAME, BANKNAME, CARDNUM;
	
	
	
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	public String getCARDNAME() {
		return CARDNAME;
	}
	public void setCARDNAME(String cARDNAME) {
		CARDNAME = cARDNAME;
	}
	public String getBANKNAME() {
		return BANKNAME;
	}
	public void setBANKNAME(String bANKNAME) {
		BANKNAME = bANKNAME;
	}
	public String getCARDNUM() {
		return CARDNUM;
	}
	public void setCARDNUM(String cARDNUM) {
		CARDNUM = cARDNUM;
	}
	
}
