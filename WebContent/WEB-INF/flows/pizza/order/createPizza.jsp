<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Pizza</h2>

	<form:form commandName="pizza">
		<input type="hidden" name="flowExecutionKey"
			value="${flowExecutionKey}" />

		<form:radiobutton path="size" label="small" value="SMALL" />
		<br />
		<form:radiobutton path="size" label="normal" value="NORMAL" />
		<br />
		<form:radiobutton path="size" label="big" value="BIG" />
		<br />
		<br />
		<br />

		<b>Toppings:</b>

		<form:checkboxes path="toppings" items="${toppingsList}"
			delimiter="&lt;br/&gt;" />

		<input type="submit" value="Send" name="_eventId_addPizza" />
		<input type="submit" value="Cancel" name="_eventId_cancel" />
	</form:form>
</body>
</html>