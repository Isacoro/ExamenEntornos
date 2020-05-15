package Concurso.model;

public class Cuadro {
	
	private String nombre;
	private String tecnica;
	private int alto_cuadro;
	private int ancho_cuadro;

	private int puntuacion;

	public Cuadro(String nombre, String tecnica, int alto_cuadro, int ancho_cuadro, int puntuacion) {
		super();
		this.nombre = nombre;
		this.tecnica = tecnica;
		this.alto_cuadro = alto_cuadro;
		this.ancho_cuadro = ancho_cuadro;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public int getAlto_cuadro() {
		return alto_cuadro;
	}

	public void setAlto_cuadro(int alto_cuadro) {
		this.alto_cuadro = alto_cuadro;
	}

	public int getAncho_cuadro() {
		return ancho_cuadro;
	}

	public void setAncho_cuadro(int ancho_cuadro) {
		this.ancho_cuadro = ancho_cuadro;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Cuadro [nombre=" + nombre + ", tecnica=" + tecnica + ", alto_cuadro=" + alto_cuadro + ", ancho_cuadro="
				+ ancho_cuadro + ", puntuacion=" + puntuacion + "]";
	}
}
