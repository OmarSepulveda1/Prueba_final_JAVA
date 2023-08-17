package cl.Omar.Clinica.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import cl.Omar.Clinica.entity.Paciente;

public interface IPacienteRepository extends JpaRepository <Paciente, Integer>{
	
	
}
