<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Demo</title>
</head>
<body>
	<h2>User Data</h2>
	<form:form action="addUser" modelAttribute="user" method="POST">
		<form:label path="name">Nombre:</form:label>
		<form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
		<br>
		<form:label path="id">Id:</form:label>
		<form:input path="id" />
		<form:errors path="id" cssClass="error" />
		<br>
		<br>
		<form:label path="password">Password:</form:label>
		<form:input path="password" />
		<form:errors path="password" cssClass="error" />
		<br>
		<br>
		<form:label path="email">Email:</form:label>
		<form:input path="email" />
		<form:errors path="email" cssClass="error" />
		<br>
		<br>
		<form:label path="birth">Cumpleaños:</form:label>
		<form:input path="birth" />
		<form:errors path="birth" cssClass="error" />
		<br>
		<br>
		<form:label path="age">Edad:</form:label>
		<form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br>
		<br>
		<form:label path="height">Altura:</form:label>
		<form:input path="height" />
		<form:errors path="height" cssClass="error" />
		<br>
		<br>
		<form:label path="hobbies">Hobbies:</form:label>
		<form:input path="hobbies" />
		<form:errors path="hobbies" cssClass="error" />
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>