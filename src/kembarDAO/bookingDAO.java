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
import model.service;

public class bookingDAO {

	
	static Connection currentCon = null;
	static ResultSet rs = null; 
	static PreparedStatement ps=null;
	static Statement stmt=null;
	static int CLIENTID, SERVICEID;
	static int BOOKINGID;
	static String clientName,clientPhoneNo,clientAddress,clientEmailAdd, BOOKINGLOCATION, clientPass,SERVICETYPE, BOOKINGSTATUS, BOOKINGAPPROVAL,BOOKINGUPDATE, PAYMENTTYPE,PAYMENTSTATUS,STAFFID;
	Date BOOKINGSTARTDATE, BOOKINGENDDATE;
	double HOURS, EDITINGRATE,TOTALPRICE;
	
	
	//-----------------------------------insert booking info---------------------------	
	public void add(booking bean) {
		// clientID = bean.getClientID();
		BOOKINGID = bean.getBOOKINGID();
		BOOKINGLOCATION = bean.getBOOKINGLOCATION();
		SERVICETYPE = bean.getSERVICETYPE();
		BOOKINGSTARTDATE = (Date) bean.getBOOKINGSTARTDATE();
		BOOKINGENDDATE = (Date) bean.getBOOKINGENDDATE();
		HOURS = bean.getHOURS();
		// totalPrice = bean.getTotalPrice();
		try {
			currentCon = ConnectionManager.getConnection();
			ps = currentCon.prepareStatement("insert into BOOKING (BOOKINGLOCATION,SERVICETYPE,BOOKINGSTARTDATE,BOOKINGENDDATE,HOURS) values (?,?,?,?,?)");
			ps.setString(1,BOOKINGLOCATION);
			ps.setString(2,SERVICETYPE);
			ps.setDate(3,BOOKINGSTARTDATE);
			ps.setDate(4,BOOKINGENDDATE);
			ps.setDouble(5,HOURS);
			ps.executeUpdate();
			
			System.out.println("add booking success");
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("add booking failed");
		}
	}
	

	//view data
	public static booking getBookingById(int BOOKINGID) {
        booking b = new booking();
        System.out.print("debug booking view dao");
        try { System.out.print("debug try view");
            currentCon = ConnectionManager.getConnection();
            //String query = "select * from BOOKING where BOOKINGID=?";
            ps = currentCon.prepareStatement("select BOOKINGID,STAFFID,CLIENTID, BOOKINGSTARTDATE, BOOKINGENDDATE, BOOKINGLOCATION, SERVICETYPE, HOURS,TOTALPRICE,EDITINGRATE, BOOKINGSTATUS from BOOKING JOIN SERVICE USING (SERVICEID) where BOOKINGID=?");
            ps.setInt(1, BOOKINGID);
            ResultSet rs = ps.executeQuery(); //4. process the result
            System.out.print("debug query");

            if(rs.next()) {
                b.setBOOKINGID(rs.getInt("BOOKINGID"));
                b.setSTAFFID(rs.getString("STAFFID"));
                b.setCLIENTID(rs.getString("CLIENTID"));
                b.setBOOKINGSTARTDATE(rs.getDate("BOOKINGSTARTDATE"));
                b.setBOOKINGENDDATE(rs.getDate("BOOKINGENDDATE"));
                b.setBOOKINGLOCATION(rs.getString("BOOKINGLOCATION"));
                b.setSERVICETYPE(rs.getString("SERVICETYPE"));
                b.setHOURS(rs.getDouble("HOURS"));
                b.setTOTALPRICE(rs.getDouble("TOTALPRICE"));
                b.setEDITINGRATE(rs.getDouble("EDITINGRATE"));
                b.setBOOKINGSTATUS(rs.getString("BOOKINGSTATUS"));
                //b.setPAYMENTTYPE(rs.getString("PAYMENTTYPE"));
           //     b.setPAYMENT(rs.getString("PAYMENT"));
                System.out.print("booking view success");
            }
        }
        catch (Exception ex) {
            System.out.print("booking view failed");
            ex.printStackTrace();
        }
        return b;
    }
	
	
	
