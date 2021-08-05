
<%@page import="java.sql.*"%>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_950ce46ea6e24b7";%>
<%!String user = "bd654de4d40d99";%>
<%!String psw = "9a7d78f4";%>

<%

String id = request.getParameter("id");
String name = request.getParameter("name");
String phone = request.getParameter("phone");
String role =request.getParameter("role");


Connection con = null;
PreparedStatement ps = null;
String staffID = request.getParameter("id");
if(id != null)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,user,psw);
		  Connection conn = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_950ce46ea6e24b7", "bd654de4d40d99", "9a7d78f4");
		  String sql = "Update staff set staffID=?, staffName=? ,staffPhoneNo=?, staffRole=? where staffID="+id;
		  ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, phone);
			ps.setString(4, role);
		  
		       
			int i = ps.executeUpdate();
			if(i>0)
			{
			response.sendRedirect("index.jsp");
			}
			else
			{
			out.print("There is a problem in updating Record.");
			}
		                
	}
	catch(SQLException sql)
	{
		request.setAttribute("error",sql);
		out.println(sql);
	}
}	
%>