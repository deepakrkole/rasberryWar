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
		
	
		function save() {
			var formVals = document.getElementById("formVals");
			formVals.action = "appProperties";
			formVals.method = "post";
			formVals.submit();
		}
</script>

</head>
<body>
<form id="formVals"> 
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
	<div class="cloudExample">
        <div class="form-group">
        	<label for="inputUserName">UserName</label>
            <input type="text" class="form-control" id="inputUserName" name="inputUserName" placeholder="UserName">
            <label for="inputEmail">Email</label>
            <input type="email" class="form-control" id="inputEmail" name="inputEmail" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="inputPassword">Password</label>
            <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password">
        </div>
        <div class="form-group">
        	<label for="inputPhone">Phone</label>
            <input type="Number" class="form-control" id="inputPhone" name="inputPhone" placeholder="Phone">
        </div>
        <div class="form-group">
					<table>
						<tr>
							<td><label for="inputEmailNotification">Do you want
									to signup for Email Notifications</label></td>
						<tr>
							<td>
								<div class="checkbox">
									<label><input type="checkbox" id="emailCheck" name="emailCheck"></label>
								</div>
							</td>
						</tr>
						<tr>
							<td><label for="inputSMSNotification">Do you want
									to signup for SMS Notifications</label></td>
						</tr>
						<tr>
							<td>
								<div class="checkbox">
									<label><input type="checkbox" id="smsCheck" name="smsCheck"></label>
								</div>
							</td>
						</tr>
						<tr>
							<td><label for="inputEmailNotification">Do you want
									to delete files, once uploaded</label></td>
						</tr>
						<tr>
							<td>
								<div class="checkbox">
									<label><input type="checkbox" id="deleteCheck" name="deleteCheck"></label>
								</div>
							</td>
						</tr>
					</table>
				</div>
        <button type="submit" class="btn btn-primary" onclick="javascript: save();">Next</button>
	</div>	
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