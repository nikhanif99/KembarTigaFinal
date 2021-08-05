<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <title>bookingHistory</title>
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
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientHomepageAL.jsp" style="padding: 10px 20px;">Home</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="aboutSessionController" style="padding: 10px 20px;">About</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="gallerySessionController" style="padding: 10px 20px;">Gallery</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="serviceSessionController" style="padding: 10px 20px;">Service</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="contactSessionController" style="padding: 10px 20px;">Contact</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientAddBookingController" style="padding: 10px 20px;">Booking Form</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientViewBookingListController" style="padding: 10px 20px;">My Booking</a>

</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="LogoutServlet" style="padding: 10px 20px;">Log Out</a>

</ul>
          </div>
         
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-black u-clearfix u-section-1" id="sec-f2f6">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h3 class="u-text u-text-1">Booking History</h3>
        <div class="u-container-style u-grey-80 u-group u-group-1">
          <div class="u-container-layout u-container-layout-1">
          
          	<table border="1">
          		<tr>
          			<th>No.</th>
          			<th>Email</th>
			        <th>Booking Location</th>
			        <th>Service Type</th>
			        <th>Booking Start Date</th>
			        <th>Booking End Date</th>
			       	<th>Booking Hours</th>
			       	<th>Price</th>
			       	<th>Status</th>
			        <th>Action</th>
          		</tr>
          		<c:set var = "count" value = "${0}"/>
			      <c:forEach items="${book}" var="b">
			      <c:set var = "count" value = "${count+1}"/>
			       <c:set var = "TOTALPRICE" value = "${0}"/>
			       
			      <tr>
			        <td><c:out value="${count}" /></td>
			        <td><c:out value="${sessionCLIENTID}" /></td>
			        <td><c:out value="${b.BOOKINGLOCATION}" /></td>
			       	<td><c:out value="${b.SERVICETYPE}" /></td>
			       	<td><c:out value="${b.BOOKINGSTARTDATE}" /></td>
			       	<td><c:out value="${b.BOOKINGENDDATE}" /></td>
			       	<td><c:out value="${b.HOURS}" /></td>
			       	<td><c:set var="TOTALPRICE" value="${TOTALPRICE+b.EDITINGRATE*b.HOURS}"/><c:out value="${TOTALPRICE}"/></td>
			      	<td><c:out value="${b.BOOKINGSTATUS}" /></td>
			      	
			       	
			        <td><center>
			        <input type="button" onclick="window.location.href='clientUpdateBookingController?BOOKINGID=<c:out value="${b.BOOKINGID}" />'" value="Update" style="width:70%; color:blue"/>
			        <input type="button" onclick="window.location.href='clientDeleteBooking?BOOKINGID=<c:out value="${b.BOOKINGID}" />'" value="Delete" style="width:70%; color:red"/>
			        <input type="button" onclick="window.location.href='AddPayment?PAYMENTTYPE=ONLINE&BOOKINGID=<c:out value="${b.BOOKINGID}" />'" value="PAY ONLINE" style="width:70%; color:green"/>
			        <input type="button" onclick="window.location.href='AddPayment?PAYMENTTYPE=CASH&BOOKINGID=<c:out value="${b.BOOKINGID}" />'" value="PAY CASH" style="width:70%; color:green"/>
			        </center>
			        </td>
			      </tr>
			      </c:forEach>
          	</table><br>
          	<center>*Please proceed to payment once the Status turn to <b>On Going</b>*</center>
          </div>
        </div>
      </div>
    </section>
    
   
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-fa2c"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Certified 2020 @ Kembar Tiga Studio | Design by: Photosyhthesis</p>
      </div></footer>
  
  </body>
</html>