
<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@attribute name="extraScripts" fragment="true"%>
<!doctype html>
<html lang="en">
<head>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<!--     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.2/css/bulma.min.css"> -->
<!--     <script defer src="https://use.fontawesome.com/releases/v5.0.0/js/all.js"> -->
<!--     </script>  -->
<meta charset="utf-8">
<meta name="viewport"
 content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
 href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
 integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
 crossorigin="anonymous">
</head>
<body style="background-color:  ;">

 <div class="container-fluid row" style="margin-top:10px; ">
  <div class="col-2">
   <div class="position-fixed col-2" >
   <c:import url="/WEB-INF/views/header.jsp" />
    </div>
  </div>
  <div class="offset-2 col-10 row" style="padding-right: 0px;">
   <jsp:doBody />
  </div>
  
  <div class="col-2 fixed-bottom " >
  <c:import url="/WEB-INF/views/footer.jsp" />
 </div>
 
 </div>

 <jsp:invoke fragment="extraScripts" />
 <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
  integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
  crossorigin="anonymous"></script>
 <script
  src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
  integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
  crossorigin="anonymous"></script>
 <script
  src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
  integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
  crossorigin="anonymous"></script>
</body>
</html>