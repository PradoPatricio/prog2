package tpeprog2;

public class CondicionPosterior extends Condicion {

	int numero;

	public CondicionPosterior(int x) {
		this.numero = x;
	}

	public boolean seCumple(Pelicula p) {
		return p.getAño() >= numero;
	}
}
