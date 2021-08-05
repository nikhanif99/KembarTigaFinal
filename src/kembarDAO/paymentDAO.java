package kembarDAO;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import db.connection.ConnectionManager;
import model.booking;
import model.cash;
import model.payment;
import model.onlinePayment;


public class paymentDAO {
	
	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static PreparedStatement secondps = null;
	static Statement stmt = null;
	
	static int  CVV,PAYMENTID,BOOKINGID;
	static Double PAYMENTAMOUNT;
	static Date PAYMENTDATE;
	static String PAYMENTTYPE, CARDNAME, CARDNUM, BANKNAME, PAYMENTLOCATION,CASHSTATUS,PAYMENTSTATUS;
	
	

	// add payment
//	public int addpayment(payment bean) {
//		
//		int currentID = 0;
//		
//		
//		//PAYMENTID = bean.getPAYMENTID();
//		PAYMENTAMOUNT = bean.getPAYMENTAMOUNT();
//		PAYMENTDATE = bean.getPAYMENTDATE();
//		PAYMENTTYPE = bean.getPAYMENTTYPE();
//		BOOKINGID = bean.getBOOKINGID();
//		
//		try {
//			currentCon = ConnectionManager.getConnection();
//			PreparedStatement ps = currentCon.prepareStatement("insert into PAYMENT (PAYMENTAMOUNT,PAYMENTDATE, PAYMENTTYPE) values ( ?, ?,?)", PreparedStatement.RETURN_GENERATED_KEYS); 
//			
//			ps.setDouble(1,PAYMENTAMOUNT);
//            ps.setDate(2,PAYMENTDATE);
//            ps.setString(3,PAYMENTTYPE);
//            
//
//            // Get generated key.
//            ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                int key = rs.getInt(1);
//                System.out.print("String currentID" +key);
//                currentID = key;
//                
//            }
//			
//			
//		}
//		catch (Exception ex) {
//			ex.printStackTrace();
//			System.out.print("failed insert");	
//		}
//		
//		return currentID;
//	}
	
	// add paymentCASH
		public void addpaymentC(payment bean) {
		
			
			
			PAYMENTID = bean.getPAYMENTID();
			PAYMENTAMOUNT = bean.getPAYMENTAMOUNT();
			PAYMENTDATE = bean.getPAYMENTDATE();
			PAYMENTTYPE = bean.getPAYMENTTYPE();
			BOOKINGID = bean.getBOOKINGID();
			PAYMENTSTATUS = bean.getPAYMENTSTATUS();
			CASHSTATUS = bean.getCASHSTATUS();
			
			try {
				
				currentCon = ConnectionManager.getConnection();
				ps = currentCon.prepareStatement("insert into PAYMENT( PAYMENTAMOUNT, PAYMENTDATE, PAYMENTTYPE,BOOKINGID,PAYMENTSTATUS) values(?,?,?,?,?)");
				//ps.setInt(1,PAYMENTID);
				ps.setDouble(1,PAYMENTAMOUNT);
	            ps.setDate(2,PAYMENTDATE);
	            ps.setString(3,PAYMENTTYPE);
	            ps.setInt(4,BOOKINGID);
	            ps.setString(5,"UNPAID");
	            
	            
	            
	            ps.execute();
	            
//				secondps = currentCon.prepareStatement("insert into CASH(PAYMENTID, CASHSTATUS) values (?,?)"); 
//				secondps.setInt(1,PAYMENTID);
//				secondps.setString(2,CASHSTATUS);
//				
//				secondps.execute();       
	            
				
				
			}
			catch (Exception ex) {
				ex.printStackTrace();
				System.out.print("failed insert");	
			}
			
			
		}
		
public void addpaymentC1(payment bean) {
		
			
			
			PAYMENTID = bean.getPAYMENTID();
		
			CASHSTATUS = bean.getCASHSTATUS();
			
			try {
//				
				currentCon = ConnectionManager.getConnection();
		
	            
				secondps = currentCon.prepareStatement("insert into CASH(PAYMENTID, CASHSTATUS) values (?,?)"); 
				secondps.setInt(1,PAYMENTID);
				secondps.setString(2,CASHSTATUS);
				
				secondps.execute();       
	            
				
				
			}
			catch (Exception ex) {
				ex.printStackTrace();
				System.out.print("failed insert");	
			}
			
			
		}
	
