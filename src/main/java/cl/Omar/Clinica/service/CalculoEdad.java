package cl.Omar.Clinica.service;

import java.util.List;

import cl.Omar.Clinica.entity.Detalle;
import cl.Omar.Clinica.entity.Paciente;
import cl.Omar.Clinica.repository.ICalculoDescuento;

public class CalculoEdad implements ICalculoDescuento {
    @Override
    public double calcularDescuento(List<Detalle> detalles) {
        // Implementa el cálculo de descuento basado en edad
    
    	return 0;
    }
    

    public static double calcularDescuentoPaciente(Paciente paciente) {
        if (paciente.edad <= 5) return 0.05;
        if (paciente.edad > 5 && paciente.edad < 13) return 0.03;
        if (paciente.edad >= 13 && paciente.edad <= 35) return 0.0;
        if (paciente.edad > 35 && paciente.edad < 60) return 0.10;
        return 0.30;
    }
    
    
}

