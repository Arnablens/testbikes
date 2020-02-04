<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
#a{text-align:center;
color:blue;
}
body{
 background: url(https://i.pinimg.com/474x/4d/92/e9/4d92e9aa0548758f98a0bd97443f3d15--country-girls-country-roads.jpg);
  background-repeat: no-repeat;
  background-size:100%;
}
header {
text-align: center;
}
</style>
<title  class="text-primary">Display Details</title>
       <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js" integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
        crossorigin="anonymous"></script>
     
</head>
<body>
  <h1 style="text-align:center;"  class="text-primary">Display Details</h1>
  <hr>
  <div class="container">
    <form action="/displayBikes" method="get">
      <div class="form-group">
     <h3> <label for="dealerName"  class="text-primary">DealerName:</label></h3>
      <input type ="text" id="dealerName" name="dealerName" class="form-control" >
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in" onmouseover="this.style.backgroundColor='red';return true;"></span> Submit</button>
      </div>
      <br><br>
     
    </form>
  </div>
   <div class="container">
  <form action="/">
     <div class="form-group"> 
        <table class="table table-dark table-hover ">
    <thead>
      <tr>
        <th>Bike Name</th>
        <th>Price</th>
      </tr>
    </thead>
          <c:forEach var ="bike" items = "${bikes}">
              <tbody>
                <tr> 
                    <td><c:out value="${bike.getBikeName()}"/></td>
                     <td><c:out value="${bike.getPrice()}"/></td>
                </tr>
              </tbody>
           </c:forEach> 
  </table>  
  <br><br>
        </div>
         <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in" onmouseover="this.style.backgroundColor='red';return true;"></span> HomePage</button> 
    </form>
  </div>
</body>
</html>