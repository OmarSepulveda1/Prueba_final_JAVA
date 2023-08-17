package cl.Omar.Clinica.service;

import java.util.List;

import cl.Omar.Clinica.entity.Detalle;
import cl.Omar.Clinica.repository.ICalculoDescuento;

public class CalculoEdad implements ICalculoDescuento {
    @Override
    public double calcularDescuento(List<Detalle> detalles) {
        return 3.45;
    }
}
