package cl.Omar.Clinica.service;

import java.util.List;

import cl.Omar.Clinica.entity.Detalle;
import cl.Omar.Clinica.repository.ICalculoDescuento;

public class CalculoEspecialidadExperiencia implements ICalculoDescuento {
    @Override
    public double calcularDescuento(List<Detalle> detalles) {
        return 345;
    }
}
