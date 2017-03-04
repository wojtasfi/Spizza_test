<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spizza</title>
</head>
<body>
	<h2>Register new Client</h2>

	<form:form commandName="customer">
		<input type="hidden" name="flowExecutionKey"
			value="${flowExecutionKey}" />

		<b>Phone Number:</b>
		<form:input path="phoneNumber" />
		<br />
		<b>Name and surname:</b>
		<form:input path="name" />
		<br />
		<b>Address:</b>
		<form:input path="address" />
		<br />
		<b>City:</b>
		<form:input path="city" />
		<br />
		<b>Area:</b>
		<form:input path="area" />
		<br />
		<b>Zip-code:</b>
		<form:input path="zipCode" />
		<br />
		<input type="submit" value="Send" name="_eventId_submit" />
		<input type="submit" value="Cancel" name="_eventId_cancel" />



	</form:form>


</body>
</html>