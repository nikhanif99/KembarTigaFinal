package model;

public class staff {
	String STAFFID;
	String STAFFNAME;
	String STAFFPHONENO;
	String STAFFROLE;
	String STAFFEMAIL;
	String STAFFPASS;
	String SUPERVISEID;
boolean valid;
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public String getSTAFFID() {
		return STAFFID;
	}
	public void setSTAFFID(String sTAFFID) {
		STAFFID = sTAFFID;
	}
	public String getSTAFFNAME() {
		return STAFFNAME;
	}
	public void setSTAFFNAME(String sTAFFNAME) {
		STAFFNAME = sTAFFNAME;
	}
	public String getSTAFFPHONENO() {
		return STAFFPHONENO;
	}
	public void setSTAFFPHONENO(String sTAFFPHONENO) {
		STAFFPHONENO = sTAFFPHONENO;
	}
	public String getSTAFFROLE() {
		return STAFFROLE;
	}
	public void setSTAFFROLE(String sTAFFROLE) {
		STAFFROLE = sTAFFROLE;
	}
	public String getSUPERVISEID() {
		return SUPERVISEID;
	}
	public void setSUPERVISEID(String sUPERVISEID) {
		SUPERVISEID = sUPERVISEID;
	}
	public String getSTAFFEMAIL() {
		return STAFFEMAIL;
	}
	public void setSTAFFEMAIL(String sTAFFEMAIL) {
		STAFFEMAIL = sTAFFEMAIL;
	}
	public String getSTAFFPASS() {
		return STAFFPASS;
	}
	public void setSTAFFPASS(String sTAFFPASS) {
		STAFFPASS = sTAFFPASS;
	}

}
