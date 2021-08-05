package kembarDAO;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.connection.*;
import model.client;


public class clientDAO {

	static Connection currentCon = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null; 

	static int BOOKINGID;
	static String CLIENTNAME,CLIENTPHONENO,CLIENTADDRESS,CLIENTEMAILADD, BOOKINGLOCATION, CLIENTPASS;
	Date BOOKINGSTARTDATE, BOOKINGENDDATE;
	double TOTALPRICE;
	static String CLIENTID;
	
	
	// INSERT client DETAIL-----------------------------------------------------------------------
			public void registerClient(client bean) throws NoSuchAlgorithmException {
				
				CLIENTID = bean.getCLIENTID();
				CLIENTNAME = bean.getCLIENTNAME();
				CLIENTPHONENO  = bean.getCLIENTPHONENO();
				CLIENTADDRESS = bean.getCLIENTADDRESS();
				CLIENTPASS = bean.getCLIENTPASS();
				
				
				

				
				try {
	                    
					currentCon = ConnectionManager.getConnection();			
					ps = currentCon.prepareStatement("insert into CLIENT (CLIENTID,CLIENTNAME,CLIENTPHONENO,CLIENTADDRESS,CLIENTPASS) values (?,?,?,?,?)");
					
					ps.setString(1,CLIENTID);
					ps.setString(2,CLIENTNAME);
					ps.setString(3,CLIENTPHONENO);
					ps.setString(4,CLIENTADDRESS);
					ps.setString(5,CLIENTPASS);
				
					ps.executeUpdate();
					System.out.println("REGISTER CLIENT SUCCESS");
					currentCon.close();
	                }
				
				catch (Exception ex) {
					ex.printStackTrace();
					System.out.println("REGISTER CLIENT FAIL");
				}
			}
		//--------------------------------------------------------------
	

			
	//-----------------------------------insert booking info---------------------------	
		
//______________________________________________________________________View client___________________________________________________________________________________
		
