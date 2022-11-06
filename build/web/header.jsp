<%-- 
    Document   : header
    Created on : 4 Nov, 2022, 10:00:45 AM
    Author     : SUDHIR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"> </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <script src="https://use.fontawesome.com/991034f73a.js"></script>
        <style>
            .navbar { background-color: #484848; }
.navbar .navbar-nav .nav-link { color: #fff; }
.navbar .navbar-nav .nav-link:hover { color: #fbc531; }
.navbar .navbar-nav .active > .nav-link { color: #fbc531; }

footer a.text-light:hover { color: #fed136!important; text-decoration: none; }
footer .cizgi { border-right: 1px solid #535e67; }
@media (max-width: 998px) { footer .cizgi { border-right: none; } }
        </style>
    </head>

    <body>
          <header>
	<!--- Navbar --->
	<nav class="navbar navbar-expand-lg">
		<div class="container h5">
                    <a class="navbar-brand text-white" style="color: coral"><i class="fa fa-graduation-cap fa-lg " style="color: darkorange"></i> Dashboard Portal</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nvbCollapse" aria-controls="nvbCollapse">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="nvbCollapse">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item pl-1 active ">
                                            <a class="nav-link" href="home.jsp"><i class="fa fa-home fa-fw mr-1"></i>Home</a>
					</li>
					<li class="nav-item  pl-1">
                                            <a class="nav-link" href="visual.jsp"><i class="fa fa-th-list fa-fw mr-1"></i>Visualization</a>
					</li>
					<li class="nav-item pl-1">
                                            <a class="nav-link " style="color: aqua" href="https://drive.google.com/file/d/1gc959v0lKz976fKp3QnYDAoF9fAKuKty/view?usp=sharing"><i class="fa fa-info-circle fa-fw mr-1"></i>About Us</a>
					</li>
                                        <li class="nav-item pl-1">
                                            <a class="nav-link " style="color: #ccc" href="login.html"><i class="fa fa-sign-out" aria-hidden="true"></i> Log Out</a>
					</li>
					
				</ul>
			</div>
		</div>
	</nav>
	<!--# Navbar #-->
	</header>

<!--- Footer --->
	
	<!--# Footer #-->

       
    </body>

</html>



<!--<footer>
		<div class="jumbotron jumbotron-fluid bg-secondary p-4 mt-5 mb-0">
			<div class="container">
				<div class="row">
					<div class="col-12 col-sm-12 col-md-12 col-lg-4 col-xl-4 cizgi">
						<div class="card bg-secondary border-0">
							<div class="card-body text-light text-center">
								<h5 class="card-title text-white display-4" style="font-size:30px">Dashboard Portal</h5>
							<p class="d-inline lead">Tüm Hakları Saklıdır © 2018<br>
							<a href="#" class="text-light d-block lead">Blog</a>
							</p>
	
							</div>
						</div>
					</div>
					
					<div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 cizgi">
						<div class="card bg-secondary border-0">
							<div class="card-body text-center">
								<h5 class="card-title text-white display-4" style="font-size:30px">İletişim</h5>
								<a class="text-light d-block lead" style="margin-left: -20px" href="#"><i class="fa fa-phone mr-2"></i>+90 (000) 000 0 000</a>
								<a class="text-light d-block lead" href="#"><i class="fa fa-envelope mr-2"></i>admin@localhost.com</a>
							</div>
						</div>
					</div>
					
					<div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4">
						<div class="card bg-secondary border-0">
							<div class="card-body text-center">
							<h5 class="card-title text-white display-4" style="font-size:30px">Sosyal Medya</h5>
					
									<a class="text-light" href="#"><i class="fa fa-facebook-square fa-fw fa-2x"></i></a>
								
								
								
							</div>
						</div>
					</div>	
				</div>
			</div>
		</div>
	</footer>-->