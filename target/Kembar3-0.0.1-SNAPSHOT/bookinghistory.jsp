<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	
<!DOCTYPE html>
<html>
<head>
<title>Booking History</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<meta name="keywords" content="">
	<meta name="description" content="">
	<meta name="page_type" content="np-template-header-footer-from-plugin">
	<link rel="stylesheet" href="css/nicepage.css" media="screen">    
	<link rel="stylesheet" href="css/bookingHistory.css" media="screen">
	<script class="u-script" type="text/javascript" src="css/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="css/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.3.7, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"url": "index.html",
		"logo": "images/logo.png"
		}
	</script>
	
    <meta property="og:title" content="Booking">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="index.html">
    <meta property="og:url" content="index.html">

<style>
    body, h1 {
        font-family: "Montserrat", sans-serif
    }

    img {
        margin-bottom: -7px
    }

    .w3-row-padding img {
        margin-bottom: 12px
    }

    .myDiv {
        border: 8px outset gray;
        border-radius: 15px 15px;
        background-color: white;
        text-align: center;
        max-width: 100%;
        margin-left: auto;
        margin-right: auto;
        opacity:1;
    }
    #t01 tr:nth-child(even) {
      background-color: #d9d9d9;
      color: black;
    }
    #t01 tr:nth-child(odd) {
     background-color: #a6a6a6;
     color: black;
    }
    #t01 th {
      background-color: #404040;
      color: white;
    }
    a:link {
      color: #000066;
      background-color: transparent;
      text-decoration: none;
    }

    a:visited {
      color: black;
      background-color: transparent;
      text-decoration: none;
    }

    a:hover {
      color: red;
      background-color: transparent;
      text-decoration: underline;
    }

    a:active {
      color: yellow;
      background-color: transparent;
      text-decoration: underline;
    }

  
body, h1 {
	font-family: "Montserrat", sans-serif
}

img {
	margin-bottom: -7px
}

.w3-row-padding img {
	margin-bottom: 12px
}

.myDiv {
	border: 5px outset gray;
	border-radius: 15px 15px;
	background-color: white;
	text-align: center;
	max-width: 80%;
	margin-left: auto;
	margin-right: auto;
	opacity: 0.7;
}
.gtext {
    color: black;
    text-shadow: 2px 2px 5px black;
    font-size: 100%;
</style>
</head>

<body class="u-body">
  <header class="u-black u-clearfix u-header u-header" id="sec-3091"><div class="u-clearfix u-sheet u-sheet-1">
        <a data-page-id="641621218" class="u-image u-logo u-image-1" title="Home">
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
<li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientListMS.jsp" style="padding: 10px 20px;">Clients</a></li>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="logoutServletStaff" style="padding: 10px 20px;">Log Out</a></li>


</ul>
          </div>
         
        </nav>
      </div></header>
      
   <section class="u-black u-clearfix u-section-1" id="sec-f2f6">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-1">Completed / Canceled Booking List</h2>
          <div class="u-container-layout u-container-layout-1">
          <div class="myDiv">
            <table class="w3-table-all" id="t01">
						<tr class="w3-gray">
							<th width="3%">No</th>
							<th width="3%">Staff ID</th>
							<th width="3%">Client ID</th>
							<th width="11%">Start Date</th>
							<th width="11%">End Date</th>
							<th width="20%">Location</th>
							<th width="10%">Service</th>
							<th width="5%">Total Hours</th>	
							<th width="5%">Total Price(RM)</th>	
							
						
							<th width="10%">Status</th>	
						
							
						</tr>
						<c:set var = "count" value = "${0}"/>
						<c:forEach items="${psn}" var="b">
						<c:set var = "count" value = "${count+1}"/>
							<tr>
							
								<td style="text-align: center"><c:out value="${count}"/></td>
								<td><c:out value="${b.STAFFID}" /></td>
								<td><c:out value="${b.CLIENTID}" /></td>
								<td><c:out value="${b.BOOKINGSTARTDATE}" /></td>
								<td><c:out value="${b.BOOKINGENDDATE}" /></td>
								<td><c:out value="${b.BOOKINGLOCATION}" /></td>
								<td><c:out value="${b.SERVICETYPE}" /></td>
								<td><c:out value="${b.HOURS}" /></td>
								<td><c:out value="${b.TOTALPRICE}" /></td>
								
							
								<td><c:out value="${b.BOOKINGSTATUS}" /></td>
								
								
						</c:forEach>
					</table>
            </div>
        </div>
      </div><br><br><br>
    </section>  
   
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-fa2c"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Certified 2020 @ Kembar Tiga Studio | Design by: Photosyhthesis</p>
      </div></footer>
    
  </body>
</html>