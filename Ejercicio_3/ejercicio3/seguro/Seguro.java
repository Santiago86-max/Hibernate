package ejercicio3.seguro;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import ejercicio3.asistencia.AsistenciaMedica;

@Entity
@Table(name="Seguro")
public class Seguro implements Serializable {
	
	@Id
	@Column
	private int idSeguro;
	@Column
	private String nif;
	@Column
	private String nombre;
	@Column
	private int edad;
	@Column
	private int num_hijos;
	@Column
	private int casado;
	@Column
	private Date fecha_creacion;
	@OneToMany(mappedBy="seguro",cascade= CascadeType.ALL)
	private Set<AsistenciaMedica> asistencias;
	@Embedded
	private Enfermedades enfermedades;
	
	public Seguro(int idSeguro, String nif, String nombre, int edad, int numHijos, Date fechaCreacion, Set<ejercicio3.asistencia.AsistenciaMedica> asistenciaMedica,Enfermedades enfermedades) {
		this.idSeguro = idSeguro;
		this.nif = nif;
		this.nombre = nombre;
		this.edad = edad;
		this.num_hijos = numHijos;
		this.fecha_creacion = fechaCreacion;
		this.asistencias = asistenciaMedica;
		this.enfermedades=enfermedades;
	}
	
	public Seguro() {
		this(0,"","",0,0,new Date(System.currentTimeMillis()),new HashSet<>(),new Enfermedades());
	}

	
	
	public int getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumHijos() {
		return num_hijos;
	}

	public void setNumHijos(int numHijos) {
		this.num_hijos = numHijos;
	}

	public Date getFechaCreacion() {
		return fecha_creacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fecha_creacion = fechaCreacion;
	}

	public Set<AsistenciaMedica> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Set<AsistenciaMedica> asistencias) {
		this.asistencias = asistencias;
	}

	public void verDatos() {
		HashSet<AsistenciaMedica> aux = new HashSet<>(asistencias);
		String resultado = "";
		for (AsistenciaMedica asistenciaMedica : aux) {
			System.out.println(asistenciaMedica.toString());
		}
		System.out.println("Seguro [idSeguro=" + idSeguro + ", nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + ", numHijos="
				+ num_hijos + ", fechaCreacion=" + fecha_creacion + ", asistencias=" + resultado + "]");
	}

	@Override
	public String toString() {
		return "Seguro [idSeguro=" + idSeguro + ", nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + ", numHijos="
				+ num_hijos + ", fechaCreacion=" + fecha_creacion + "]";
	}


	
	
}
