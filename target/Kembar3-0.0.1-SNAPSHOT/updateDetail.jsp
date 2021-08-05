<link rel="stylesheet" href="css/style.css"/>
<%@page import="java.sql.*"%>
	<%
	String id = request.getParameter("id");
	String driver = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/";
	String database = "heroku_950ce46ea6e24b7";
	String userid = "bd654de4d40d99";
	String password = "9a7d78f4";
	
	try {
	Class.forName(driver);
	} 
	catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	%>
	<%
	try{
	connection = DriverManager.getConnection(connectionUrl+database, userid, password);
	statement=connection.createStatement();
	String sql ="select * from staff where staffID="+id;
	resultSet = statement.executeQuery(sql);
	
	while(resultSet.next()){
	%>
	
	<!DOCTYPE html>
	
	<html>
	 <style>
    * {
      box-sizing: border-box;
    }

    input[type=text],
    [type=email],[type=number],
    select,
    textarea {
      width: 350px;
      padding: 12px;
      border: 1px solid #ccc;
      border-radius: 4px;
      resize: vertical;
    }

    label {
      padding: 12px 12px 12px 0;
      display: inline-block;
    }

    input[type=submit] {
      background-color: #4CAF50;
      color: white;
      padding: 12px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      float: right;
    }
    input[type=reset] {
      background-color: #4CAF50;
      color: white;
      padding: 12px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      float: left;
    }

    input[type=submit]:hover {
      background-color: #45a049;
    }
    input[type=reset]:hover {
      background-color: #45a049;
    }

    input[type=button] {
      background-color: #4CAF50;
      color: white;
      padding: 12px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      float: right;
    }

    input[type=button]:hover {
      background-color: #45a049;
    }

    .container {
      border-radius: 5px;
      background-color: #f2f2f2;
      padding: 20px;
      width: 600px;
    }

    .col-25 {
      float: left;
      width: 25%;
      margin-top: 6px;
    }

    .col-75 {
      float: left;
      width: 75px;
      margin-top: 6px;
    }

    .row:after {
      content: "";
      display: table;
      clear: both;
    }

    @media screen and (max-width: 120px) {

      .col-25,
      .col-75,
      input[type=submit] {
        width: 100px;
        margin-top: 0;
      }
    }

    .button {
      display: inline-block;
      border-radius: 4px;
      background-color: #18BF04;
      border: none;
      color: white;
      text-align: center;
      font-size: 12px;
      padding: 20px;
      width: 130px;
      transition: all 0.5s;
      cursor: pointer;
      margin: 5px;
    }

    .button span {
      cursor: pointer;
      display: inline-block;
      position: relative;
      transition: 0.5s;
    }

    .button span:after {
      content: '\00bb';
      position: absolute;
      opacity: 0;
      top: 0;
      right: -20px;
      transition: 0.5s;
    }

    .button:hover span {
      padding-right: 25px;
    }

    .button:hover span:after {
      opacity: 1;
      right: 0;
    }

    p {
      font-family: Montserrat, Helvetica, serif;
      font-size: 30px;
    }

    .city {
      background-color: #959090;
      color: white;
      padding: 10px;
      width: 505px;
    }
  </style>
 <center>
	<body background="camerabg2.jpg" style="background-repeat:no-repeat; background-cover:cover; background-attachment:fixed; background-size:cover">
	<div class="container" align="center" style="margin-top:50px">
	<form action="updateProcess.jsp" method="POST">

<h1>Update Staff Detail</h1><br>
<fieldset STYLE="TEXT-ALIGN:CENTER; width:500px;">

<label for="id"><b>Staff ID</b></label><br>
<input type="text" placeholder="Staff ID" name="id" value="<%=resultSet.getString("staffID")%>" readonly><br><br>

<label for="name"><b>Enter Staff Name</b></label><br>
<input type="text" placeholder="Staff Name" name="name" value="<%=resultSet.getString("staffName") %>"><br><br>

<label for="phone"><b>Enter Staff Phone Number</b></label><br>
<input type="text" placeholder="Phone Number" name="phone" value="<%=resultSet.getString("staffPhoneNo") %>"><br><br>

<label for="role"><b>Enter Staff Role</b></label><br>
<input type="text" placeholder="Staff Role" name="role" value="<%=resultSet.getString("staffRole") %>"><br><br>

<input type="submit" value="SUBMIT">
<input type="reset" value="RESET">
</fieldset>

</form>
</div>
	<%
	}
	connection.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>

	</body>
<center>
	</html>