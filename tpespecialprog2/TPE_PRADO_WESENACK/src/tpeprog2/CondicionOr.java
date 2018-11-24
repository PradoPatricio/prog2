package tpeprog2;

public class CondicionOr extends Condicion {
	private Condicion izq;
	private Condicion der;

	public CondicionOr(Condicion izq, Condicion der) {
		this.der = der;
		this.izq = izq;
	}

	public boolean seCumple(Pelicula p) {
		if ((der.seCumple(p)) || (izq.seCumple(p))) {
			return true;
		} else {
			return false;
		}

	}
}