package cl.Omar.Clinica.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Omar.Clinica.entity.HistoriaClinica;
import cl.Omar.Clinica.repository.IHistoriaClinicaRepository;

@Service
public class HistoriaClinicaService {
	
	public HistoriaClinicaService() {
		super();
		
	}
	@Autowired
	private IHistoriaClinicaRepository hcRepo;
	
	
	public HistoriaClinica obtenerHistoriaClinica(int id) {
		return hcRepo.findById(id).get();
	}
	
	public void crearHistoriaClinica(HistoriaClinica hc) {
		hcRepo.save(hc);
	}
	public void actualizar(HistoriaClinica hc) {
		hcRepo.save(hc);
	}
	public void borrarHistoriaClinica(int id) {
		hcRepo.delete(hcRepo.getOne(id));
	}

}
