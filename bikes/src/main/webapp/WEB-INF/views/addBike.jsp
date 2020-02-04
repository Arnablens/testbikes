<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<style>
body{
 background: url(https://i.pinimg.com/474x/4d/92/e9/4d92e9aa0548758f98a0bd97443f3d15--country-girls-country-roads.jpg);
  background-repeat: no-repeat;
  background-size:100%;
}
 .error {
      color: red;
      
   }
header {
text-align: center;
}
</style>
<title  class="text-primary">Add Bikes</title>
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
  <h1 style="text-align:center;"  class="text-primary">Add Bikes</h1>
  <hr>
  <div class="container">
    <form action="/addBikesToDb" method="post">
      <div class="form-group">
     <h3> <label for="brandId"  class="text-primary">Brand:</label></h3>
      <select class="form-control" id="brandId" name="brandId">
             <option selected="selected">Select</option>
        <c:forEach items="${brands}" var="brand">
            <option value="${brand.getBrandId()}">${brand.getName()}</option>
             
        </c:forEach>
      </select>
      </div>
      <br><br>
     <div class="form-group">
        <h3><label for="bikeName"  class="text-primary">Bike Name:</label></h3>
          <input type ="text" id="bikeName" name="bikeName" class="form-control" >
        </div>
        <div class="form-group">
        <h3><label for="price"  class="text-primary">Price of the Bike:</label></h3>
          <input type ="number" id="price" name="price" class="form-control" >
        </div>
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Add</button>
    </form>
  </div>
     <script > $('form').validate({
        errorClass: 'errors',
    	rules: {
    		bikeName: {
    			required: true,
                lettersonly: true,
                rangelength: [2,50]
                },
                price: {
                    required:true
                    
                },
            },
             
            highlight: function (element) {
                $(element).parent().addClass('error')
            },
            unhighlight: function (element) {
                $(element).parent().removeClass('error')
            }
        });
    </script>
  
</body>
</html>