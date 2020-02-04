<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body{
 background: url(https://themefuse.com/wp-content/uploads/2017/02/header-autotrader-.jpg);  
 background-repeat: no-repeat;
 background-size:100%;
}
#myVideo {
  position: fixed;
  right: 0;
  bottom: 0;
  min-width: 100%; 
  min-height: 100%;
}

header {
text-align: center;
}
</style>
<title  class="text-primary">Bike Dealer</title>
      <!-- Latest compiled and minified CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
     <!-- jQuery library -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
     <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
<!-- <video autoplay muted loop id="myVideo">
  <source src="/resources/static/video/video_preview_h264.mp4" type="video/mp4">
</video> -->
  <h1 style="text-align:center;"  class="text-primary">Bike Dealer</h1>
  <hr>
  
  <div class="container">
    <form action="/addBrand" > 
      <button type="submit"   class="btn btn-info btn-lg" ><span class="glyphicon glyphicon-log-in" ></span> Add Brand</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/assignDealerToBrand" > 
      <button type="submit"   class="btn btn-info btn-lg" ><span class="glyphicon glyphicon-log-in" ></span> Assign Dealer to Brand</button>
    </form>
  </div>
  <br><br>
  
  <div class="container">
    <form action="/assignBikeToBrand" > 
      <button type="submit"   class="btn btn-info btn-lg" ><span class="glyphicon glyphicon-log-in" ></span> Assign Bike To Brand</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/display" method="get">
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Bikes under a Dealer</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/investments" method="get">
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Investments of the brands</button>
    </form>
  </div>
  
</body>
</html>