package ejercicio3.asistencia;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import ejercicio3.seguro.Seguro;
@Entity
@Table(name="AsistenciaMedica")
public class AsistenciaMedica implements Serializable{

	@Id
	@Column
	private int idAsistenciaMedica;
	@ManyToOne
	@JoinColumn(name="idSeguro")
	private Seguro seguro;
	@Column
	private String breveDescripcion;
	@Column
	private String lugar;
	
	
	public AsistenciaMedica() {
		this(0,new Seguro(),"","");
	}
	
	public AsistenciaMedica(int idAsistenciaMedica, Seguro seguro, String breveDescripcion, String lugar) {
		super();
		this.idAsistenciaMedica = idAsistenciaMedica;
		this.seguro = seguro;
		this.breveDescripcion = breveDescripcion;
		this.lugar = lugar;
	}

	
	public int getIdAsistenciaMedica() {
		return idAsistenciaMedica;
	}

	public void setIdAsistenciaMedica(int idAsistenciaMedica) {
		this.idAsistenciaMedica = idAsistenciaMedica;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public String getBreveDescripcion() {
		return breveDescripcion;
	}

	public void setBreveDescripcion(String breveDescripcion) {
		this.breveDescripcion = breveDescripcion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "AsistenciaMedica [idAsistenciaMedica=" + idAsistenciaMedica + ", seguro=" + seguro.getIdSeguro()
				+ ", breveDescripcion=" + breveDescripcion + ", lugar=" + lugar + "]";
	}
}
