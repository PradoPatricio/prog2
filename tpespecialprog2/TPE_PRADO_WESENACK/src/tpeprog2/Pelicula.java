package tpeprog2;

import java.util.ArrayList;
import java.util.HashMap;


public class Pelicula {

	private String titulo;
	private String sinopsis;
	private double duracion;
	private int a�o;
	ArrayList<String> generos;
	ArrayList<String> directores;
	ArrayList<String> protagonistas;
	HashMap<User, Integer> valoraciones;

	public Pelicula(String titulo, String sinopsis, double duracion, int a�o) {
		this.generos = new ArrayList<String>();
		this.directores = new ArrayList<String>();
		this.protagonistas = new ArrayList<String>();
		this.valoraciones = new HashMap<User, Integer>();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.duracion = duracion;
		this.a�o = a�o;
	}

	public Pelicula(String titulo, double duracion, int a�o) {

		this.titulo = titulo;
		this.duracion = duracion;
		this.a�o = a�o;
		this.generos = new ArrayList<String>();
		this.directores = new ArrayList<String>();
		this.protagonistas = new ArrayList<String>();
		this.valoraciones = new HashMap<User, Integer>();
	}

	public void a�adirProtagonista(String protagonista) {
		protagonista = protagonista.toLowerCase();
		if (!protagonistas.contains(protagonista)) {
			protagonistas.add(protagonista);
		}
	}

	public void a�adirDirector(String director) {
		director = director.toLowerCase();
		if (!directores.contains(director)) {
			directores.add(director);
		}
	}

	public void a�adirGenero(String genero) {
		genero = genero.toLowerCase();
		if (!generos.contains(genero)) {
			generos.add(genero);
		}
	}

	public void agregarValoracion(User u, int numero) {
		valoraciones.put(u, numero);

	}

	public String getTitulo() {
		return titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public double getDuracion() {
		return duracion;
	}

	public int getA�o() {
		return a�o;
	}

	public boolean tieneProtagonista(String protagonista) {
		return protagonistas.contains(protagonista);
	}

	public boolean tieneDirector(String director) {
		return directores.contains(director);
	}

	public boolean tieneGenero(String genero) {
		return generos.contains(genero);
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", a�o=" + a�o + " Puntaje promedio: "
				+ this.calcularPromedio() + " Veces vista: " + this.calcularPopularidad() + "]";
	}

	public double calcularPromedio() {
		double suma = 0;
		for (User u : valoraciones.keySet()) {
			suma += valoraciones.get(u);
		}
		if (suma != 0) {

			return suma / valoraciones.size();

		} else {
			return 0;
		}
	}

	public int calcularPopularidad() {
		return valoraciones.size();
	}
	
	public boolean equals(Object p) {
		if (this.titulo.equals(((Pelicula) p).getTitulo())) {
			return true;
		} else {
			return false;
		}
	}

}