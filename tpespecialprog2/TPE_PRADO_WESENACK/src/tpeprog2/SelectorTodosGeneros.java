package tpeprog2;

import java.util.Iterator;

public class SelectorTodosGeneros extends Selector {

	public boolean cumple(Pelicula p, User s) {
		Iterator<String> generos = s.getGenerosFavoritos();
		while (generos.hasNext()) {
			if (!p.tieneGenero(generos.next())) {
				return false;
			}
		}
		return true;

	}
}
