<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Encabezado y estilos aquí -->
</head>
<body>
    <div class="container mt-4">
        <h1>Resultados de la búsqueda</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Fecha de Nacimiento</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="paciente" items="${pacientes}">
                    <tr>
                        <td>${paciente.ID}</td>
                        <td>${paciente.Nombre}</td>
                        <td>${paciente.Fecha_Nacimiento}</td>
                        <td><a href="/verHistoriaClinica/${paciente.ID}" class="btn btn-info">Ver Historia Clínica</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
