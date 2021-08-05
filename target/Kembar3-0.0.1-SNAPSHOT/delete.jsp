<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String id=request.getParameter("id");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_950ce46ea6e24b7", "bd654de4d40d99", "9a7d78f4");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM staff WHERE staffID="+id);
response.sendRedirect("index.jsp");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>