package cl.Omar.Clinica.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="citas")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private int ID;
	@Column(name="Paciente_ID")
	private int Paciente_ID;
	@Column(name="Doctor_ID")
	private int Doctor_ID;
	@Column(name="Fecha")
	private LocalDate Fecha;
	@Column(name="Factura_ID")
	private int Factura_ID;
	
	public Cita() {}
	
	public Cita(int ID, int paciente_ID, int doctor_ID, LocalDate fecha, int factura_ID) {
		super();
		
		this.ID = ID;
		Paciente_ID = paciente_ID;
		Doctor_ID = doctor_ID;
		Fecha = fecha;
		Factura_ID = factura_ID;
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
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return Fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}

	/**
	 * @return the factura_ID
	 */
	public int getFactura_ID() {
		return Factura_ID;
	}

	/**
	 * @param factura_ID the factura_ID to set
	 */
	public void setFactura_ID(int factura_ID) {
		Factura_ID = factura_ID;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
