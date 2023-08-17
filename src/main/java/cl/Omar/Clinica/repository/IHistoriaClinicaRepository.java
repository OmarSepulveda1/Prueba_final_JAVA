package cl.Omar.Clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.Omar.Clinica.entity.HistoriaClinica;

public interface IHistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Integer> {

}
