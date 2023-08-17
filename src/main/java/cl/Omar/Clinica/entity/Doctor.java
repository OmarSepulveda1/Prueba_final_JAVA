package cl.Omar.Clinica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne
    @JoinColumn(name = "Especialidad_ID")
    private Especialidad especialidad;
	@Column(name="Experiencia")
	private int Experiencia;
	
	public Doctor() {}
	
	
	public Doctor(int iD, String nombre, Especialidad especialidad, int experiencia) {
		super();
		ID = iD;
		Nombre = nombre;
		this.especialidad = especialidad;
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
	 * @return the especialidad
	 */
	public Especialidad getEspecialidad() {
		return especialidad;
	}


	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
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
