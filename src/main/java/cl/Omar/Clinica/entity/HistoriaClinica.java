package cl.Omar.Clinica.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historia_clinica")
public class HistoriaClinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
	@Column(name="Paciente_ID")
	private int Paciente_ID;
	@Column(name="Doctor_ID")
	private int Doctor_ID;
	@Column(name="Fecha_Cita")
	private LocalDate Fecha_Cita;
	@Column(name="Sintomas")
	private String Sintomas;
	@Column(name="Diagnostico")
	private String Diagnostico;
	@Column(name="Tratamiento")
	private String Tratamiento;
	
	public HistoriaClinica() {}
	
	public HistoriaClinica(int ID, int paciente_ID, int doctor_ID, LocalDate fecha_Cita, String sintomas,
			String diagnostico, String tratamiento) {
		super();
		
		this.ID = ID;
		Paciente_ID = paciente_ID;
		Doctor_ID = doctor_ID;
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
	 * @return the paciente_ID
	 */
	public int getPaciente_ID() {
		return Paciente_ID;
	}

	/**
	 * @param paciente_ID the paciente_ID to set
	 */
	public void setPaciente_ID(int paciente_ID) {
		Paciente_ID = paciente_ID;
	}

	/**
	 * @return the doctor_ID
	 */
	public int getDoctor_ID() {
		return Doctor_ID;
	}

	/**
	 * @param doctor_ID the doctor_ID to set
	 */
	public void setDoctor_ID(int doctor_ID) {
		Doctor_ID = doctor_ID;
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
