<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Bootstrap 3 Fixed Layout Example</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<style type="text/css">
    body{
    	padding-top: 70px;
    }
</style>

<script type="text/javascript">
		function home() {
			var formVals = document.getElementById("formVals");
			formVals.action = "welcome";
			formVals.method = "get";
			formVals.submit();
		}
		
		function contact() {
			var formVals = document.getElementById("formVals");
			formVals.action = "contactus";
			formVals.method = "get";
			formVals.submit();
		}
		
		function about() {
			var formVals = document.getElementById("formVals");
			formVals.action = "about";
			formVals.method = "get";
			formVals.submit();
		}
	</script>


</head>
<body>
<form id="formVals" action="" method="get"> 
<nav id="myNavbar" class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
	<!-- Brand and toggle get grouped for better mobile display -->
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbarCollapse">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Cloud Rasberry</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="nav navbar-nav">
				<li><a href="#" onclick="javascript: home();">Home</a></li>
				<li><a href="#" onclick="javascript: about();">About</a></li>
				<li><a href="#" onclick="javascript: contact();">Contact</a></li>
			</ul>
		</div>
	</div>
</nav>
<div class="container">
		<h1>
		    "Data Saved"
		</h1>
</div>
	<hr>
	<div class="row">
		<div class="col-xs-12">
			<footer>
				<p>&copy; Copyright 2015 Cloud Rasberry</p>
			</footer>
		</div>
	</div>
	</form>
</body>
</html>