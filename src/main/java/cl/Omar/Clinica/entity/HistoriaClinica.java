package cl.Omar.Clinica.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="historia_clinica")
public class HistoriaClinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
	@ManyToOne
    @JoinColumn(name = "Paciente_ID")
    private Paciente paciente;
	@ManyToOne
    @JoinColumn(name = "Doctor_ID")
    private Doctor doctor;
	@Column(name="Fecha_Cita")
	private LocalDate Fecha_Cita;
	@Column(name="Sintomas")
	private String Sintomas;
	@Column(name="Diagnostico")
	private String Diagnostico;
	@Column(name="Tratamiento")
	private String Tratamiento;
	
	public HistoriaClinica() {}
	

	public HistoriaClinica(int iD, Paciente paciente, Doctor doctor, LocalDate fecha_Cita, String sintomas,
			String diagnostico, String tratamiento) {
		super();
		ID = iD;
		this.paciente = paciente;
		this.doctor = doctor;
		Fecha_Cita = fecha_Cita;
		Sintomas = sintomas;
		Diagnostico = diagnostico;
		Tratamiento = tratamiento;
	}




	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}


	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}


	/**
	 * @return the paciente
	 */
	public Paciente getPaciente() {
		return paciente;
	}


	/**
	 * @param paciente the paciente to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}


	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	/**
	 * @return the fecha_Cita
	 */
	public LocalDate getFecha_Cita() {
		return Fecha_Cita;
	}


	/**
	 * @param fecha_Cita the fecha_Cita to set
	 */
	public void setFecha_Cita(LocalDate fecha_Cita) {
		Fecha_Cita = fecha_Cita;
	}


	/**
	 * @return the sintomas
	 */
	public String getSintomas() {
		return Sintomas;
	}


	/**
	 * @param sintomas the sintomas to set
	 */
	public void setSintomas(String sintomas) {
		Sintomas = sintomas;
	}


	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return Diagnostico;
	}


	/**
	 * @param diagnostico the diagnostico to set
	 */
	public void setDiagnostico(String diagnostico) {
		Diagnostico = diagnostico;
	}


	/**
	 * @return the tratamiento
	 */
	public String getTratamiento() {
		return Tratamiento;
	}


	/**
	 * @param tratamiento the tratamiento to set
	 */
	public void setTratamiento(String tratamiento) {
		Tratamiento = tratamiento;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
