package cl.Omar.Clinica.service;

import java.util.ArrayList;
import java.util.List;

import cl.Omar.Clinica.entity.Detalle;
import cl.Omar.Clinica.repository.ICalculoDescuento;

public class MainService {
	public static void main(String[] args) {
        // Crea una lista de detalles de ejemplo
        List<Detalle> detalles = new ArrayList<>();
        // Agrega detalles a la lista
        
        // Crea instancias de las estrategias de cálculo de descuento
        ICalculoDescuento calculoEdad = new CalculoEdad();
        ICalculoDescuento calculoEspecialidadExperiencia = new CalculoEspecialidadExperiencia();
        
        // Calcula y muestra los descuentos aplicados
        double descuentoEdad = calculoEdad.calcularDescuento(detalles);
        double descuentoEspecialidadExperiencia = calculoEspecialidadExperiencia.calcularDescuento(detalles);
        
        System.out.println("Descuento por Edad: " + descuentoEdad);
        System.out.println("Descuento por Especialidad y Experiencia: " + descuentoEspecialidadExperiencia);
    }

}
