<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spizza</title>
</head>
<body>
	<h2>Delivery Warning</h2>

	<p>You can still place an order but you will have to pick it up by
		yourself</p>
	
	<a href='${flowExecutionUrl}&_eventId=accept'>Next</a> | 
	<a href='${flowExecutionUrl}&_eventId=cancel'>Cancel</a>

</body>
</html>