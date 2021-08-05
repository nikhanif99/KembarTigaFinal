
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
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
      background-color: #ffab45;
      padding: 20px;
      width: 600px;
      opacity: 0.85;
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
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="INTUITIVE">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Add Staff</title>
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
<link rel="stylesheet" href="css/About.css" media="screen">
    <script class="u-script" type="text/javascript" src="css/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="css/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.3.7, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    
    <meta property="og:title" content="About">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="index.html">
    <meta property="og:url" content="index.html">
  </head>
  <body class="u-body"><header class="u-black u-clearfix u-header u-header" id="sec-3091"><div class="u-clearfix u-sheet u-sheet-1">
        <a href="Home.html" data-page-id="641621218" class="u-image u-logo u-image-1" title="Home">
          <img src="images/logo.png" class="u-logo-image u-logo-image-1" data-image-width="155.1112">
        </a>
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</symbol>
</defs></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="homepage.jsp" style="padding: 10px 20px;">Home</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="staffList.jsp" style="padding: 10px 20px;">Staffs</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" onclick="logout()" style="padding: 10px 20px;">Log Out</a>
</li>
</ul>
          </div>
         
              </div>
 	</header>
 	  <section class="u-black u-clearfix u-section-1" id="sec-ff1d">
      
        
          
            

              <div class="u-align-center u-container-style u-layout-cell u-size-30 u-layout-cell-2">
                <div class="u-container-layout u-valign-top u-container-layout-2">
                 
<center>
 <div class="container" align="center" style="margin-top:50px">

<form action="staffController" method="POST" style="margin:20px">
<h1 style="color:black">Add New Staff</h1><br>
<fieldset STYLE="TEXT-ALIGN:CENTER; width:500px;">

<label for="STAFFID" style="color:black"><b>Enter Staff ID</b></label><br>
<input type="text" style="color:black" placeholder="Staff ID" name="STAFFID" required><br><br>

<label for="STAFFNAME" style="color:black"><b>Enter Staff Name</b></label><br>
<input type="text" style="color:black" placeholder="Staff Name" name="STAFFNAME" required><br><br>

<label for="STAFFPHONENO" style="color:black"><b>Enter Staff Phone Number</b></label><br>
<input type="text" style="color:black" placeholder="Phone Number" name="STAFFPHONENO" required><br><br>

<label for="STAFFROLE" style="color:black"><b>Enter Staff Role</b></label><br>
<select name="STAFFROLE" style="color:black">
<option value="" style="color:black">Select Role</option>
<option value="HUMAN RESOURCE" style="color:black">HUMAN RESOURCE</option>
<option value="CLERK" style="color:black">CLERK</option>
<option value="PHOTOGRAPHER" style="color:black">PHOTOGRAPHER</option>
<option value="VIDEOGRAPHER" style="color:black">VIDEOGRAPHER</option>
</select><br><br>

<label for="STAFFEMAIL" style="color:black"><b>Enter Staff Email</b></label><br>
<input type="text" style="color:black" placeholder="Staff Email" name="STAFFEMAIL" required><br><br>

<input type="submit" value="SUBMIT">
<input type="reset" value="RESET">
</fieldset>

</form>
</div>
</center>

                </div>
              </div>
          
       
    </section>

    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-fa2c"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Certified 2020 @ Kembar Tiga Studio | Design by: Photosyhthesis</p>
      </div></footer>
    
  </body>
</html>
