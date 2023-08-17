package cl.Omar.Clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.Omar.Clinica.entity.Doctor;

public interface IDoctorRepository extends JpaRepository <Doctor, Integer>{

}
