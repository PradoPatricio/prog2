package tpeprog2;

import java.util.Iterator;

public class SelectorAlgunGenero extends Selector {

	public boolean cumple(Pelicula p, User usuario) {
		Iterator<String> generos = usuario.getGenerosFavoritos();
		while (generos.hasNext()) {
			if (p.tieneGenero(generos.next())) {
				return true;
			}
		}
		return false;

	}
}
