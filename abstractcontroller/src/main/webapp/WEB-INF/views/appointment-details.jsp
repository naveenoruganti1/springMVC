<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment Details</title>
</head>
<body>
	<h1>Appointment Details</h1>
	Patient Name: ${appointment.patientName} <br/>
	Appointment Id: ${appointment.appointmentId} <br/>
	Appointment Date: ${appointment.appointmentDate} <br/>
	<p>
		Please be available before 1hr at hospital with appointment Details
	</p>
</body>
</html>