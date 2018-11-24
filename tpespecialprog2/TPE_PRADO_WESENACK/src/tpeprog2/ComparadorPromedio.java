package tpeprog2;


import java.util.Comparator;

public class ComparadorPromedio implements Comparator<Pelicula> {

	public int compare(Pelicula p1, Pelicula p2) {
		if (p1.calcularPromedio() < (p2.calcularPromedio())) {
			return 1;
		} else if (p1.calcularPromedio() > (p2.calcularPromedio())) {
			return -1;
		} else
			return 0;

	}
}
