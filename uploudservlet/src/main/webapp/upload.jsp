<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload File To Servlet</title>
</head>
<body>

<h1>File Upload Demo</h1>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
	<input type="file"  name="image">
	<button type="submit" >Upload</button>

</form>

</body>
</html>