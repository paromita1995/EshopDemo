<!DOCTYPE html>
<html lang="en">
<head>
  <title>ESHOP</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<Style>
body
{
background-image: url("resources/image/image2.jpg");
 background-color: #cccccc;
}
</Style>
</head>
<body>
<div class="container">
<h1 style="background-color:red;">
Welcome to my Eshop website .. happy shopping 
</h1></div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><b>Eshop</b></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Option <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="ProductDetails">Product</a></li>
          <li><a href="ProductList">ProductList</a></li>
          <li><a href="#"> Shipping Address</a></li>
        </ul>
      </li>
      <li><a href="#"> Cart</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="AddUserDetail"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
 
</nav>



<div class="container">
  <h2 color= "white"></h2>  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="resources/image/image5.jpg" alt="MOBILE" style="width:100%;">
      </div>

      <div class="item">
        <img src="resources/image/image6.jpg" alt="TELEVISION" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="resources/image/image7.jpg" alt="FRIDGE" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
  

</body>
</html>