	//list BOOKING HISTORY (COMPLETED BOOKING)
		public static List<booking> getCompletedBooking() {
			List<booking> psn = new ArrayList<booking>();
			System.out.print("SATU");
			try {
				currentCon = ConnectionManager.getConnection();
				stmt = currentCon.createStatement();
				ResultSet rs = stmt.executeQuery("select BOOKINGID,STAFFID, CLIENTID, BOOKINGSTARTDATE, BOOKINGENDDATE, BOOKINGLOCATION, SERVICETYPE, HOURS,TOTALPRICE, BOOKINGSTATUS from BOOKING JOIN SERVICE USING (SERVICEID) WHERE BOOKINGSTATUS = 'Completed' OR BOOKINGSTATUS = 'Canceled'");
				//ResultSet rs = stmt.executeQuery("select * from BOOKING");
				System.out.print("DUA");	
	
				while (rs.next()) {
					booking b = new booking();
					b.setBOOKINGID(rs.getInt("BOOKINGID"));
					b.setSTAFFID(rs.getString("STAFFID"));
					b.setCLIENTID(rs.getString("CLIENTID"));
					b.setBOOKINGSTARTDATE(rs.getDate("BOOKINGSTARTDATE"));
					b.setBOOKINGENDDATE(rs.getDate("BOOKINGENDDATE"));
					b.setBOOKINGLOCATION(rs.getString("BOOKINGLOCATION"));
					b.setSERVICETYPE(rs.getString("SERVICETYPE"));
					b.setHOURS(rs.getDouble("HOURS"));
					b.setTOTALPRICE(rs.getDouble("TOTALPRICE"));
				//	b.setBOOKINGAPPROVAL(rs.getString("BOOKINGAPPROVAL"));
					b.setBOOKINGSTATUS(rs.getString("BOOKINGSTATUS"));
					//b.setPAYMENTSTATUS(rs.getString("PAYMENTSTATUS"));
				//	b.setBOOKINGUPDATE(rs.getString("BOOKINGUPDATE"));
				//	b.setPAYMENTTYPE(rs.getString("PAYMENTTYPE"));
					psn.add(b);
					System.out.print("view list booking history success");
					

				}
			} catch (SQLException e) {
				System.out.print("view list booking history failed");
				e.printStackTrace();
			}

			return psn;
		}
		
		
		// list all booking	that status pending
		public static List<booking> getAllBookingNew() {
            List<booking> psn = new ArrayList<booking>();
            System.out.print("debug set allbooking");
            try {
                currentCon = ConnectionManager.getConnection();
                stmt = currentCon.createStatement();
                ResultSet rs = stmt.executeQuery("select BOOKINGID,STAFFID,CLIENTID, BOOKINGSTARTDATE, BOOKINGENDDATE, BOOKINGLOCATION,BOOKINGSTATUS, SERVICETYPE, HOURS,EDITINGRATE,TOTALPRICE from BOOKING JOIN SERVICE USING (SERVICEID)  where  BOOKINGSTATUS = 'Processing'");
                System.out.print("view list approve booking query success");
                //
                while (rs.next()) {
                    booking b = new booking();
                    b.setBOOKINGID(rs.getInt("BOOKINGID"));
                    b.setSTAFFID(rs.getString("STAFFID"));
                    b.setCLIENTID(rs.getString("CLIENTID"));
                    b.setBOOKINGSTARTDATE(rs.getDate("BOOKINGSTARTDATE"));
                    b.setBOOKINGENDDATE(rs.getDate("BOOKINGENDDATE"));
                    b.setBOOKINGLOCATION(rs.getString("BOOKINGLOCATION"));
                    b.setSERVICETYPE(rs.getString("SERVICETYPE"));
                    b.setHOURS(rs.getDouble("HOURS"));
                    b.setEDITINGRATE(rs.getDouble("EDITINGRATE"));
                    b.setTOTALPRICE(rs.getDouble("TOTALPRICE"));
                    b.setBOOKINGSTATUS(rs.getString("BOOKINGSTATUS"));
                 //   b.setPAYMENT(rs.getString("PAYMENT"));
                    System.out.print("view list NEW booking success");
                    //b.setSTAFFID(rs.getInt("STAFFID"));
                    psn.add(b);

                }
            } catch (SQLException e) {
                System.out.print("view list NEW booking failed");
                e.printStackTrace();
            }

            return psn;
        }
		
