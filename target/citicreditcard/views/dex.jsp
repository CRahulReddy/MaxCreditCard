
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<%@ page isELIgnored="false"%>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    
     <link rel="stylesheet" type="text/css" href="navcss.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    <style>
    .navbar-custom {
    color: #FFFFFF;
    background-color: #2525a7;
}
    
    </style>
</head>
<body>
    
 
    <header>
   <h1 id="top" style  = text-align:top;font-size:40px;><cite style= margin-left:500px;>MAX Credit Cards</cite></h1>
</header>
    
    
    <nav class="navbar navbar-inverse navbar-custom">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MAX Credit Cards</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">My Account</a></li>
      <!--<li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>-->
         <li><a href="#">Cards</a></li>
         <li><a href="#">Travel</a></li>
      <li><a href="#">Rewards</a></li>
      <li><a href="#">Business</a></li>
    </ul>
      
      <form class="navbar-form navbar-right">
  <div class="input-group">
    <input type="text" class="form-control" placeholder="Search">
    <div class="input-group-btn">
      <button class="btn btn-default" type="submit">
        <i class="glyphicon glyphicon-search"></i>
      </button>
    </div>
  </div>
</form>
      
      
  </div>
</nav>

	<div class="container">
        <div class="col-sm-3 ">
		<h2>Credit Card Login</h2>
		<form action="loginCustomer" method="POST">
			<div class="form-group">

				<input type="text" class="form-control" name="userName"
					placeholder="Enter Username">
			</div>
			<div class="form-group">

				<input type="password" class="form-control" name="password"
					placeholder="Enter password">
			</div>
			<div class="checkbox">
				<label><input type="checkbox"> Remember me</label>
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>


		<a href="apply" class="btn btn-primary" role="link" target="_blank">Apply</a>
		<a href="register" class="btn btn-primary" role="link" target="_blank">Register</a>
		<a href="activate" class="btn btn-primary" role="link" target="_blank">Activate</a>
            </div>
        
        <div id="myCarousel" class="carousel slide" data-ride="carousel";>
<!-- Wrapper for slides -->
            
            
	<div class="col-sm-8"style="
    padding-left: 200px;
    margin-top: 50px;
                                
                                
">
<div class="carousel-inner" role="listbox">
<div class="item active">
<img src="https://assets.nerdwallet.com/blog/wp-content/uploads/2015/05/iStock_000012204018_Small.jpg" alt="img-1" width="600" height="600">
</div>

<div class="item" >
<img src="https://www.citi.com/CRD/images/large/KnowledgeCenter/travel-credit-card.jpg" alt="img-2" width="600" height="600">
</div>
<div class="item">
<img src="http://freebies.com.au/wp-content/uploads/2016/04/credit-cards.jpg" alt="img-2" width="600" height="600">
</div>
<div class="item">
<img src="http://www.payforasia.com/en/images/1213-credit-cards-630x420.jpg" alt="img-2" width="600" height="600">
</div>
</div>

<!-- Left and right controls -->
<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev" >
<span class="glyphicon glyphicon-chevron-left" aria-hidden="true" style = align:bottom;></span>
<span class="sr-only">Previous</span>
</a>
<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
<span class="glyphicon glyphicon-chevron-right" aria-hidden="true" style = align:bottom;></span>
<span class="sr-only">Next</span>
</a>
 
</div>
            </div>

	</div>
    
    
    <div class="container-fluid">
        <hr>
        <footer>
        <p align="center"> Copyright 2017<i class="fa fa-copyright" style="font-size:20px"> </i> All users of our online services subject to Privacy Statement and agree to be bound by Terms of Service. Please review.</p>
            <p class="iNCopy" align="center">© 2017 Max Credit Card Company. All rights reserved.</p>
                        <div class="col-md-12 " align="center">
    <div id="share-buttons">
    
    <!-- Buffer -->
    <a href="https://bufferapp.com/add?url=https://simplesharebuttons.com&amp;text=Simple Share Buttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/buffer.png" alt="Buffer" style="width: 30px;
"/>
    </a>
    
    <!-- Email -->
    <a href="mailto:?Subject=Simple Share Buttons&amp;Body=I%20saw%20this%20and%20thought%20of%20you!%20 https://simplesharebuttons.com">
        <img src="https://simplesharebuttons.com/images/somacro/email.png" alt="Email" 
    style="width: 30px;
"/>
    </a>
 
    <!-- Facebook -->
    <a href="http://www.facebook.com/sharer.php?u=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/facebook.png" alt="Facebook" style="width: 30px;
" />
    </a>
    
    <!-- Google+ -->
    <a href="https://plus.google.com/share?url=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/google.png" alt="Google" style="width: 30px;
"/>
    </a>
    
    <!-- LinkedIn -->
    <a href="http://www.linkedin.com/shareArticle?mini=true&amp;url=https://simplesharebuttons.com" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/linkedin.png" alt="LinkedIn"  style="width: 30px;
"/>
    </a>
    
     <!-- Twitter -->
    <a href="https://twitter.com/share?url=https://simplesharebuttons.com&amp;text=Simple%20Share%20Buttons&amp;hashtags=simplesharebuttons" target="_blank">
        <img src="https://simplesharebuttons.com/images/somacro/twitter.png" alt="Twitter" style="width: 30px;
" />
    </a>
 
</div>
                            </div>
            </div>
</footer>

</body>
</html>
