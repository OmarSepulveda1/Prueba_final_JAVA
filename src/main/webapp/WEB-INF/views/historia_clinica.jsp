<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Historia Clínica</title>
</head>
<body>
    <h1>Historia Clínica de ${paciente.nombre}</h1>
    <ul>
        <c:forEach items="${paciente.historiaClinica}" var="visita">
            <h2>${visita.fecha}</h2>
            <p>Doctor: ${visita.doctor}</p>
            <p>Síntomas: ${visita.sintomas}</p>
            <p>Diagnóstico: ${visita.diagnostico}</p>
            <p>Tratamiento: ${visita.tratamiento}</p>
            <a href="<c:url value='/editarVisita'>"><c:param name="id" value="${visita.id}"/></c:url>">Editar</a>
        </c:forEach>
    </ul>
</body>
</html>