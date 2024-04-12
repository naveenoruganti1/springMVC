<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Appointment</title>
</head>
<body>
	<h1 style="color: gray; font-family: serif;">Book Appointment</h1>
	<form action="${pageContext.request.contextPath}/doBookAppointment.htm" method="post">
		Patient Name: <input name="patientName" type="text"><br/>
		Age: <input name="age" type="number"/><br/>
		Gender: Male: <input name="gender" value="male" type="radio"/>  Female: <input name="gender" value="female" type="radio"/><br/>
		Appointment Date: <input type="datetime" name="appointmentDate"/><br/>
		Mobile: <input name="mobileNo" type="text"/><br/> 
		<input type="submit" value="Book Appointment">
	</form>
</body>
</html>