package cl.Omar.Clinica.service;

import java.util.List;

import cl.Omar.Clinica.entity.Detalle;
import cl.Omar.Clinica.entity.Doctor;
import cl.Omar.Clinica.repository.ICalculoDescuento;

public class CalculoEspecialidadExperiencia implements ICalculoDescuento {
    @Override
    public double calcularDescuento(List<Detalle> detalles) {
        // Implementa el cálculo de descuento basado en especialidad y experiencia
    	return 0;
    }

    public static double calcularDescuentoMedico(Doctor doctor) {
        if (doctor.getExperiencia() < 10) return 0.15;
        if (doctor.getExperiencia() > 20) return 0.05;
        if (doctor.getEspecialidad().equals("Cardiólogo") || doctor.getEspecialidad().equals("Neurólogo")) {
            if (doctor.getExperiencia() > 10 && doctor.getExperiencia() < 20) return 0.05;
        }
        if (doctor.getEspecialidad().equals("Endocrinólogo") || doctor.getEspecialidad().equals("Oncólogo")) {
            if (doctor.getExperiencia() > 5) return 0.10;
        }
        if (doctor.getEspecialidad().equals("Dermatólogo")) return 0.0;
        return 0.0;
    }
}

