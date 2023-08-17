package cl.Omar.Clinica.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.Omar.Clinica.entity.Doctor;
import cl.Omar.Clinica.service.DoctorService;

@RestController
public class RestDoctorController {
	
	@Autowired
	private DoctorService doc;
	
	@RequestMapping(value ="/api/ListarDoctor", headers="Accept=application/json")
	public ArrayList<Doctor> getDoctores(){
		return doc.obtenerDoctores();
	}
	
}
