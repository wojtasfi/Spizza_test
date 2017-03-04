<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spizza</title>
</head>
<body>
	<h2>Welcome at Spizza!</h2>

	<form:form>

		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<input type="text" name="phoneNumber" />
		<br/>
		<input type="submit" name="_eventId_phoneEntered" value="Find client" />

	</form:form>


	Min
</body>
</html>