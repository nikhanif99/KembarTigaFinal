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
    <title>Payment</title>
    <link rel="stylesheet" href="css/nicepage.css" media="screen">
<link rel="stylesheet" href="css/bookingHistory.css" media="screen">
    <script class="u-script" type="text/javascript" src="css/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="css/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.3.7, nicepage.com">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
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
	.vl {
	  margin-left: 20px;
	  border-left: 3px solid white;
	  height: 350px;
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
			<th><h2>Payment Information</h2></th>
			</tr>
			<tr>
			<th></th>
			
			</tr>
			</table>
			<div class="tm-container-fluid">
			
		
				
				
				<h2> Receipt </h2>
					
					<div>
					Payment ID:
				 <c:out value ="${paymentinfo.PAYMENTID}"/>
					 </div>
					  <div>
					  Booking ID:
					 <c:out value ="${paymentinfo.BOOKINGID}"/>
					 </div>
					  <div>
					  Payment Amount:
					 <c:out value ="${paymentinfo.PAYMENTAMOUNT}"/>
					 </div>
					  <div>
					  Payment Date:
					 <c:out value ="${paymentinfo.PAYMENTDATE}"/>
					 </div>
					  <div>
					  Payment Type:
					 <c:out value ="${paymentinfo.PAYMENTTYPE}"/>
					 </div>
					  <div>
					  Payment Status:
					 <c:out value ="${paymentinfo.PAYMENTSTATUS}"/>
					 </div>
					
		          
		          	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		          	</table>
		          	
		          	
		          <button onclick="window.print()" style="background-color: green">Print Receipt</button>
		          
		          	      	
		      
		    
	
	</div>
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