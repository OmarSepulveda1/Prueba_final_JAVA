package cl.Omar.Clinica.repository;

import java.util.List;

import cl.Omar.Clinica.entity.Detalle;

public interface ICalculoDescuento {
    double calcularDescuento(List<Detalle> detalles);
}
