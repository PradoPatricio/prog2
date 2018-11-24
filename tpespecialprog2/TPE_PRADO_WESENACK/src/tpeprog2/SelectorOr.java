package tpeprog2;

public class SelectorOr extends Selector {
	private Selector izq;
	private Selector der;

	public SelectorOr(Selector izq, Selector der) {
		this.der = der;
		this.izq = izq;
	}

	public boolean cumple(Pelicula p, User u) {
		if ((der.cumple(p, u)) || (izq.cumple(p, u))) {
			return true;
		} else {
			return false;
		}

	}
}
