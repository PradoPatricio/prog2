package tpeprog2;


import java.util.Comparator;

public class ComparadorPopularidad implements Comparator<Pelicula> {

	public int compare(Pelicula p1, Pelicula p2) {
		return (p2.calcularPopularidad() - (p1.calcularPopularidad()));

	}

}
