
package cl.Omar.Clinica.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Omar.Clinica.entity.Doctor;
import cl.Omar.Clinica.repository.IDoctorRepository;

@Service
public class DoctorService {
	
	public DoctorService() {
		super();
	
	}

	@Autowired
	private IDoctorRepository docRepo;
	
	public ArrayList<Doctor> obtenerDoctores(){
		return (ArrayList<Doctor>) docRepo.findAll();
	}
}

