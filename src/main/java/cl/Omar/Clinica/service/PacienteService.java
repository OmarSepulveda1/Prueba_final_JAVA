package cl.Omar.Clinica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Omar.Clinica.entity.Paciente;
import cl.Omar.Clinica.repository.IPacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    public List<Paciente> obtenerTodosLosPacientes() {
        return pacienteRepository.findAll();
    }

    public Paciente obtenerPacientePorId(int id) {
        Optional<Paciente> pacienteOptional = pacienteRepository.findById(id);
        return pacienteOptional.orElse(null);
    }
    
     	
    public void guardarPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    public void actualizarPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    public void borrarPaciente(int id) {
        pacienteRepository.deleteById(id);
    }


}
