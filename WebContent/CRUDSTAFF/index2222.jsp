<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Affordable and professional web design">
    <meta name="keywords" content="web design, affordable web design, professional web design">
    <meta name="author" content="Rizal">
    <title>Kembar Tiga</title>
    <link rel="stylesheet" href="./css/style.css">
  </head>
  <body>
    <header>
      <div class="container">
        <div id="branding">
          <h1><span class="highlight"><img width="70px" height="70px" "class="site-logo" src="logo.png" alt="Kembar Tiga" style="
    height: 100px;
    width: 300px;
"></span></h1>
        </div>
        <nav>
          <ul>
            

  <style>


li {
  float: left;
}

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

li.dropdown {
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1;}

.dropdown:hover .dropdown-content {
  display: block;
}

body{
  font: 15px/1.5 Arial, Helvetica,sans-serif;
  padding:0;
  margin:0;
  background-color:#ccc;
}

}
/* Header **/
header{
  background:#280f06;
  color:#ffffff;
  padding-top:30px;
  min-height:70px;
  border-bottom:#e90e0e 3px solid;
}

header a{
  color:#ffffff;
  text-decoration:none;
  text-transform: uppercase;
  font-size:16px;
}

header li{
  float:left;
  display:inline;
  padding: 0 20px 0 20px;
}

header #branding{
  float:left;
}

header #branding h1{
  margin:0;
}

header nav{
  float:right;
  margin-top:10px;
}

header .highlight, header .current a{
  color:#e90e0e;
  font-weight:bold;
}

header a:hover{
  color:#cccccc;
  font-weight:bold;
}

footer{
  padding:20px;
  margin-top:20px;
  color:#ffffff;
  background-color:#280f06;
  text-align: center;
}

/* Media Queries */
@media(max-width: 768px){
  header #branding,
  header nav,
  header nav li,
  #newsletter h1,
  #newsletter form,
  #boxes .box,
  article#main-col,
  aside#sidebar{
    float:none;
    text-align:center;
    width:100%;
  }

  header{
    padding-bottom:20px;
  }

  #showcase h1{
    margin-top:40px;
  }

  #newsletter button, .quote button{
    display:block;
    width:100%;
  }

  #newsletter form input[type="email"], .quote input, .quote textarea{
    width:100%;
    margin-bottom:5px;
  }
  iframe-container{
  position: relative;
  width: 100%;
  padding-bottom: 56.25%; 
  height: 0;
}
.iframe-container iframe{
  position: absolute;
  top:0;
  left: 0;
  width: 100%;
  height: 100%;
}
p.outset {border-style: outset;}

.w3-btn {margin-bottom:10px;}

}


/*Content*/
</style>
      <li class="dropdown">
       
       <li><a href="index.php">Log Out</a></li>
          </ul>
        </nav>
      </div>
    </header>
  
   <title>ADMIN DASHBOARD</title>

  <style type="text/css">
    .manageMember {
      width: 50%;
      margin: auto;
    }

    table {
      width: 100%;
      margin-top: 20px;
    }

  </style>

</head>
<body>

<div class="managebook">
  <!-- <a href="create.php"><button type="button">Add Member</button></a> -->
  <table border="1" cellspacing="0" cellpadding="0">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>Staff ID</b></td>
<td><b>Staff Name</b></td>
<td><b>Staff Phone Number</b></td>
<td><b>Role</b></td>
<td><b>Action</b></td>
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
    <a href="updateDetail.jsp"?id=<%=resultSet.getString("staffID")%>"><button type="button" class="update">Update</button></a>
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

 <center>
<button><a href="AddStaffPage.jsp">Add New Staff</a></button>
</center> 
</div>

    <footer>
      <p>Kembar Tiga , Copyright &copy; 2019</p>
    </footer>
  </body>
</html>
