package model;

import java.sql.Date;

public class booking {
	int PAYMENTID, SERVICEID,BOOKINGID;
	String CLIENTID,STAFFID, PAYMENTSTATUS;
	public String getPAYMENTSTATUS() {
		return PAYMENTSTATUS;
	}
	public void setPAYMENTSTATUS(String pAYMENTSTATUS) {
		PAYMENTSTATUS = pAYMENTSTATUS;
	}
	public String getSTAFFID() {
		return STAFFID;
	}
	public void setSTAFFID(String sTAFFID) {
		STAFFID = sTAFFID;
	}
	/**
	 * 
	 */
	String BOOKINGLOCATION, SERVICETYPE, BOOKINGSTATUS, BOOKINGAPPROVAL, BOOKINGUPDATE,PAYMENTTYPE;
	
	public String getPAYMENTTYPE() {
		return PAYMENTTYPE;
	}
	public void setPAYMENTTYPE(String pAYMENTTYPE) {
		PAYMENTTYPE = pAYMENTTYPE;
	}
	Date BOOKINGSTARTDATE, BOOKINGENDDATE;
	double TOTALPRICE, HOURS,EDITINGRATE;
	
	public double getEDITINGRATE() {
		return EDITINGRATE;
	}
	public void setEDITINGRATE(double eDITINGRATE) {
		EDITINGRATE = eDITINGRATE;
	}
	public String getBOOKINGUPDATE() {
		return BOOKINGUPDATE;
	}
	public void setBOOKINGUPDATE(String bOOKINGUPDATE) {
		BOOKINGUPDATE = bOOKINGUPDATE;
	}
	
	public int getBOOKINGID() {
		return BOOKINGID;
	}
	public void setBOOKINGID(int bOOKINGID) {
		BOOKINGID = bOOKINGID;
	}
	public String getCLIENTID() {
		return CLIENTID;
	}
	public void setCLIENTID(String cLIENTID) {
		CLIENTID = cLIENTID;
	}
	
	public String getBOOKINGLOCATION() {
		return BOOKINGLOCATION;
	}
	public void setBOOKINGLOCATION(String bOOKINGLOCATION) {
		BOOKINGLOCATION = bOOKINGLOCATION;
	}
	public String getSERVICETYPE() {
		return SERVICETYPE;
	}
	public void setSERVICETYPE(String sERVICETYPE) {
		SERVICETYPE = sERVICETYPE;
	}
	public Date getBOOKINGSTARTDATE() {
		return BOOKINGSTARTDATE;
	}
	public void setBOOKINGSTARTDATE(Date bOOKINGSTARTDATE) {
		BOOKINGSTARTDATE = bOOKINGSTARTDATE;
	}
	public Date getBOOKINGENDDATE() {
		return BOOKINGENDDATE;
	}
	public void setBOOKINGENDDATE(Date bOOKINGENDDATE) {
		BOOKINGENDDATE = bOOKINGENDDATE;
	}
	public double getTOTALPRICE() {
		return TOTALPRICE;
	}
	public void setTOTALPRICE(double tOTALPRICE) {
		TOTALPRICE = tOTALPRICE;
	}
	public double getHOURS() {
		return HOURS;
	}
	public void setHOURS(double hOURS) {
		HOURS = hOURS;
	}
	public String getBOOKINGSTATUS() {
		return BOOKINGSTATUS;
	}
	public void setBOOKINGSTATUS(String bOOKINGSTATUS) {
		BOOKINGSTATUS = bOOKINGSTATUS;
	}
	public String getBOOKINGAPPROVAL() {
		return BOOKINGAPPROVAL;
	}
	public void setBOOKINGAPPROVAL(String bOOKINGAPPROVAL) {
		BOOKINGAPPROVAL = bOOKINGAPPROVAL;
	}
	public int getPAYMENTID() {
		return PAYMENTID;
	}
	public void setPAYMENTID(int pAYMENTID) {
		PAYMENTID = pAYMENTID;
	}
	public int getSERVICEID() {
		return SERVICEID;
	}
	public void setSERVICEID(int sERVICEID) {
		SERVICEID = sERVICEID;
	}
	
	
}
