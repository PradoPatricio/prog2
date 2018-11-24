package tpeprog2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Grupo extends User {
	ArrayList<User> miembros;

	public Grupo(String nombre) {
		super(nombre);
		this.miembros = new ArrayList<User>();
	}
	
	public void añadirMiembro(User u) {
		miembros.add(u);
	}
	
	public void puntuarPelicula(Pelicula p, int numero) {
		p.agregarValoracion(this, numero);
		this.mirarPelicula(p);
	}

	public void mirarPelicula(Pelicula p) {
		for (User u : miembros)
			u.mirarPelicula(p);
	}

	
	public Iterator<String> getGenerosFavoritos() {  //Utiliza la estructura compuesta para generar un Iterator con los generos favoritos de los miembros del grupo
		HashSet<String> encontrados = new HashSet<>();
		for (User u : miembros) {

			Iterator<String> iteradorGeneros = u.getGenerosFavoritos();
			while (iteradorGeneros.hasNext()) {
				encontrados.add(iteradorGeneros.next());
			}
		}
		return encontrados.iterator();
	}

	public Iterator<Pelicula> getPeliculasVistas() { //Utiliza la estructura compuesta para generar un Iterator con las peliculas vistas de los miembros del grupo
		HashSet<Pelicula> vistas = new HashSet<>();
		for (User u : miembros) {

			Iterator<Pelicula> iteradorPeliculas = u.getPeliculasVistas();
			while (iteradorPeliculas.hasNext()) {
				vistas.add((Pelicula) iteradorPeliculas.next());
			}
		}
		return vistas.iterator();
	}
		
	public boolean vioPelicula(Pelicula p) {  //Pregunta si alguno de los miembros del grupo vio la pelicula
		Iterator<Pelicula> peliculas = this.getPeliculasVistas();
		while(peliculas.hasNext()) {
			if(peliculas.next().equals(p)) {
				return true;
			}
		}
		return false;
	}

}