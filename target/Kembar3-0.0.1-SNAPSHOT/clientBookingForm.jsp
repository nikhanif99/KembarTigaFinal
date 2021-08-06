<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html style="font-size: 16px;">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Booking Form</title>
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
<link rel="stylesheet" href="css/Booking.css" media="screen">
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
}</script>
    <meta property="og:title" content="Booking">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="index.html">
    <meta property="og:url" content="index.html">
  </head>
  <body class="u-body"><header class="u-black u-clearfix u-header u-header" id="sec-3091"><div class="u-clearfix u-sheet u-sheet-1">
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
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientHomepageAL.jsp" style="padding: 10px 20px;">Home</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="aboutAL.jsp" style="padding: 10px 20px;">About</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="galleryAL.jsp" style="padding: 10px 20px;">Gallery</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="serviceAL.jsp" style="padding: 10px 20px;">Service</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="contactAL.jsp" style="padding: 10px 20px;">Contact</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientAddBookingController" style="padding: 10px 20px;">Booking Form</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientViewBookingListController" style="padding: 10px 20px;">My Booking</a>

</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="LogoutServlet" style="padding: 10px 20px;">Log Out</a>

</ul>
          </div>
         
        </nav>
      </div></header>
    <section class="u-black u-clearfix u-section-1" id="sec-69f2">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-container-style u-grey-80 u-group u-group-1">
          <div class="u-container-layout u-container-layout-1">
            <div class="u-form u-form-1">
              <form action="clientAddBookingController" method="POST">
              <div class="u-form-group u-form-name">
                  <label for="name-8aee" class="u-label">Email Address : </label>
                  <input type="text" id="name-8aee" name="CLIENTID" value="<c:out value="${c.CLIENTID}"/>" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" readonly>
                </div><br>
              	<div class="u-form-group u-form-name">
                  <label for="name-8aee" class="u-label">Location : </label>
                  <input type="text" placeholder="Enter address" id="name-8aee" name="BOOKINGLOCATION" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                </div><br>
              	<div class="u-form-group u-form-name">
                	<label for="name-8aee" class="u-label">Service Type : </label>
					<select name="SERVICEID" id="SERVICEID" class="select-selected" style="color:black" >
						<option value="" style="color:black" selected>Choose Service</option>
	                    <c:forEach items="${psnlistservice}" var="b">
						<option value="${b.SERVICEID}" style="color:black" ><c:out value="${b.SERVICETYPE}"/></option>
	                </c:forEach>
                 	</select>
	            </div><br>
                <div class="u-form-date u-form-group u-form-group-3">
                  <label for="date-161f" class="u-label">Start Date : </label>
                  <input type="date" id="date-161f" name="BOOKINGSTARTDATE" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                </div><br>
                <div class="u-form-date u-form-group u-form-group-4">
                  <label for="date-487a" class="u-label">End Date : </label>
                  <input type="date" placeholder="" id="date-487a" name="BOOKINGENDDATE" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                </div><br>
                <div class="u-form-group u-form-name">
                  <label for="date-1c81" class="u-label">Hours : </label>
                  <input type="text" placeholder="Enter hours" id="name-8aee" name="HOURS" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                </div>
                <br>
				<div class="u-align-center u-form-group u-form-submit">
	              <input type="submit" value="submit" style="background-color: green">
	            </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-fa2c"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Certified 2020 @ Kembar Tiga Studio | Design by: Photosyhthesis</p>
      </div></footer>
    
  </body>
</html>