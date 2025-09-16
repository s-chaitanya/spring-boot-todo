<html>
<head>
<title>Login</title>
</head>
<body>
<div class="container">
<h1>Login Page</h1>
<h2>${errorMessage}</h2>
<form method="post">
	<div>
		<span>Name:</span>
		<input type="text" name="name"/>
	</div>
	<div>
	<span>Password:</span>
	<input type="password" name="password"/>
	</div>
	<div>
	<button type="submit">Submit</button>
	</div>
</form>
</div>
</body>
</html>