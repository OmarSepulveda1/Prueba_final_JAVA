<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Citas - The Clínica</title>
    <!-- CSS Proyecto -->
<%@include file="css-proyect.jsp"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<%@ include file="navbar.jsp" %>

<div class="container mt-4">
    <h1>Listado de Citas</h1>

    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Paciente</th>
            <th>Doctor</th>
            <th>Fecha</th>
            <th>Factura</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="cita" items="${citas}">
            <tr>
                <td>${cita.ID}</td>
                <td>${cita.paciente.Nombre}</td>
                <td>${cita.doctor.Nombre}</td>
                <td>${cita.Fecha}</td>
                <td>${cita.factura.Monto}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
/html>