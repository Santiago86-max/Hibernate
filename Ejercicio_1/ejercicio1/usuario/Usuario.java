package ejercicio1.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario {

	@Id //Anotacion que especifica el atributo que sera la clave primaria
	@Column //Atributo que se va a insertar en la columna
	private String idUsuario;
	@Column
	private String nombre;
	@Column
	private String correo;
	
	public Usuario(String idUsuario, String nombre, String correo) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.correo = correo;
	}
	
	public Usuario() {
		this("","","");
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	
}
