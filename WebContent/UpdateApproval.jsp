<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Booking Approval</title>
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
<link rel="stylesheet" href="css/bookingHistory.css" media="screen">
    <script class="u-script" type="text/javascript" src="css/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="css/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.3.7, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "Site1",
		"url": "index.html",
		"logo": "images/logo.png"
	}</script>
	<style>
	input[type=text],input[type=date],input[type=number],input[type=select] select {
	  width: 100%;
	  padding: 12px 20px;
	  margin: 8px 0;
	  display: inline-block;
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  box-sizing: border-box;
	  background-color: #404040;
	}
	.select-selected {
	  background-color: #404040;
	}
	.select-items div,.select-selected {
		  color: white;
		  padding: 10px 16px;
		  border: 1px solid transparent;
		  border-color: white;
		  cursor: pointer;
		  user-select: none;
		}
	
	input[type=submit] {
	  width: 100%;
	  background-color: #4CAF50;
	  color: white;
	  padding: 14px 20px;
	  margin: 8px 0;
	  border: none;
	  border-radius: 4px;
	  cursor: pointer;
	}
	
	input[type=submit]:hover {
	  background-color: #45a049;
	}
	
	</style>
    <meta property="og:title" content="bookingHistory">
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
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="ListStaffController" style="padding: 10px 20px;">Staff</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="staffViewServiceController" style="padding: 10px 20px;">Services</a>
<li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="newListBooking" style="padding: 10px 20px;">New Bookings</a></li>
<li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="ListBooking" style="padding: 10px 20px;">On Going Bookings</a></li>
<li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="ListBookingHistory" style="padding: 10px 20px;">Booking History</a></li>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="logoutServletStaff" style="padding: 10px 20px;">Log Out</a></li>


</ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
             
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-black u-clearfix u-section-1" id="sec-f2f6">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-container-style u-grey-80 u-group u-group-1">
          <div class="u-container-layout u-container-layout-1" align="center">
            <section class="tm-mb-50 tm-bgcolor-1 tm-border-rounded">
			<table style="width:90% ">
			<tr>
			<th></th>
			<th><h2>Update Feedback</h2></th>
			</tr>
			</table>
			<div class="tm-container-fluid">
			<form id="contact-form" action="UpdateApproval" method="POST" class="tm-contact-form">
				<table align="center">
				  	<tr><td>Booking ID: </td><td><input style="color:white;" type="number" name="BOOKINGID" value="<c:out value="${b.BOOKINGID}" />" readonly/><br></td></tr>
					
					<tr><td>Staff ID: </td><td>
					<select name="STAFFID" id="STAFFID" class="select-selected"  >
					<option value="${b.STAFFID}" style="color:black" selected><c:out value="${b.STAFFID}"/></option>
					 
					<c:forEach items="${stf}" var="b">	
										<option value="${b.STAFFID}" style="color:black" ><c:out value="${b.STAFFID}"/></option>
				  	
						  	
				</c:forEach>
				 </select>
				<br></td></tr>  
					
					<tr><td>Client ID: </td><td><input type="text" name="CLIENTID" value="<c:out value="${b.CLIENTID}" />" readonly/><br></td></tr>
					<tr><td>Start Date: </td><td><input type="date" name="BOOKINGSTARTDATE" value="<c:out value="${b.BOOKINGSTARTDATE}" />" readonly/><br></td></tr>
					<tr><td>End Date: </td><td><input type="date" name="BOOKINGENDDATE" value="<c:out value="${b.BOOKINGENDDATE}" />" readonly/><br></td></tr>
					<tr><td>Location: </td><td><input type="text" name="BOOKINGLOCATION" value="<c:out value="${b.BOOKINGLOCATION}" />" readonly/><br></td></tr>
					<tr><td>Service Type:</td><td><input type="text" name="SERVICETYPE" value="<c:out value="${b.SERVICETYPE}" />" readonly><br></td></tr>
					<tr><td>Total Hours:</td><td><input type="number" name="HOURS" value="<c:out value="${b.HOURS}" />" readonly/><br></td></tr>
					<tr><td>Total Price(RM):</td><td><c:set var="TOTALPRICE" value="${TOTALPRICE+b.EDITINGRATE*b.HOURS}"/><input type="number" name="TOTALPRICE" value="<c:out value="${TOTALPRICE}" />" readonly/><br></td></tr>
				
				  <tr><td>Status: </td><td><select name="BOOKINGSTATUS" id="BOOKINGSTATUS" class="select-selected">
				  <option <c:if test = "${b.BOOKINGSTATUS == '{Processing'}"><c:out value = "selected"/></c:if> value="Processing">Processing</option>
				  	<option <c:if test = "${b.BOOKINGSTATUS == 'Ongoing'}"><c:out value = "selected"/></c:if> value="Ongoing">Ongoing</option>
				  	
				  	<option <c:if test = "${b.BOOKINGSTATUS == 'Completed'}"><c:out value = "selected"/></c:if> value="Completed">Completed</option>
				  	<option <c:if test = "${b.BOOKINGSTATUS == 'Canceled'}"><c:out value = "selected"/></c:if> value="Canceled">Canceled</option>
				  
				  </select><br></td></tr> 
				  
				  
					
		          	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		          	<table class="tm-right">
					<tr>
					<th><button type="submit" class="tm-right tm-btn-submit" onclick="myFunction()" style="background-color: green">Update</button></th>  
		          	<th><button type="reset" class="tm-right tm-btn-submit" style="background-color: orange">Clear</button></th>
		          	</tr>
		          	</table>        	
		       </div>
		       </form>
		        	<script>
		        	
					function myFunction() {
  						alert("Information is successfully Updated!");
						}
					</script>
		</section>
            
            
            
          </div>
        </div>
      </div>
    </section>
    
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-fa2c"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Certified 2020 @ Kembar Tiga Studio | Design by: Photosyhthesis</p>
      </div></footer>
  
  </body>
</html>