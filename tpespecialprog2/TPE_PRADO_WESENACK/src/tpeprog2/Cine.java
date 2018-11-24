package tpeprog2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Cine {
	ArrayList<Pelicula> peliculas;
	ArrayList<User> usuarios;
	Selector selector;
	Comparator<Pelicula> comparador;

	public Cine(Selector selector, Comparator<Pelicula> comparador) {
		this.peliculas = new ArrayList<Pelicula>();
		this.usuarios = new ArrayList<User>();
		this.selector = selector;
		this.comparador = comparador;
	}

	public void añadirUsuario(User u) {
		usuarios.add(u);
	}

	public void añadirPelicula(Pelicula p) {
		peliculas.add(p);
	}

	public Iterator<Pelicula> BuscarPelicula(Condicion c) {   // Busca una pelicula segun un criterio
		ArrayList<Pelicula> encontradas = new ArrayList<Pelicula>();
		for (int i = 0; i < peliculas.size(); i++) {
			if (c.seCumple(peliculas.get(i))) {
				encontradas.add(peliculas.get(i));
			}
		}
		return encontradas.iterator();
	}

	public Iterator<Pelicula> Recomendar(User usuario, int numero) {   //Recomienda para un usuario una cantidad deseada de peliculas con los criterios de seleccion y de ordenamiento por defecto
		return Recomendar(usuario, numero, this.selector, this.comparador);
	}

	public Iterator<Pelicula> Recomendar(User usuario, int numero, Selector s, Comparator<Pelicula> comparador) {   //Recomienda para un usuario una cantidad deseada de peliculas con los criterios de seleccion y de ordenamiento que se pasan por parametro
		ArrayList<Pelicula> obtenidas = new ArrayList<Pelicula>();

		for (int i = 0; i < peliculas.size(); i++) {
			if ((s.cumple(peliculas.get(i), usuario)) && (!(usuario.vioPelicula(peliculas.get(i))))) {
				obtenidas.add(peliculas.get(i));
			}
		}

		Collections.sort(obtenidas, comparador);

		ArrayList<Pelicula> salidaXcantidad = new ArrayList<Pelicula>();
		int i = 0;
		while ((i < obtenidas.size() && (i < numero))) {
			salidaXcantidad.add(obtenidas.get(i));
			i++;
		}
		return salidaXcantidad.iterator();

	}

}
