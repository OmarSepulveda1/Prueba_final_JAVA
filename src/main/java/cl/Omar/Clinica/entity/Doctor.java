package cl.Omar.Clinica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctores")
public class Doctor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private int ID;
	@Column(name="Nombre")
	private String Nombre;
	@Column(name="Especialidad_ID")
	private int Especialidad_ID;
	@Column(name="Experiencia")
	private int Experiencia;
	
	public Doctor() {}
	
	public Doctor(int ID, String nombre, int especialidad_ID, int experiencia) {
		super();
		
		this.ID = ID;
		Nombre = nombre;
		Especialidad_ID = especialidad_ID;
		Experiencia = experiencia;
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
	 * @return the especialidad_ID
	 */
	public int getEspecialidad_ID() {
		return Especialidad_ID;
	}
	/**
	 * @param especialidad_ID the especialidad_ID to set
	 */
	public void setEspecialidad_ID(int especialidad_ID) {
		Especialidad_ID = especialidad_ID;
	}
	/**
	 * @return the experiencia
	 */
	public int getExperiencia() {
		return Experiencia;
	}
	/**
	 * @param experiencia the experiencia to set
	 */
	public void setExperiencia(int experiencia) {
		Experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
