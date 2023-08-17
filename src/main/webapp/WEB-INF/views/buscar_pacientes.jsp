<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Buscar Pacientes</title>
</head>
<body>
    <h1>Buscar Pacientes</h1>
    <form action="/buscarPacientes" method="get">
        <input type="text" name="parametro" placeholder="Buscar por Id o nombre">
        <button type="submit">Buscar</button>
    </form>
    <ul>
        <c:forEach items="${pacientes}" var="paciente">
            <li><a href="<c:url value='/historiaClinica'>"><c:param name="id" value="${paciente.id}"/></c:url>">${paciente.nombre}</a></li>
        </c:forEach>
    </ul>
</body>
</html>