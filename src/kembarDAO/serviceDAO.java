package kembarDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.connection.ConnectionManager;

import model.service;


public class serviceDAO {
	static Connection currentCon = null;
	static ResultSet rs = null; 
	static PreparedStatement ps=null;
	static Statement stmt=null;
	static int SERVICEID;
	static String SERVICETYPE;
	double serviceTotalPrice, albumPrintPrice,EDITINGRATE, hourlyRate,hours;
	
	
	
	//-----------------------------------insert service info---------------------------	
			public void addservice(service bean) {
				SERVICEID = bean.getSERVICEID();
				SERVICETYPE = bean.getSERVICETYPE();
				EDITINGRATE = bean.getEDITINGRATE();
			
				try {
					currentCon = ConnectionManager.getConnection();
					ps = currentCon.prepareStatement("insert into SERVICE (SERVICETYPE,EDITINGRATE) values (?,?)");
					
					ps.setString(1,SERVICETYPE);
					ps.setDouble(2,EDITINGRATE);
					
					ps.executeUpdate();
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
				
			}
			
//			//-----------------------------------insert photo info---------------------------	
//			public void addphoto(photography bean) {
//				SERVICEID = bean.getSERVICEID();
//			
//				EDITINGRATE = bean.getEDITINGRATE();
//				try {
//					currentCon = ConnectionManager.getConnection();
//					ps = currentCon.prepareStatement("insert into PHOTOGRAPHY (SERVICEID,ALBUMPRINTPRICE,EDITINGRATE) values (?,?,?)");
//					ps.setInt(1,SERVICEID);
//					ps.setDouble(2,albumPrintPrice);
//					ps.setDouble(3,EDITINGRATE);
//					
//					ps.executeUpdate();
//				}
//				catch (Exception ex) {
//					ex.printStackTrace();
//				}
//				
//			}
//			//-----------------------------------insert video info---------------------------	
//			public void addvideo(videography bean) {
//				SERVICEID = bean.getSERVICEID();
//				
//				EDITINGRATE = bean.getEDITINGRATE();
//			//	hours = bean.getHours();
//				try {
//					currentCon = ConnectionManager.getConnection();
//					ps = currentCon.prepareStatement("insert into VIDEOGRAPHY (SERVICEID,ALBUMPRINTPRICE,EDITINGRATE) values (?,?,?)");
//					ps.setInt(1,SERVICEID);
//					ps.setDouble(2,albumPrintPrice);
//					ps.setDouble(3,EDITINGRATE);
//					
//					ps.executeUpdate();
//					System.out.println("Insert video success");
//				}
//				catch (Exception ex) {
//					ex.printStackTrace();
//				}
//				
//			}
//			
			
			
			
	 //-----------------------------------update service------------------------------
    public void updateservice(service bean) {
    	SERVICEID = bean.getSERVICEID();
    	SERVICETYPE =bean.getSERVICETYPE();
    	EDITINGRATE =bean.getEDITINGRATE();
	
		
        try {
        	currentCon = ConnectionManager.getConnection(); //2. establish connection
        	String query = "UPDATE SERVICE SET SERVICEID = '" + SERVICEID + "' , SERVICETYPE= '" + SERVICETYPE + "' , EDITINGRATE= '" + EDITINGRATE +  "'  WHERE SERVICEID= '"+ SERVICEID +"' ";
            stmt = currentCon.createStatement(); //3. create statement
            stmt.executeUpdate(query);
            System.out.println("Update service Success");

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
   
    
 //--------------------------------------------VIEW service ---------------------------------------------------------
    public static service getservice(int SERVICEID) {
        service s = new service();

        try {
        	currentCon = ConnectionManager.getConnection(); //2. call the method from ConnectionManager class to establish connection
            //String query = "select * from supplier where id=?";
            ps = currentCon.prepareStatement("SELECT * FROM SERVICE where SERVICEID=?");
            ps.setInt(1, SERVICEID);
            ResultSet rs = ps.executeQuery(); //4. process the result

            if(rs.next()) {
               
                s.setSERVICEID(rs.getInt("SERVICEID"));
                s.setSERVICETYPE(rs.getString("SERVICETYPE"));
                s.setEDITINGRATE(rs.getDouble("EDITINGRATE"));
             
                
              
                System.out.println("VIEW service SUCCESS");

            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("VIEW service FAIL");
        }
        return s;
    }
    
	//LIST service DETAILS---------------------------------------------------------

	   public static List<service> listservice() {
	        List<service> psnlistservice = new ArrayList<service>();
	          try {
	            	currentCon = ConnectionManager.getConnection();
	                stmt = currentCon.createStatement();
	             //   ResultSet rs = stmt.executeQuery("SELECT S.*,P.EDITINGRATE FROM SERVICES S INNER JOIN PHOTOGRAPHY P ON S.SERVICEID = P.SERVICEID");
		          ResultSet rs = stmt.executeQuery("SELECT * FROM SERVICE");

	                while (rs.next()) {
	                	service s = new service();
	                    s.setSERVICEID(rs.getInt("SERVICEID"));
	                    s.setSERVICETYPE(rs.getString("SERVICETYPE"));
	                    s.setEDITINGRATE(rs.getDouble("EDITINGRATE"));
	                   
	        
	                    psnlistservice.add(s);
	                    System.out.println("LIST service DETAIL SUCCESS");

	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	                System.out.println("LIST service DETAIL FAIL");
	            }

	            return psnlistservice;
	        }
	//-------------------------------------------------------
    
    
    
    
  //----------------------------------delete service details------------------------
    public void deleteservice(int SERVICEID) {
    	 try {
             currentCon = ConnectionManager.getConnection();
             ps = currentCon.prepareStatement("DELETE FROM SERVICE WHERE SERVICEID=?");
             ps.setInt(1, SERVICEID);

             ps.execute();
         }
         catch(Exception e) {
             e.printStackTrace();
         }
     }
}
