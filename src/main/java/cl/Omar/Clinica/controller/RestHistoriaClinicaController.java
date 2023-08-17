package cl.Omar.Clinica.controller;

import cl.Omar.Clinica.entity.HistoriaClinica;
import cl.Omar.Clinica.service.HistoriaClinicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestHistoriaClinicaController {

	@Autowired
	private HistoriaClinicaService hcService;

	@RequestMapping(value = "/api/historiaClinica/{id}", headers = "Accept=application/json")
	public HistoriaClinica obtenerHistoriaClinicaPorId(@PathVariable("id") int id) {
		return hcService.obtenerHistoriaClinica(id);
	}

	@PostMapping(value="/api/historiaClinica", headers="Accept=application/json")
	public void crearHistoriaClinica(@RequestBody HistoriaClinica historiaClinica) {
		
		hcService.crearHistoriaClinica(historiaClinica);
	}
	
	@PutMapping(value="/api/historiaClinica/{id}", headers="Accept=application/json")
	public void actualizarHistoriaClinica(@PathVariable int id,@RequestBody HistoriaClinica historiaClinica) {
		HistoriaClinica historiaClinicaExistente = hcService.obtenerHistoriaClinica(id);
		if (historiaClinicaExistente != null) {
			hcService.actualizar(historiaClinica);
		}
	
	}
	
	@DeleteMapping(value="/api/historiaClinica/{id}", headers="Accept=application/json")
	public void eliminarHistoriaClinica(@PathVariable int id) {
		hcService.borrarHistoriaClinica(id);
	}
}
