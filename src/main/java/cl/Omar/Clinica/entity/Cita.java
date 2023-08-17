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
@Table(name="citas")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private int ID;
	@ManyToOne
    @JoinColumn(name = "Paciente_ID")
    private Paciente paciente;
	@ManyToOne
    @JoinColumn(name = "Doctor_ID")
    private Doctor doctor;
	@Column(name="Fecha")
	private LocalDate Fecha;
	@ManyToOne
    @JoinColumn(name = "Factura_ID")
    private Factura factura;
	
	public Cita() {}
	


	public Cita(int iD, Paciente paciente, Doctor doctor, LocalDate fecha, Factura factura) {
		super();
		ID = iD;
		this.paciente = paciente;
		this.doctor = doctor;
		Fecha = fecha;
		this.factura = factura;
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
	 * @return the factura
	 */
	public Factura getFactura() {
		return factura;
	}



	/**
	 * @param factura the factura to set
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
