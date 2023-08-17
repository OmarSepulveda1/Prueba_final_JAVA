package cl.Omar.Clinica.controller;

import cl.Omar.Clinica.entity.HistoriaClinica;
import cl.Omar.Clinica.service.HistoriaClinicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestHistoriaClinicaController {

	@Autowired
	private HistoriaClinicaService hcService;

	@RequestMapping(value = "/api/historiaClinica/{id}", headers = "Accept=application/json")
	public HistoriaClinica obtenerHistoriaClinicaPorId(@PathVariable("id") int id) {
		return hcService.obtenerHistoriaClinica(id);
	}


    // Método para mostrar la historia clínica del paciente utilizando JSP
    @GetMapping("/historiaClinica/{id}")
    public String mostrarHistoriaClinicaJSP(@PathVariable int id, Model model) {
        HistoriaClinica historiaClinica = hcService.obtenerHistoriaClinica(id);
        if (historiaClinica != null) {
            model.addAttribute("historiaClinica", historiaClinica);
            return "historiaClinica"; // nombre de la vista JSP
        }
        return "error"; // Maneja el caso en que no se encuentre la historia clínica
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