	// list all booking	that approval approved
		public static List<booking> getAllBooking() {
            List<booking> psn = new ArrayList<booking>();
            System.out.print("debug set allbooking");
            try {
                currentCon = ConnectionManager.getConnection();
                stmt = currentCon.createStatement();
                ResultSet rs = stmt.executeQuery("select BOOKINGID,STAFFID, CLIENTID, BOOKINGSTARTDATE, BOOKINGENDDATE, BOOKINGLOCATION, SERVICETYPE, HOURS,TOTALPRICE, BOOKINGSTATUS from BOOKING JOIN SERVICE USING (SERVICEID) WHERE BOOKINGSTATUS = 'Ongoing'");
                System.out.print("view list approve booking query success");
                //
                while (rs.next()) {
                    booking b = new booking();
                    b.setBOOKINGID(rs.getInt("BOOKINGID"));
                    b.setSTAFFID(rs.getString("STAFFID"));
                    b.setCLIENTID(rs.getString("CLIENTID"));
                    b.setBOOKINGSTARTDATE(rs.getDate("BOOKINGSTARTDATE"));
                    b.setBOOKINGENDDATE(rs.getDate("BOOKINGENDDATE"));
                    b.setBOOKINGLOCATION(rs.getString("BOOKINGLOCATION"));
                    b.setSERVICETYPE(rs.getString("SERVICETYPE"));
                    b.setHOURS(rs.getDouble("HOURS"));
                    b.setTOTALPRICE(rs.getDouble("TOTALPRICE"));
                    b.setBOOKINGSTATUS(rs.getString("BOOKINGSTATUS"));
                    b.setSTAFFID(rs.getString("STAFFID"));
                    //b.setPAYMENTSTATUS(rs.getString("PAYMENTSTATUS"));
                    System.out.print("view list approve booking success");
                    psn.add(b);

                }
            } catch (SQLException e) {
                System.out.print("view list approve booking failed");
                e.printStackTrace();
            }

            return psn;
        }
		
	//delete data
		public void delete(int BOOKINGID) {
			try {
				currentCon = ConnectionManager.getConnection(); //2. establish connection
				System.out.print("try delete");
				ps = currentCon.prepareStatement("delete from BOOKING where BOOKINGID=?"); //3. create statement
				ps.setInt(1, BOOKINGID);
				ps.executeUpdate();//3. execute statement
		
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		// Update Approval
				public void UpdateApproval(booking b) {
					BOOKINGID = b.getBOOKINGID();
					STAFFID = b.getSTAFFID();
					BOOKINGSTARTDATE = b.getBOOKINGSTARTDATE();
					BOOKINGENDDATE = b.getBOOKINGENDDATE();
					BOOKINGLOCATION = b.getBOOKINGLOCATION();
					SERVICETYPE = b.getSERVICETYPE();
					HOURS = b.getHOURS();
				//	BOOKINGAPPROVAL = b.getBOOKINGAPPROVAL();
					BOOKINGSTATUS = b.getBOOKINGSTATUS();
				//	BOOKINGUPDATE = b.getBOOKINGUPDATE();
					TOTALPRICE = b.getTOTALPRICE();
					
					try {
						currentCon = ConnectionManager.getConnection(); 
						String query = "UPDATE BOOKING SET STAFFID ='"+ STAFFID + "',TOTALPRICE = '"+ TOTALPRICE +  "', BOOKINGSTATUS= '" + BOOKINGSTATUS +"'  WHERE BOOKINGID= '" + BOOKINGID + "' ";
						stmt = currentCon.createStatement();
						stmt.executeUpdate(query);
						
						/***ps.setInt(1, BOOKINGID);
						ps.setDate(2, BOOKINGSTARTDATE);
						ps.setDate(3, BOOKINGENDDATE);
						ps.setString(4, BOOKINGLOCATION);
						ps.setString(5, SERVICETYPE);
						ps.setDouble(6, HOURS);
						ps.setString(7, BOOKINGAPPROVAL);
						ps.setString(8, BOOKINGSTATUS);
						
						ps.execute();***/
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}


	
	
	
}
