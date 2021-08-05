package kembarDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.connection.*;
import model.booking;
import model.service;

public class clientBookingDAO {

	
	static Connection currentCon = null;
	static ResultSet rs = null; 
	static PreparedStatement ps=null;
	static Statement stmt=null;
	static int STAFFID, SERVICEID, PAYMENTID,BOOKINGID;
	static String BOOKINGLOCATION,SERVICETYPE, BOOKINGAPPROVAL, BOOKINGSTATUS, BOOKINGUPDATE,CLIENTID;
	static Date BOOKINGSTARTDATE, BOOKINGENDDATE;
	static double TOTALPRICE, HOURS;
	
	
	//-----------------------------------insert booking info---------------------------	
	public void add(booking bean) {
		// clientID = bean.getClientID();
		CLIENTID = bean.getCLIENTID();
		BOOKINGLOCATION = bean.getBOOKINGLOCATION();
		SERVICEID = bean.getSERVICEID();
		//SERVICETYPE = bean.getSERVICETYPE();
		BOOKINGSTARTDATE = (Date) bean.getBOOKINGSTARTDATE();
		BOOKINGENDDATE = (Date) bean.getBOOKINGENDDATE();
		HOURS = bean.getHOURS();
		// totalPrice = bean.getTotalPrice();
		try {
			currentCon = ConnectionManager.getConnection();
			
			//service s = serviceDAO.getservice(SERVICEID);
			
			
			ps = currentCon.prepareStatement("insert into BOOKING (BOOKINGLOCATION,SERVICEID,BOOKINGSTARTDATE,BOOKINGENDDATE,HOURS,CLIENTID) values (?,?,?,?,?,?)");
			
			ps.setString(1,BOOKINGLOCATION);
			ps.setInt(2,SERVICEID);
			ps.setDate(3,BOOKINGSTARTDATE);
			ps.setDate(4,BOOKINGENDDATE);
			ps.setDouble(5,HOURS);
			ps.setString(6,CLIENTID);
			
			ps.executeUpdate();
			
			System.out.println("add booking success");
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("add booking failed");
		}
		
	}
	/**public int addBooking(booking bk) {

        String BOOKINGLOCATION = bk.getBOOKINGLOCATION();
		int SERVICEID = bk.getSERVICEID();
        Date BOOKINGSTARTDATE = bk.getBOOKINGSTARTDATE();
		Date BOOKINGENDDATE = bk.getBOOKINGENDDATE();
		//int CLIENTID = bk.getCLIENTID();
		double HOURS = bk.getHOURS();
        
        int BOOKINGID = 0;

        currentCon = ConnectionManager.getConnection();

            try {
                PreparedStatement ps = currentCon.prepareStatement("INSERT INTO BOOKING(BOOKINGLOCATION,SERVICEID,BOOKINGSTARTDATE,BOOKINGENDDATE,HOURS,CLIENTID) VALUES(?,?,?,?,?,?,?)", new String[] {"BOOKINGID"});
                ps.setString(1, BOOKINGLOCATION);
                ps.setInt(2, SERVICEID);
                ps.setDate(3, BOOKINGSTARTDATE);
				ps.setDate(4, BOOKINGENDDATE);
				ps.setDouble(5, HOURS);
				ps.setInt(6, '2');
				

                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();

                if(rs.next()) {
                    int BOOKINID = rs.getInt(1);
                    System.out.println("BOOKING id in DAO :"+ BOOKINID);

                    BOOKINGID = BOOKINID;
                }
            }    catch(SQLException e) {
                e.printStackTrace();
            }

            return BOOKINGID;
    }*/

	
	//-----------------------------------view booking info---------------------------	
	public static booking getBookingByID (String BOOKINGID){
        booking b = new booking();
        try {
        	currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection
            //String query = "select * from person where id=?";
        	System.out.println("CONNECTION TEST");
        	//("SELECT DISTINCT b.bookingID, b.bookingTime, b.bookingDate, b.packageID, b.facilityID, b.custID, b.bookingPrice, b.bookingStatus FROM booking b INNER JOIN facility f ON b.facilityID = f.facilityID INNER JOIN booking b1 ON f.facilityID =  b1.facilityID INNER JOIN package p ON b1.packageID = p.packageID INNER JOIN booking b2 ON p.packageID = b2.packageID INNER JOIN customer c ON b2.custID = c.custID");		
			
        	ps = currentCon.prepareStatement("SELECT BOOKINGID, BOOKINGLOCATION, SERVICEID, SERVICETYPE, BOOKINGSTARTDATE, BOOKINGENDDATE, HOURS from BOOKING JOIN SERVICE USING (SERVICEID) where BOOKINGID=?");
            ps.setString(1, BOOKINGID);
            ResultSet rs = ps.executeQuery(); //4. process the result

            if(rs.next()) {
            	b.setBOOKINGID(rs.getInt("BOOKINGID"));
				b.setBOOKINGLOCATION(rs.getString("BOOKINGLOCATION"));
				b.setBOOKINGSTARTDATE(rs.getDate("BOOKINGSTARTDATE"));
				b.setBOOKINGENDDATE(rs.getDate("BOOKINGENDDATE"));
				b.setHOURS(rs.getDouble("HOURS"));
				b.setSERVICEID(rs.getInt("SERVICEID"));
                System.out.println("Booking View Success");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println ("View booking update failed");
        }
        return b;
    }
	
	//-----------------------------------update booking info---------------------------	
	public void updateBooking(booking bean) {
		BOOKINGID = bean.getBOOKINGID();
		BOOKINGLOCATION = bean.getBOOKINGLOCATION();
		SERVICEID = bean.getSERVICEID();
		BOOKINGSTARTDATE = bean.getBOOKINGSTARTDATE();
		BOOKINGENDDATE = bean.getBOOKINGENDDATE();
		HOURS = bean.getHOURS();
		System.out.println(BOOKINGID);
		System.out.println(BOOKINGLOCATION);
		System.out.println(SERVICEID);
		System.out.println(BOOKINGSTARTDATE);
		System.out.println(BOOKINGENDDATE);
		System.out.println(HOURS);
		 try {
			currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection
            //String query = "select * from person where id=?";
			
			ps = currentCon.prepareStatement("UPDATE BOOKING SET BOOKINGLOCATION = ?, SERVICEID =?, BOOKINGSTARTDATE=?, BOOKINGENDDATE=?, HOURS=? WHERE BOOKINGID =?");
			
			ps.setString(1,BOOKINGLOCATION);
			ps.setInt(2,SERVICEID);
			ps.setDate(3,BOOKINGSTARTDATE);
			ps.setDate(4,BOOKINGENDDATE);
			ps.setDouble(5,HOURS);
			ps.setInt(6,BOOKINGID);
			ps.executeUpdate();
			System.out.println("Update booking Success");
			
					
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println ("Update booking failed");
		}
	}
	
	//-----------------------------------delete booking info---------------------------
	public void deleteBooking(String BOOKINGID) {
		try {
			currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection
            //String query = "select * from person where id=?";
        	ps = currentCon.prepareStatement("DELETE FROM booking WHERE BOOKINGID=?");
			ps.setString(1, BOOKINGID);
			System.out.println("Delete booking Success");
			ps.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Delete booking failed");
		}
	}
	
	//-----------------------------------list of booking info---------------------------
	public static List<booking> listbooking(){
		
		List<booking> book = new ArrayList<booking>();
		try {
			currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection
            //String query = "select * from person where id=?";
        	ps = currentCon.prepareStatement("select BOOKINGID, BOOKINGLOCATION,SERVICEID, SERVICETYPE, BOOKINGSTARTDATE, BOOKINGENDDATE, HOURS, BOOKINGSTATUS FROM BOOKING JOIN SERVICE USING (SERVICEID)");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				booking newbook = new booking();
				newbook.setBOOKINGID(rs.getInt("BOOKINGID"));
				newbook.setBOOKINGLOCATION(rs.getString("BOOKINGLOCATION"));
				newbook.setSERVICETYPE(rs.getString("SERVICETYPE"));
				newbook.setBOOKINGSTARTDATE(rs.getDate("BOOKINGSTARTDATE"));
				newbook.setBOOKINGENDDATE(rs.getDate("BOOKINGENDDATE"));
				newbook.setHOURS(rs.getDouble("HOURS"));
				newbook.setBOOKINGSTATUS(rs.getString("BOOKINGSTATUS"));
				newbook.setSERVICEID(rs.getInt("SERVICEID"));
				newbook.getCLIENTID();
				//newbook.setSTAFFID(rs.getInt("STAFFID"));
				//newbook.setPAYMENTID(rs.getInt("PAYMENTID"));
				
				book.add(newbook);
				System.out.println("View List success");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("View booking list failed");
		}
		
		return book;
	}
public static List<booking> listbookingByEmail(String viewEmail){
		
		List<booking> book = new ArrayList<booking>();
		try {
			currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection
            //String query = "select * from person where id=?";
        	ps = currentCon.prepareStatement("select BOOKINGID, BOOKINGLOCATION,SERVICEID, SERVICETYPE,EDITINGRATE, BOOKINGSTARTDATE, BOOKINGENDDATE, HOURS, BOOKINGSTATUS FROM BOOKING JOIN SERVICE USING (SERVICEID) WHERE CLIENTID=?");
			ps.setString(1,viewEmail);
        	ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				booking newbook = new booking();
				newbook.setBOOKINGID(rs.getInt("BOOKINGID"));
				newbook.setBOOKINGLOCATION(rs.getString("BOOKINGLOCATION"));
				newbook.setSERVICETYPE(rs.getString("SERVICETYPE"));
				newbook.setBOOKINGSTARTDATE(rs.getDate("BOOKINGSTARTDATE"));
				newbook.setBOOKINGENDDATE(rs.getDate("BOOKINGENDDATE"));
				newbook.setHOURS(rs.getDouble("HOURS"));
				newbook.setBOOKINGSTATUS(rs.getString("BOOKINGSTATUS"));
				newbook.setSERVICEID(rs.getInt("SERVICEID"));
				newbook.setEDITINGRATE(rs.getDouble("EDITINGRATE"));
				newbook.getCLIENTID();
				//newbook.setSTAFFID(rs.getInt("STAFFID"));
				//newbook.setPAYMENTID(rs.getInt("PAYMENTID"));
				
				book.add(newbook);
				System.out.println("View List success");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("View booking list failed");
		}
		
		return book;
	}
}
