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
<meta charset="ISO-8859-1">
<title>Booking</title>
</head>
<center>
<body>
<div class="container">

<form action="">
<h1> Customer Booking</h1><br>
<fieldset STYLE="TEXT-ALIGN:CENTER; width:500px;">

<label for=""><b>Enter Booking Location</b></label><br>
<input type="text" placeholder="Location" name="" required><br><br>

<label for=""><b>Student Name</b></label><br>
<input type="text" placeholder="First Name" name="STUD_NAME" required><br><br>
</fieldset>

</form>
</div>
</body>
</center>
</html>