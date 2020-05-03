<html>

<head>
<title>First Web Application</title>
<link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css"
        rel="stylesheet">
    <link href="css/custom.css"
        rel="stylesheet">
</head>

<body>
<div class="card-header">
    <h1>Welcome to To-Do's</h1>
</div>
<div class="container">
	<font color="red">${errorMessage}</font>
</div>
<div class="container">
	<form method="post" class="form-group">
			<div class="form-group">
				<label>Name : </label>
				<input type="text" class="form-control" name="name" />
			</div>
			<div class="form-group">
				<label>Password : </label>
				<input type="password" class="form-control" name="password" /> 
			</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>
<div class="text-muted">
    <h5>@Copyright: Krishnarjun Singh</h5>
</div>

</body>

</html>