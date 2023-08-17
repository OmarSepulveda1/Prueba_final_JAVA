package cl.Omar.Clinica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="especialidades")
public class Especialidad {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int ID;
	@Column(name="Nombre")
	private String nombreEsp;
	
	public Especialidad() {}
	public Especialidad(int ID, String nombreEsp) {
		super();
		
	
		this.ID = ID;
		this.nombreEsp = nombreEsp;
		
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
	 * @return the nombreEsp
	 */
	public String getNombreEsp() {
		return nombreEsp;
	}
	/**
	 * @param nombreEsp the nombreEsp to set
	 */
	public void setNombreEsp(String nombreEsp) {
		this.nombreEsp = nombreEsp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	}

	
	
	
