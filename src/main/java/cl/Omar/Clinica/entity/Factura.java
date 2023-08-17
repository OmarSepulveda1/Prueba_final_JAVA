package cl.Omar.Clinica.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facturas")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="ID")
	private int ID;
	@Column(name="Monto")
	private float Monto;
	@Column(name="Fecha_Pago")
	private LocalDate Fecha_Pago;
	
	public Factura() {}
	public Factura(int ID, float monto, LocalDate fecha_Pago) {
		super();
		
		this.ID = ID;
		Monto = monto;
		Fecha_Pago = fecha_Pago;
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
	 * @return the monto
	 */
	public float getMonto() {
		return Monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(float monto) {
		Monto = monto;
	}
	/**
	 * @return the fecha_Pago
	 */
	public LocalDate getFecha_Pago() {
		return Fecha_Pago;
	}
	/**
	 * @param fecha_Pago the fecha_Pago to set
	 */
	public void setFecha_Pago(LocalDate fecha_Pago) {
		Fecha_Pago = fecha_Pago;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} 
	
	
	

}
