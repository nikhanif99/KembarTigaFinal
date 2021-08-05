package model;

import java.sql.Date;
import java.sql.Timestamp;

public class payment {
	int CVV,PAYMENTID,BOOKINGID;
	public int getBOOKINGID() {
		return BOOKINGID;
	}
	public void setBOOKINGID(int bOOKINGID) {
		BOOKINGID = bOOKINGID;
	}
	public int getPAYMENTID() {
		return PAYMENTID;
	}
	public void setPAYMENTID(int pAYMENTID) {
		PAYMENTID = pAYMENTID;
	}
	Double PAYMENTAMOUNT;
	Date PAYMENTDATE;
	String PAYMENTTYPE, CARDNAME, BANKNAME, CARDNUM,  CASHSTATUS,PAYMENTSTATUS;
	
	public String getPAYMENTSTATUS() {
		return PAYMENTSTATUS;
	}
	public void setPAYMENTSTATUS(String pAYMENTSTATUS) {
		PAYMENTSTATUS = pAYMENTSTATUS;
	}
	public String getCASHSTATUS() {
		return CASHSTATUS;
	}
	public void setCASHSTATUS(String cASHSTATUS) {
		CASHSTATUS = cASHSTATUS;
	}
	

	
	public Double getPAYMENTAMOUNT() {
		return PAYMENTAMOUNT;
	}
	public void setPAYMENTAMOUNT(Double pAYMENTAMOUNT) {
		PAYMENTAMOUNT = pAYMENTAMOUNT;
	}
	public Date getPAYMENTDATE() {
		return PAYMENTDATE;
	}
	public void setPAYMENTDATE(Date pAYMENTDATE) {
		PAYMENTDATE = pAYMENTDATE;
	}
	public String getPAYMENTTYPE() {
		return PAYMENTTYPE;
	}
	public void setPAYMENTTYPE(String pAYMENTTYPE) {
		PAYMENTTYPE = pAYMENTTYPE;
	}
	
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
