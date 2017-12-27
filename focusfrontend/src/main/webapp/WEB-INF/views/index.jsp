<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<title>Focus</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
 
<jsp:include page="header.jsp"></jsp:include>

<div class="container">
  <h2 style="color:blue">FOCUS!</h2>
     <div id="Carousel" class="carousel slide" data-ride="carousel">
       <ol class="carousel-indicators">
       <li data-target="#Carousel" data-slide-to="0" class="active"></li>
       <li data-target="#Carousel" data-slide-to="1"></li>
       <li data-target="#Carousel" data-slide-to="2"></li>
       <li data-target="#Carousel" data-slide-to="3"></li>
        </ol>
       <div class="carousel-inner">
         <div class="item active">
         <img alt="LandScape" class="img-responsive" src="resources/1.jpg" style="width:100% ">
         </div>
     
         <div class="item">
         <img class="img-responsive" src="resources/2.jpg"style="width:100%;">
         </div>
     
         <div class="item">
         <img class="img-responsive" src="resources/5.jpg"style="width:100% ">
         </div>
     
         <div class="item">
         <img class="img-responsive" src="resources/4.jpg"style="width:100% ">
         </div>
       </div>
       <a class="left carousel-control" href="#Carousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#Carousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  
    </div>
 </div>
</body>
</html>