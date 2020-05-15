package Concurso.model;

import java.util.Date;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String curso;
	private String email;
	private Date fecha_nacimiento;
	
	
	public Alumno(String nombre, String apellidos, String curso, String email, Date fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", email=" + email
				+ ", fecha_nacimiento=" + fecha_nacimiento + "]";
	}
}
