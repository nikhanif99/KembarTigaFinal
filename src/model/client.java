package model;

public class client {
String CLIENTID;


public String getCLIENTID() {
	return CLIENTID;
}
public void setCLIENTID(String cLIENTID) {
	CLIENTID = cLIENTID;
}
public String getCLIENTNAME() {
	return CLIENTNAME;
}
public void setCLIENTNAME(String cLIENTNAME) {
	CLIENTNAME = cLIENTNAME;
}
public String getCLIENTPHONENO() {
	return CLIENTPHONENO;
}
public void setCLIENTPHONENO(String cLIENTPHONENO) {
	CLIENTPHONENO = cLIENTPHONENO;
}
public String getCLIENTADDRESS() {
	return CLIENTADDRESS;
}
public void setCLIENTADDRESS(String cLIENTADDRESS) {
	CLIENTADDRESS = cLIENTADDRESS;
}
public String getCLIENTEMAILADD() {
	return CLIENTEMAILADD;
}
public void setCLIENTEMAILADD(String cLIENTEMAILADD) {
	CLIENTEMAILADD = cLIENTEMAILADD;
}
public String getCLIENTPASS() {
	return CLIENTPASS;
}
public void setCLIENTPASS(String cLIENTPASS) {
	CLIENTPASS = cLIENTPASS;
}
public boolean isValid() {
	return valid;
}
public void setValid(boolean valid) {
	this.valid = valid;
}
String CLIENTNAME,CLIENTPHONENO,CLIENTADDRESS,CLIENTEMAILADD, CLIENTPASS;
boolean valid;



}
