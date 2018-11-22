package ejercicio3.seguro;

import javax.persistence.Column;

import javax.persistence.Embeddable;
@Embeddable
public class Enfermedades {

	@Column
	private int dental;
	@Column
	private int corazon;
	@Column
	private int estomacal;
	@Column
	private int alergia;
	@Column
	private String nombreAlergia;

	public Enfermedades(int dental, int corazon, int estomacal, int alergia, String nombreAlergia) {
		this.dental = dental;
		this.corazon = corazon;
		this.estomacal = estomacal;
		//this.alergia = alergia;
		//this.nombreAlergia = nombreAlergia;
	}
	public Enfermedades() {
		this(0,0,0,0,"");
	}
	public int getDental() {
		return dental;
	}
	public void setDental(int dental) {
		this.dental = dental;
	}
	public int getCorazon() {
		return corazon;
	}
	public void setCorazon(int corazon) {
		this.corazon = corazon;
	}
	public int getEstomacal() {
		return estomacal;
	}
	public void setEstomacal(int estomacal) {
		this.estomacal = estomacal;
	}
	public int getAlergia() {
		return alergia;
	}
	public void setAlergia(int alergia) {
		this.alergia = alergia;
	}
	public String getNombreAlergia() {
		return nombreAlergia;
	}
	public void setNombreAlergia(String nombreAlergia) {
		this.nombreAlergia = nombreAlergia;
	}
	
	
}
