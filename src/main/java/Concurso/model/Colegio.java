package Concurso.model;

public class Colegio {
	
	private String nombre;
	private String direcion;
	private String email;
	private String contrasena;
	private String persona_contacto;
	
	
	public Colegio(String nombre, String direcion, String email, String contrasena, String persona_contacto) {
		super();
		this.nombre = nombre;
		this.direcion = direcion;
		this.email = email;
		this.contrasena = contrasena;
		this.persona_contacto = persona_contacto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDirecion() {
		return direcion;
	}


	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getPersona_contacto() {
		return persona_contacto;
	}


	public void setPersona_contacto(String persona_contacto) {
		this.persona_contacto = persona_contacto;
	}


	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", direcion=" + direcion + ", email=" + email + ", contrasena="
				+ contrasena + ", persona_contacto=" + persona_contacto + "]";
	}

}
