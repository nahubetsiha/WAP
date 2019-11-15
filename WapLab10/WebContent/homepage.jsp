<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Homepage</title>
</head>
<body>
	 <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #2780e3;">
        <a class="navbar-brand" href="homepage.jsp">CS472-WAP : : : Lab10</a>
    </nav>
    <div class="container">
        <div class="jumbotron">
            <h1 class="display-4">Hello, world of HttpSevlet 4.0!</h1>
            <p class="lead">Welcome to lab 10</p>
            <hr class="my-4">
          	<p>Click here to contact us</p>
           	<a class="btn btn-primary btn-lg" href="contactus.jsp">Contact us</a>
        </div>
        <div>
        <p class="text-right">Total hit for this application= ${totalHit} </p>
        </div>
    </div>
    
</body>
</html>