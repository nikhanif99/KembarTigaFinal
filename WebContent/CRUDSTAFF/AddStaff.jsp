<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kembar Tiga</title>
</head>
<body>

<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String phone = request.getParameter("phone");
String role = request.getParameter("role");


 try
{
//System.out.print("hi");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_950ce46ea6e24b7", "bd654de4d40d99", "9a7d78f4");
Statement st = conn.createStatement();
st.executeUpdate("insert into staff (staffID, staffName, staffPhoneNo, staffRole) values ('"+id+"','"+name+"','"+phone+"','"+role+"')");
response.sendRedirect("index.jsp");
}

catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>

</body>
</html>