package cl.Omar.Clinica.entity;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private int ID;
	@Column(name="Nombre")
	private String Nombre;
	@Column(name="Fecha_Nacimiento")
	private LocalDate Fecha_Nacimiento;
	
	public Paciente() {}
	public Paciente(int ID, String nombre, LocalDate fecha_Nacimiento) {
		super();
		
		this.ID = ID;
		Nombre = nombre;
		Fecha_Nacimiento = fecha_Nacimiento;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return the fecha_Nacimiento
	 */
	public LocalDate getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}
	/**
	 * @param fecha_Nacimiento the fecha_Nacimiento to set
	 */
	public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	public int edad() {
		LocalDate hoy = LocalDate.now();
	    Period periodo = Period.between(Fecha_Nacimiento, hoy);
	    return periodo.getYears();
	}

}
