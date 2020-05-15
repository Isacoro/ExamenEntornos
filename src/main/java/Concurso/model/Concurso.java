package Concurso.model;

import java.util.ArrayList;
import java.util.List;

public class Concurso {

	List<Visitante> usuario;
	
	public Concurso() {
	usuario = new ArrayList<>();
	}
	
	public void puntuar(Visitante usuario, Cuadro cuadro, int puntos) throws Exception {
		
	if (!usuario.contains(usuario)) {
	throw new Exception("Debes estar registrado para poder puntuar");
	}
	if ((puntos < 0) || (puntos > 5)) {
	throw new Exception("Debes puntuar del 1 al 5");
	}
	cuadro.setPuntuacion(puntos);
	}
}

