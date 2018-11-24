package tpeprog2;

import java.util.ArrayList;
import java.util.Iterator;

public class Persona extends User {
	private int edad;
	private ArrayList<String> generosFavoritos;
	private ArrayList<Pelicula> peliculasVistas;

	public Persona(String nombre, int edad) {
		super(nombre);
		this.edad = edad;
		this.generosFavoritos = new ArrayList<String>();
		this.peliculasVistas = new ArrayList<Pelicula>();
	}
	
	public int getEdad() {
		return edad;
	}

	public void puntuarPelicula(Pelicula p, int x) {
		p.agregarValoracion(this, x);
		this.mirarPelicula(p);
	}

	public Iterator<String> getGenerosFavoritos() {
		return generosFavoritos.iterator();
	}

	public Iterator<Pelicula> getPeliculasVistas() {
		return peliculasVistas.iterator();
	}

	public void mirarPelicula(Pelicula p) {
		if (!peliculasVistas.contains(p)) {
			peliculasVistas.add(p);
		}
	}

	public void añadirGenero(String genero) {
		genero = genero.toLowerCase();
		generosFavoritos.add(genero);
	}
	
	public boolean vioPelicula(Pelicula p) {
		return peliculasVistas.contains(p);
	}

}