package kembarDAO;

import db.connection.ConnectionManager;


import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import model.staff;
import java.security.NoSuchAlgorithmException;
public class staffDAO {
	static Connection con = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null; 
	static String SUPERVISEID;
	static String STAFFNAME,STAFFPHONENO,STAFFROLE,STAFFID;
	static String STAFFEMAIL;
	static String STAFFPASS;
	
		//______________________________________________________Add Staff___________________________________________________________
	
	public void add (staff bean) {
		STAFFID = bean.getSTAFFID();
		STAFFNAME = bean.getSTAFFNAME();
		STAFFPHONENO = bean.getSTAFFPHONENO();
		STAFFROLE = bean.getSTAFFROLE();
		STAFFEMAIL = bean.getSTAFFEMAIL();
		STAFFPASS = bean.getSTAFFPASS();
		try {
			con = ConnectionManager.getConnection();			
			ps = con.prepareStatement("insert into STAFF (STAFFID,STAFFNAME,STAFFPHONENO,STAFFROLE,STAFFPASS,STAFFEMAIL) values (?,?,?,?,?,?)");
			ps.setString(1,STAFFID);
			ps.setString(2,STAFFNAME);
			ps.setString(3,STAFFPHONENO);
			ps.setString(4,STAFFROLE);
			ps.setString(5,"123");
			ps.setString(6,STAFFEMAIL);
			ps.executeUpdate();
			System.out.println("jadi");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	//____________________________________________________________________________List STAFF detail_____________________________________________________________________________________

    public static List<staff> getStaffAssign() {
        List<staff> stf = new ArrayList<staff>();
        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select STAFFID from STAFF");

            while (rs.next()) {
                staff s = new staff();
               
                s.setSTAFFID(rs.getString("STAFFID"));
             
                stf.add(s);
                System.out.println("LIST STAFF ASSIGN CONNECT");

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("LIST STAFF ASSING XCONNECT");
        }
    

        return stf;
    }
	
	//____________________________________________________________________________List STAFF detail_____________________________________________________________________________________

    public static List<staff> getStaff() {
        List<staff> stf = new ArrayList<staff>();
        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from STAFF");

            while (rs.next()) {
                staff s = new staff();
                s.setSTAFFID(rs.getString("STAFFID"));
                s.setSTAFFNAME(rs.getString("STAFFNAME"));
                s.setSTAFFPHONENO(rs.getString("STAFFPHONENO"));
                s.setSTAFFROLE(rs.getString("STAFFROLE"));
                s.setSUPERVISEID(rs.getString("SUPERVISEID"));
            
                stf.add(s);
                System.out.println("LIST STAFF CONNECT");

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("LIST STAFF XCONNECT");
        }

        return stf;
    }
    //View
    public static staff getStaffById(String STAFFID) {
		staff s = new staff();
		try {
			con = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection	
			//String query = "select * from person where id=?";
			ps = con.prepareStatement("select * from STAFF where STAFFID=?");
			ps.setString(1, STAFFID);
			ResultSet rs = ps.executeQuery(); //4. process the result
			
			if(rs.next()) {
				s.setSTAFFID(rs.getString("STAFFID"));
				s.setSTAFFNAME(rs.getString("STAFFNAME"));
				s.setSTAFFPHONENO(rs.getString("STAFFPHONENO"));
				s.setSTAFFROLE(rs.getString("STAFFROLE"));
				s.setSUPERVISEID(rs.getString("SUPERVISEID"));
				s.setSTAFFEMAIL(rs.getString("STAFFEMAIL"));
				s.setSTAFFPASS(rs.getString("STAFFPASS"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return s;
		
		
}
  //__________________________________________________________________Update data___________________________________________________________________________________
  	public void staffUpdate (staff s) {
  		
  		STAFFID = s.getSTAFFID();
  		STAFFNAME = s.getSTAFFNAME();
  		STAFFPHONENO = s.getSTAFFPHONENO();
  		STAFFROLE = s.getSTAFFROLE();
  		STAFFEMAIL = s.getSTAFFEMAIL();
  		STAFFPASS = s.getSTAFFPASS();
  		//SUPERVISEID = s.getSUPERVISEID();

          try {
          	con = ConnectionManager.getConnection(); 
              //ps = con.prepareStatement("UPDATE STAFF SET STAFFNAME= '" + STAFFNAME + "', STAFFPHONENO = '" + STAFFPHONENO + "' , STAFFROLE = '" + STAFFROLE + "' , SUPERVISEID = '" + SUPERVISEID + "' WHERE STAFFID='"+ STAFFID + "'");
              String query = "UPDATE STAFF SET STAFFNAME= '" + STAFFNAME + "', STAFFPHONENO = '" + STAFFPHONENO + "' , STAFFROLE = '" + STAFFROLE + "', STAFFEMAIL = '" + STAFFEMAIL + "', STAFFPASS = '" + STAFFPASS + "' WHERE STAFFID='"+ STAFFID + "'";
              stmt = con.createStatement();
              stmt.executeUpdate(query);
              System.out.println("masuk");
  			//ps.executeUpdate();
  			
          }
          catch(Exception e) {
              e.printStackTrace();
          }
      }
  	//____________Delete_____________
  	public static List<staff> getAllStaff() { 
        List<staff> stf = new ArrayList<staff>();
        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from STAFF");

            while(rs.next()) {
                staff s = new staff();
                s.setSTAFFID(rs.getString("STAFFID"));
                s.setSTAFFNAME(rs.getString("STAFFNAME"));
                s.setSTAFFPHONENO(rs.getString("STAFFPHONENO"));
                s.setSTAFFROLE(rs.getString("STAFFROLE"));
				s.setSUPERVISEID(rs.getString("SUPERVISEID"));
              

                System.out.println("W");
                stf.add(s);

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("L");
        }
        return stf;
    }
  	public void deleteStaff(String STAFFID) {
        try {
            con = ConnectionManager.getConnection(); 
            ps = con.prepareStatement("delete from STAFF where STAFFID=?");
            ps.setString(1, STAFFID);
            ps.executeUpdate();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
  //method for login
	public static staff login(staff bean) throws NoSuchAlgorithmException{
		staff currentstaff = new staff();
		//get email and password
		STAFFEMAIL = bean.getSTAFFEMAIL();
		STAFFPASS = bean.getSTAFFPASS();


		String query = "select * from STAFF where STAFFEMAIL='" + STAFFEMAIL + "'AND STAFFPASS='" + STAFFPASS + "'";

		try {
			con = ConnectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			boolean more = rs.next();

			// if user exists set the isValid variable to true
			if (more) {
				String STAFFID = rs.getString("STAFFID");
				String STAFFPASS = rs.getString("STAFFPASS");
				String STAFFNAME = rs.getString("STAFFNAME");
				String STAFFPHONENO = rs.getString("STAFFPHONENO");
				String STAFFROLE = rs.getString("STAFFROLE");
				String STAFFEMAIL = rs.getString("STAFFEMAIL");
				currentstaff.setSTAFFID(STAFFID);
				currentstaff.setSTAFFPASS(STAFFPASS);
				currentstaff.setSTAFFNAME(STAFFNAME);
				currentstaff.setSTAFFPHONENO(STAFFPHONENO);
				currentstaff.setSTAFFROLE(STAFFROLE);
				currentstaff.setSTAFFEMAIL(STAFFEMAIL);
				
				System.out.println(STAFFEMAIL);
				currentstaff.setValid(true);
			}
			// if user does not exist set the isValid variable to false
			else if (!more) {
				currentstaff.setValid(false);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return currentstaff;
	}
	public static  staff getStaff(String STAFFID) {
		staff p = new staff();
		
		try {
			con = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection	
			//String query = "select * from supplier where id=?";
			ps = con.prepareStatement("select * from STAFF where STAFFEMAIL=?");
			ps.setString(1, STAFFID);
			ResultSet rs = ps.executeQuery(); //4. process the result
			
			if(rs.next()) {
				p.setSTAFFID(rs.getString("STAFFID"));
				p.setSTAFFNAME(rs.getString("STAFFNAME"));
				p.setSTAFFPHONENO(rs.getString("STAFFPHONENO"));
				p.setSTAFFROLE(rs.getString("STAFFROLE"));
				p.setSTAFFEMAIL(rs.getString("STAFFEMAIL"));
				System.out.println("VIEW STAFF SUCCESS");
				
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("VIEW STAFF FAIL");
		}
		return p;
	}
}
