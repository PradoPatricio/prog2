package tpeprog2;

import java.util.Iterator;

public abstract class User {
	private String nombre;

	public abstract void puntuarPelicula(Pelicula p, int x);

	public abstract Iterator<Pelicula> getPeliculasVistas();

	public abstract Iterator<String> getGenerosFavoritos();

	public abstract void mirarPelicula(Pelicula p);
	
	public abstract boolean vioPelicula(Pelicula p);

	User(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public boolean equals(Object obs) {
		if (this.nombre.equals(((User) obs).getNombre())) {
			return true;
		} else {
			return false;
		}
	}

}