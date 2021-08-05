<%@page import="java.sql.*"%>
<link rel="stylesheet" href="css/style.css"/>
<body background="camerabg2.jpg" style="background-repeat:no-repeat; background-cover:cover; background-attachment:fixed; background-size:cover">
<h1 align="center" style="color:white"><font><strong>STAFF LIST</strong></font></h1>
<table align="center" cellpadding="5" cellspacing="5" border="10" style="border-color:#800000">
<tr>

</tr>
<tr bgcolor="#FF9900">
<td><b style="color:white">Staff ID</b></td>
<td><b style="color:white">Staff Name</b></td>
<td><b style="color:white">Staff Phone Number</b></td>
<td><b style="color:white">Role</b></td>
<td><b style="color:white">Action</b></td>
<script>
          function confirmation(){
            if(confirm('Do you really want to remove ?'))
              return true;
            return false;
          }
</script>
</tr>
	<%
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_950ce46ea6e24b7", "bd654de4d40d99", "9a7d78f4");
	Statement st = conn.createStatement();
	
	String sql ="SELECT * FROM staff";
	
	ResultSet resultSet = st.executeQuery(sql);
	while(resultSet.next()){
	%>
	<tr bgcolor="#DEB887">
	
	<td><%=resultSet.getString("staffID") %></td>
	<td><%=resultSet.getString("staffName") %></td>
	<td><%=resultSet.getString("staffPhoneNo") %></td>
	<td><%=resultSet.getString("staffRole") %></td>
	
	
		<td align="center">
		<a href="updateDetail.jsp?id=<%=resultSet.getString("staffID")%>"><button type="button" class="update">Update</button></a>
		&nbsp;
		<a onclick='return confirmation()' href="delete.jsp?id=<%=resultSet.getString("staffID") %>"><button type="button" class="delete">Delete</button></a>
		</td>
	</tr>
	
	
	<% 
	}
	
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
	
	</table>
<br><br>
<center>
<button><a href="AddStaffPage.jsp">Add New Staff</a></button>
</center>
</body>	
	