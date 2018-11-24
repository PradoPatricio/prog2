package tpeprog2;

public class CondicionGenero extends Condicion {
	private String genero;

	CondicionGenero(String genero) {
		this.genero = genero.toLowerCase();
	}

	public boolean seCumple(Pelicula p) {
		return p.tieneGenero(genero);
	}
}
