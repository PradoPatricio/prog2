package tpeprog2;

public class CondicionAnterior extends Condicion {

	int numero;

	public CondicionAnterior(int año) {
		this.numero = año;
	}

	public boolean seCumple(Pelicula p) {
		return p.getAño() <= numero;
	}

}