		public static client viewclient(String CLIENTID) {
			client c = new client();
			try {
				currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection	
				//String query = "select * from person where id=?";
				ps = currentCon.prepareStatement("select * from CLIENT where CLIENTID=?");
				ps.setString(1, CLIENTID);
				ResultSet rs = ps.executeQuery(); //4. process the result
				
				if(rs.next()) {
					c.setCLIENTID(rs.getString("CLIENTID"));
					c.setCLIENTNAME(rs.getString("CLIENTNAME"));
					c.setCLIENTPHONENO(rs.getString("CLIENTPHONENO"));
					c.setCLIENTADDRESS(rs.getString("CLIENTADDRESS"));
				
					
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			return c;
		}
		
		//method for login
				public static client login(client bean) throws NoSuchAlgorithmException{
					//get id and password
					 client currentclient = new client();
					CLIENTID = bean.getCLIENTID();
					CLIENTPASS = bean.getCLIENTPASS();
					
					String query = "select * from CLIENT where CLIENTID='" + CLIENTID + "'AND CLIENTPASS='" + CLIENTPASS + "'";

					try {
						currentCon = ConnectionManager.getConnection();
						stmt = currentCon.createStatement();
						rs = stmt.executeQuery(query);
						boolean more = rs.next();

						// if user exists set the isValid variable to true
						if (more) {
							String CLIENTID = rs.getString("CLIENTID");
							String CLIENTPASS = rs.getString("CLIENTPASS");
							String CLIENTNAME = rs.getString("CLIENTNAME");
							String CLIENTPHONENO = rs.getString("CLIENTPHONENO");
							String CLIENTADDRESS = rs.getString("CLIENTADDRESS");
							
							currentclient.setCLIENTID(CLIENTID);
							currentclient.setCLIENTNAME(CLIENTNAME);
							currentclient.setCLIENTPHONENO(CLIENTPHONENO);
							currentclient.setCLIENTADDRESS(CLIENTADDRESS);
							currentclient.setCLIENTPASS(CLIENTPASS);
							
							
							System.out.println(CLIENTID);
							currentclient.setValid(true);
						}
						// if user does not exist set the isValid variable to false
						else if (!more) {
							currentclient.setValid(false);
						}

					} catch (SQLException e) {
						e.printStackTrace();
					}

					return currentclient;
				}
				
				//------------------view client detail----------------------
				public static  client getclient(String CLIENTID) {
					client c = new client();
					
					try {
						currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection	
						//String query = "select * from supplier where id=?";
						ps = currentCon.prepareStatement("select * from CLIENT where CLIENTID=?");
						ps.setString(1, CLIENTID);
						ResultSet rs = ps.executeQuery(); //4. process the result
						
						if(rs.next()) {
							c.setCLIENTID(rs.getString("CLIENTID"));
							c.setCLIENTNAME(rs.getString("CLIENTNAME"));
							c.setCLIENTPHONENO(rs.getString("CLIENTPHONENO"));
							c.setCLIENTADDRESS(rs.getString("CLIENTADDRESS"));
							c.setCLIENTEMAILADD (rs.getString("CLIENTEMAILADD"));
						   
							System.out.println("VIEW CLIENT SUCCESS");
							
						}
					}
					catch (Exception ex) {
						ex.printStackTrace();
						System.out.println("VIEW CLIENT FAIL");
					}
					return c;
				}
//update client registration
				
				public static void updateStudent(client bean) {
					CLIENTID = bean.getCLIENTID();
					CLIENTNAME = bean.getCLIENTNAME();
					CLIENTPHONENO = bean.getCLIENTPHONENO();
					CLIENTADDRESS = bean.getCLIENTADDRESS();
					CLIENTEMAILADD = bean.getCLIENTEMAILADD();
					CLIENTPASS = bean.getCLIENTPASS();
				
					
						
					try {
						currentCon = ConnectionManager.getConnection(); //2. establish connection			
						String query = "UPDATE client SET CLIENTNAME= '" + CLIENTNAME + "', CLIENTPHONENO= '" + CLIENTPHONENO + "', CLIENTADDRESS= '" + CLIENTADDRESS + "' , CLIENTEMAILADD= '"+ CLIENTEMAILADD + "' , 	CLIENTPASS= '" + CLIENTPASS +  "'  WHERE CLIENTID= '"+ CLIENTID +"' ";
						stmt = currentCon.createStatement(); //3. create statement
						stmt.executeUpdate(query);			
					}
					catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				public static  client getclientById(int CLIENTID) {
					client c = new client();
					
					try {
						currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection	
						//String query = "select * from supplier where id=?";
						ps = currentCon.prepareStatement("select * from client where CLIENTID=?");
						ps.setInt(1, CLIENTID);
						ResultSet rs = ps.executeQuery(); //4. process the result
						
						if(rs.next()) {
							
							c.setCLIENTID(rs.getString("CLIENTID"));
							c.setCLIENTNAME(rs.getString("CLIENTNAME"));
							c.setCLIENTPHONENO(rs.getString("CLIENTPHONENO"));
							c.setCLIENTADDRESS(rs.getString("CLIENTADDRESS"));
							c.setCLIENTEMAILADD (rs.getString("CLIENTEMAILADD"));
							System.out.println("VIEW client SUCCESS");
							
						}
					}
					catch (Exception ex) {
						ex.printStackTrace();
						System.out.println("VIEW client FAIL");
					}
					return c;
				}
//				public void add1(roomDetails r) {
//					ROOM_ID	 = r.getROOM_ID();
//					ROOM_FLOOR = r.getROOM_FLOOR();
//					STUD_ID = r.getSTUD_ID();
//					try {
//						con = ConnectionManager.getConnection();
//						ps = con.prepareStatement("insert into registration (STUD_ID,REG_DATE,REG_RESULT) values (?,?,?)");
//						ps.setInt(1,ROOM_ID);
//						ps.setInt(2,ROOM_FLOOR);
//						ps.setInt(3, STUD_ID);
//						ps.executeUpdate();
//					}
//					catch (Exception ex) {
//						ex.printStackTrace();
//					}
//					
//				}
//				public static List<roomDetails> getRoom() {
//			        List<roomDetails> room = new ArrayList<roomDetails>();
//			        try {
//			            con = ConnectionManager.getConnection();
//			            stmt = con.createStatement();
//			            ResultSet rs = stmt.executeQuery("select * from room");
//
//			            while (rs.next()) {
//			            	roomDetails r = new roomDetails();
//			                r.setROOM_ID(rs.getInt("ROOM_ID"));
//			                r.setROOM_FLOOR(rs.getInt("ROOM_FLOOR"));
//			                r.setSTUD_ID(rs.getInt("STUD_ID"));
//			               
//			            
//			                room.add(r);
//			                System.out.println("LIST CUST W");
//
//			            }
//			        } catch (SQLException e) {
//			            e.printStackTrace();
//			            System.out.println("LIST CUST L");
//			        }
//
//			        return room;
			 //   }
				
				
				//search client
				public static  client searchclient(int CLIENTID) {
					client c = new client();
					
					try {
						currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection	
						//String query = "select * from supplier where id=?";
						ps = currentCon.prepareStatement("select * from client where CLIENTID=?");
						ps.setInt(1, CLIENTID);
						ResultSet rs = ps.executeQuery(); //4. process the result
						
						if(rs.next()) {
							
							c.setCLIENTID(rs.getString("CLIENTID"));
							c.setCLIENTNAME(rs.getString("CLIENTNAME"));
							c.setCLIENTPHONENO(rs.getString("CLIENTPHONENO"));
							c.setCLIENTADDRESS(rs.getString("CLIENTADDRESS"));
							c.setCLIENTEMAILADD (rs.getString("CLIENTEMAILADD"));
							System.out.println("search client SUCCESS");
							
						}
					}
					catch (Exception ex) {
						ex.printStackTrace();
						System.out.println("SEARCH client FAIL");
					}
					return c;
				}
				
}

