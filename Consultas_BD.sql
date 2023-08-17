-- Consulta 1: Nombre de pacientes y sus doctores
SELECT P.Nombre AS Paciente, D.Nombre AS Doctor
FROM Pacientes P
JOIN Citas C ON P.ID = C.Paciente_ID
JOIN Doctores D ON C.Doctor_ID = D.ID;

-- Consulta 2: Doctores que atendieron al paciente "Juan Pérez"
SELECT D.Nombre AS Doctor, E.Nombre AS Especialidad
FROM Doctores D
JOIN Citas C ON D.ID = C.Doctor_ID
JOIN Pacientes P ON C.Paciente_ID = P.ID
JOIN Especialidades E ON D.Especialidad_ID = E.ID
WHERE P.Nombre = 'Juan Pérez';

-- Consulta 3: Monto facturado por cada doctor
SELECT D.Nombre AS Doctor, SUM(F.Monto) AS Monto_Total
FROM Doctores D
JOIN Citas C ON D.ID = C.Doctor_ID
JOIN Facturas F ON C.Factura_ID = F.ID
GROUP BY D.ID, D.Nombre
ORDER BY D.Nombre DESC;

-- Consulta 4: Diagnóstico y tratamiento de la última cita de cada paciente
SELECT P.Nombre AS Paciente, HC.Diagnostico, HC.Tratamiento
FROM Pacientes P
JOIN Historia_Clinica HC ON P.ID = HC.Paciente_ID
WHERE HC.ID IN (
    SELECT MAX(ID)
    FROM Historia_Clinica
    GROUP BY Paciente_ID
)
ORDER BY P.ID ASC;

-- Consulta 5: Cantidad de pacientes atendidos por cada doctor
SELECT D.Nombre AS Doctor, COUNT(DISTINCT C.Paciente_ID) AS Cantidad_Pacientes
FROM Doctores D
LEFT JOIN Citas C ON D.ID = C.Doctor_ID
GROUP BY D.ID, D.Nombre;
