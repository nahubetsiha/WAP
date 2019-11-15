<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Customer Contact App</title>
</head>
<body>
	 <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #2780e3;">
        <a class="navbar-brand" href="homepage.jsp">CS472-WAP : : : Lab10</a>
        <a class="navbar-brand" href="homepage.jsp">Home</a>
    </nav>
    
    <div class="container">
        <h2>Customer contact form</h2>

        <form action="check" method="post">
            <div class="form-group">
                <label for="name">*Name:</label>
                <span class="text-danger">${error.Name}</span>
                <input type="text" class="form-control" id="name" name="name" placeholder="John H. Smith" value="${Name}">
                <small class="form-text text-muted">Enter your full name</small>
            </div>
            <label for="inlineRadioOptions">*Gender:</label>
            <span class="text-danger">${error.Gender}</span>
            <br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="male" value="male">
                <label class="form-check-label" for="male">Male</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="female" value="female">
                <label class="form-check-label" for="female">Female</label>
            </div>
            <br>
            <br>
            <div class="form-group">
                <label for="exampleFormControlSelect1">*Category:</label>
                <span class="text-danger">${error.Category}</span>
                <select class="form-control" id="exampleFormControlSelect1" name="category">
				  <option></option>                
                  <option>Feedback</option>
                  <option>Inquiry</option>
                  <option>Complaint</option>
                </select>
              </div>
              <div class="form-group">
                <label for="name">*Message:</label>
                <span class="text-danger">${error.Message}</span>
                <textarea type="textarea" class="form-control" id="textarea" name="textarea" placeholder="Write your message here">${Message}</textarea>
            </div>
            <input class="btn btn-primary" type="submit" value="Submit">
        </form>
        
        <div>
        <span>Total hit for this page= ${contactPageCounter} </span>
        <p class="text-right">Total hit for this application= ${totalHit} </p>
        </div>
    </div>
</body>
</html>