	//viewOnline data
	public static payment getPaymentById(int PAYMENTID) {
		payment p = new payment();
		System.out.print("debug payment view dao");
		try { System.out.print("debug try view");
			currentCon = ConnectionManager.getConnection(); 	
			ps = currentCon.prepareStatement("select * from PAYMENT where PAYMENTID=?");
			ps.setInt(1, PAYMENTID);
			ResultSet rs = ps.executeQuery(); //4. process the result
			System.out.print("debug query");
			
			if(rs.next()) {
				p.setPAYMENTID(rs.getInt("PAYMENTID"));
				p.setPAYMENTAMOUNT(rs.getDouble("PAYMENTAMOUNT"));
				p.setPAYMENTDATE(rs.getDate("PAYMENTDATE"));
				p.setPAYMENTTYPE(rs.getString("PAYMENTTYPE"));
				p.setBOOKINGID(rs.getInt("BOOKINGID"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return p;
	}
	
	//viewCash data
		public static payment getPaymentByIdC(int PAYMENTID) {
			payment p = new payment();
			System.out.print("debug payment view dao");
			try { System.out.print("debug try view");
				currentCon = ConnectionManager.getConnection(); 	
				ps = currentCon.prepareStatement("select * from PAYMENT where PAYMENTID=?");
				ps.setInt(1, PAYMENTID);
				ResultSet rs = ps.executeQuery(); //4. process the result
				System.out.print("debug query");
				
				if(rs.next()) {
					p.setPAYMENTID(rs.getInt("PAYMENTID"));
					p.setPAYMENTAMOUNT(rs.getDouble("PAYMENTAMOUNT"));
					p.setPAYMENTDATE(rs.getDate("PAYMENTDATE"));
					p.setPAYMENTTYPE(rs.getString("PAYMENTTYPE"));
					p.setBOOKINGID(rs.getInt("BOOKINGID"));
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return p;
		}

		// add ONLINE PAYMENT
				public int newpayment(payment bean) {
					int autoid = 0;
					
					
					
					
				//	PAYMENTID = bean.getPAYMENTID();
					PAYMENTAMOUNT = bean.getPAYMENTAMOUNT();
					PAYMENTDATE = bean.getPAYMENTDATE();
					PAYMENTTYPE = bean.getPAYMENTTYPE();
					BOOKINGID = bean.getBOOKINGID();
					
					PAYMENTSTATUS = bean.getPAYMENTSTATUS();
					
					
					try {
						currentCon = ConnectionManager.getConnection();
						ps = currentCon.prepareStatement("insert into PAYMENT( PAYMENTAMOUNT, PAYMENTDATE, PAYMENTTYPE,BOOKINGID,PAYMENTSTATUS) values(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
						//ps.setString(1,PAYMENTID);
						
						ps.setDouble(1,PAYMENTAMOUNT);
			            ps.setDate(2,PAYMENTDATE);
			            ps.setString(3,PAYMENTTYPE);
			            ps.setInt(4,BOOKINGID);
			            ps.setString(5,"PAID");
			        
			            ps.executeUpdate();
			            ResultSet rs = ps.getGeneratedKeys();
			            if (rs.next()) {
			                System.out.println("Auto Generated Primary Key " + rs.getInt(1));
			                autoid = rs.getInt(1);
			                
			            }

			          
						
					}
					catch (Exception ex) {
						ex.printStackTrace();
						System.out.print("failed insert");	
					}
					return autoid;
					
				}
				public void newpayment1(payment bean) {
					
					
					
					
					
						CVV = bean.getCVV();
						CARDNAME = bean.getCARDNAME();
						BANKNAME = bean.getBANKNAME();
						CARDNUM = bean.getCARDNUM();
						PAYMENTID = bean.getPAYMENTID();
						
						
						try {
							currentCon = ConnectionManager.getConnection();
//							
							secondps = currentCon.prepareStatement("insert into ONLINEPAYMENT ( CVV, CARDNAME, BANKNAME, CARDNUM,PAYMENTID) values ( ?, ?, ?, ?,?)"); 
					
							secondps.setInt(1,CVV);
							secondps.setString(2,CARDNAME);
							secondps.setString(3,BANKNAME);
							secondps.setString(4,CARDNUM);
							secondps.setInt(5,PAYMENTID);
							secondps.execute();

				          
							
						}
						catch (Exception ex) {
							ex.printStackTrace();
							System.out.print("failed insert");	
						}
						
						
					}
				
				// UPDATE CASH PAYMENT
				public int newpaymentC(payment bean) {
					
					int currentID = 0;

					//PAYMENTID = bean.getPAYMENTID();
					PAYMENTAMOUNT = bean.getPAYMENTAMOUNT();
					PAYMENTDATE = bean.getPAYMENTDATE();
					PAYMENTTYPE = bean.getPAYMENTTYPE();
					BOOKINGID = bean.getBOOKINGID();
					PAYMENTSTATUS = bean.getPAYMENTSTATUS();
					
					
					try {
						currentCon = ConnectionManager.getConnection();
						PreparedStatement ps = currentCon.prepareStatement("insert into CASH (PAYMENTID) values (?)", PreparedStatement.RETURN_GENERATED_KEYS); 
			            ps.setInt(1,PAYMENTID);
			           

			            // Get generated key.
			            ps.executeUpdate();
			            ResultSet rs = ps.getGeneratedKeys();
			            if (rs.next()) {
			                int key = rs.getInt(1);
			                System.out.print("String currentID" +key);
			                currentID = key;
			            }
						
						
					}
					catch (Exception ex) {
						ex.printStackTrace();
						System.out.print("failed insert");	
					}
					
					return currentID;
				}
				
		//Update Payment
		public void UpdatePayment(payment p) {
			BOOKINGID = p.getBOOKINGID();
			PAYMENTID = p.getPAYMENTID();
			PAYMENTAMOUNT = p.getPAYMENTAMOUNT();
			PAYMENTDATE = p.getPAYMENTDATE();
			PAYMENTTYPE = p.getPAYMENTTYPE();
			PAYMENTSTATUS = p.getPAYMENTSTATUS();
			
			try {
				currentCon = ConnectionManager.getConnection(); 
				String query = "UPDATE PAYMENT SET PAYMENTAMOUNT= '" + PAYMENTAMOUNT + "', PAYMENTDATE= '" + PAYMENTDATE + "', PAYMENTTYPE= '" + PAYMENTTYPE + "'  WHERE BOOKINGID= '" + BOOKINGID + "' ";
				stmt = currentCon.createStatement();
				stmt.executeUpdate(query);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//get online pay
		public static onlinePayment viewOnlineById(int viewID) {
			onlinePayment opInfo = new onlinePayment();
			try {
				currentCon = ConnectionManager.getConnection();
				ps = currentCon.prepareStatement("SELECT * FROM onlinepayment WHERE PAYMENTID=?");
				ps.setInt(1, viewID);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					opInfo.setCVV(rs.getInt("CVV"));
					opInfo.setCARDNAME(rs.getString("CARDNAME"));
					opInfo.setBANKNAME(rs.getString("BANKNAME"));
					opInfo.setCARDNUM(rs.getString("CARDNUM"));
					}
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			return opInfo;
		}
		
		public static cash viewCashById(int viewID) {
			cash cInfo = new cash();
			try {
				currentCon = ConnectionManager.getConnection();
				ps = currentCon.prepareStatement("SELECT * FROM cash WHERE PAYMENTID=?");
				ps.setInt(1, viewID);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					cInfo.setCASHSTATUS(rs.getString("CASHSTATUS"));
					}
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			return cInfo;
		}
		
		public static payment viewPaymentById(int viewID) {
			payment pay = new payment();
			try {
				currentCon = ConnectionManager.getConnection();
				ps = currentCon.prepareStatement("SELECT * FROM payment WHERE PAYMENTID=?");
				ps.setInt(1, viewID);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					pay.setPAYMENTID(rs.getInt("PAYMENTID"));
					pay.setBOOKINGID(rs.getInt("BOOKINGID"));
					pay.setPAYMENTAMOUNT(rs.getDouble("PAYMENTAMOUNT"));
					pay.setPAYMENTDATE(rs.getDate("PAYMENTDATE"));
					pay.setPAYMENTTYPE(rs.getString("PAYMENTTYPE"));
					pay.setPAYMENTSTATUS(rs.getString("PAYMENTSTATUS"));
					
					}
			}
			catch(Exception E) {
				E.printStackTrace();
			}
			return pay;
		}
		
		// View RECEIPT (join payment, child) list DAO
		public static List<payment> getPaymentReceipt() {
			List<payment> list_payment = new ArrayList<payment>();
			
			try {
				currentCon = ConnectionManager.getConnection();
				ps = currentCon.prepareStatement("SELECT * FROM PAYMENT P JOIN BOOKING B ON P.BOOKINGID = B.BOOKINGID JOIN ONLINE O ON P.PAYMENTID = O.PAYMENTID");
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					payment p = new payment();
					p.setPAYMENTID(rs.getInt(rs.getInt("PAYMENTID")));
					p.setBOOKINGID(rs.getInt("BOOKINGID"));
					p.setPAYMENTAMOUNT(rs.getDouble(rs.getString("PAYMENTAMOUNT")));
					p.setPAYMENTDATE(rs.getDate("PAYMENTDATE"));
					p.setPAYMENTTYPE(rs.getString("PAYMENTTYPE"));
					p.setPAYMENTSTATUS(rs.getString("PAYMENTSTATUS"));
					
					list_payment.add(p);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return list_payment;
		}
		// View RECEIPT cash (join payment, child) list DAO
				public static List<payment> getPaymentReceiptC() {
					List<payment> list_payment = new ArrayList<payment>();
					
					try {
						currentCon = ConnectionManager.getConnection();
						ps = currentCon.prepareStatement("SELECT * FROM PAYMENT P JOIN BOOKING B ON P.BOOKINGID = B.BOOKINGID JOIN CASH C ON P.PAYMENTID = C.PAYMENTID where PAYMENTID=?");
						
						ResultSet rs = ps.executeQuery();
						
						while(rs.next()) {
							payment p = new payment();
							p.setPAYMENTID(rs.getInt(rs.getInt("PAYMENTID")));
							p.setBOOKINGID(rs.getInt("BOOKINGID"));
							p.setPAYMENTAMOUNT(rs.getDouble(rs.getString("PAYMENTAMOUNT")));
							p.setPAYMENTDATE(rs.getDate("PAYMENTDATE"));
							p.setPAYMENTSTATUS(rs.getString("PAYMENTSTATUS"));

							list_payment.add(p);
						}
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					return list_payment;
				}

	
	

}
