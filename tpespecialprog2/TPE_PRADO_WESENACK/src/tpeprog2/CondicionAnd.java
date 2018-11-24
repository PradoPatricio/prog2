package tpeprog2;

public class CondicionAnd extends Condicion {
	private Condicion izq;
	private Condicion der;

	public CondicionAnd(Condicion izq, Condicion der) {
		this.der = der;
		this.izq = izq;
	}

	public boolean seCumple(Pelicula p) {
		if ((der.seCumple(p)) && (izq.seCumple(p))) {
			return true;
		} else {
			return false;
		}

	}
}
