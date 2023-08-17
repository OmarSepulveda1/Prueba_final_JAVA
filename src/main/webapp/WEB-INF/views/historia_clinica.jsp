<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Encabezado y estilos aqu� -->
</head>
<body>
    <div class="container mt-4">
        <h1>Historia Cl�nica de ${paciente.Nombre}</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>Fecha</th>
                    <th>M�dico</th>
                    <th>S�ntomas</th>
                    <th>Diagn�stico</th>
                    <th>Tratamiento</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="cita" items="${paciente.historiaClinica}">
                    <tr>
                        <td>${cita.Fecha_Cita}</td>
                        <td>${cita.doctor.Nombre}</td>
                        <td>${cita.Sintomas}</td>
                        <td>${cita.Diagnostico}</td>
                        <td>${cita.Tratamiento}</td>
                        <td><button class="btn btn-primary">Editar</button></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
