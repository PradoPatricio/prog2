package tpeprog2;

public class CondicionAnterior extends Condicion {

	int numero;

	public CondicionAnterior(int a�o) {
		this.numero = a�o;
	}

	public boolean seCumple(Pelicula p) {
		return p.getA�o() <= numero;
	}

}
