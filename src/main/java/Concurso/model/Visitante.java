package Concurso.model;

public class Visitante {
	
	private String usuario;
	private String contrasena;
	private int puntos = 0;
	

	public Visitante(String usuario, String contrasena, int puntos) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.puntos = puntos;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	@Override
	public String toString() {
		return "Visitante [usuario=" + usuario + ", contrasena=" + contrasena + ", puntos=" + puntos + "]";
	}


	public boolean contains(Visitante visitante) {
		return false;
	}
}
