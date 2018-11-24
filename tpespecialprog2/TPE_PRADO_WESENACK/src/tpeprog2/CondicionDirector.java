package tpeprog2;

public class CondicionDirector extends Condicion {
	private String director;

	public CondicionDirector(String director) {
		this.director = director.toLowerCase();
	}

	public boolean seCumple(Pelicula p) {
		return p.tieneDirector(director);
	}
}
