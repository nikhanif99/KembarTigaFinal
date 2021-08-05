<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
    * {
      box-sizing: border-box;
    }

    input[type=text],
    [type=email],[type=number],[type=password],
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
<meta charset="ISO-8859-1">
<title>Client Registration</title>
</head>
<body background="camerabg2.jpg" style="background-repeat:no-repeat; background-cover:cover; background-attachment:fixed; background-size:cover">
<center>
<div class="container" align="center" style="margin-top:50px">

<form action="" method="POST" style="margin:20px">
<h1>Client Registration</h1><br>

<label for="clientid"><b>Enter Identification Card Number</b></label><br>
<input type="text" placeholder="IC Number" name="clientid" required><br><br>

<label for="clientname"><b>Enter Your Name</b></label><br>
<input type="text" placeholder="Client Name" name="clientname" required><br><br>

<label for="clientphone"><b>Enter Phone Number</b></label><br>
<input type="text" placeholder="Phone Number" name="clientphone" required><br><br>

<label for="clientaddress"><b>Enter Address</b></label><br>
<input type="text" placeholder="Address" name="clientaddress" required><br><br>

<label for="clientaddress"><b>Enter Post Code</b></label><br>
<input type="number" placeholder="Post Code" name="clientaddress" required><br><br>

<label for="clientaddress"><b>Enter City</b></label><br>
<input type="text" placeholder="City" name="clientaddress" required><br><br>

<label for="clientaddress"><b>Enter State</b></label><br>
<select name="state" >
<option value="">--</option>
<option value="Selangor">Selangor</option>
<option value="Wilayah Persekutuan Kuala Lumpur">Wilayah Persekutuan Kuala Lumpur</option>
<option value="Pahang">Pahang</option>
<option value="Kelantan">Kelantan</option>
</select><br><br>

<label for="clientemail"><b>Enter Email Address</b></label><br>
<input type="email" placeholder="Email Address" name="clientemail" required><br><br>

<label for="clientpassword"><b>Enter Password</b></label><br>
<input type="password" placeholder="Password" name="clientpassword" required><br><br><br><br>

<input type="submit" value="SUBMIT">
<input type="reset" value="RESET">

</form>
</body>
</center>
</html>