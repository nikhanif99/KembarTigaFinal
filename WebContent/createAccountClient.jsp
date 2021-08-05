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
    <title>Booking</title>
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
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="index.jsp" style="padding: 10px 20px;">Home</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="aboutBL.jsp" style="padding: 10px 20px;">About</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="galleryBL.jsp" style="padding: 10px 20px;">Gallery</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="serviceBL.jsp" style="padding: 10px 20px;">Service</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="contactBL.jsp" style="padding: 10px 20px;">Contact</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="createAccountClient.jsp" style="padding: 10px 20px;">Register Account</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="clientLogin.jsp" style="padding: 10px 20px;">Login</a>
<li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="adminLogin.jsp" style="padding: 10px 20px;">Admin</a></li>

</ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
             
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-black u-clearfix u-section-1" id="sec-69f2">
      <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-container-style u-grey-80 u-group u-group-1">
          <div class="u-container-layout u-container-layout-1">
            <div class="u-form u-form-1">
              <form action="clientRegisterAccount" method="POST" class="u-clearfix u-form-spacing-10 u-form-vertical u-inner-form" style="padding: 10px" source="custom" name="form-1">
                <input type="hidden" id="siteId" name="siteId" value="2772023419">
                <input type="hidden" id="pageId" name="pageId" value="140823194">
                <div class="u-form-group u-form-name">
                  <label for="name-8aee" class="u-label">Email Address</label>
                  <input type="text" placeholder="Enter IC Number" id="name-8aee" name="CLIENTID" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
              
                  <label for="name-8aee" class="u-label">Name</label>
                  <input type="text" placeholder="Enter Fullname" id="name-8aee" name="CLIENTNAME" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
               
                  <label for="name-8aee" class="u-label">Phone Number</label>
                  <input type="text" placeholder="Enter Phone Number" id="name-8aee" name="CLIENTPHONENO" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
              
                  <label for="name-8aee" class="u-label">Address</label>
                  <input type="text" placeholder="Enter Address" id="name-8aee" name="CLIENTADDRESS" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                
                
                  <label for="name-8aee" class="u-label">New Password</label>
                  <input type="text" placeholder="Enter Password" id="name-8aee" name="CLIENTPASS" class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
               
             	
                        <div class="u-align-left u-form-group u-form-submit"><br><br><center>
                  <a href="#" class="u-btn u-btn-submit u-button-style">CREATE ACCOUNT</a></center>
                  <button onclick="book()" value="register" class="u-form-control-hidden"></button>
                  <script>function book(){
             var ask = window.confirm("Confirm register?");
               if (ask) {
                      window.alert("Redirecting...");

                      window.location.href = "clientLogin.jsp";

    }
}
          </script>
                </div>
                
              
              </form>
           
    </section>
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-fa2c"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Certified 2020 @ Kembar Tiga Studio | Design by: Photosyhthesis</p>
      </div></footer>
    
  </body>
</html>