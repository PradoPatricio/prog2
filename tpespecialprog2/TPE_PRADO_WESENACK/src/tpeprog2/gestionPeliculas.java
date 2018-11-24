package tpeprog2;

import java.util.ArrayList;
import java.util.Iterator;

public class gestionPeliculas {

	public static void main(String[] args) {

		Cine cinema = new Cine(new SelectorTodosGeneros(), new ComparadorPopularidad());
		
		Persona lisa = new Persona("lisa", 8);
		Persona bart = new Persona("bart", 10);
		Persona homero = new Persona("homero", 39);
		Persona marge = new Persona("marge", 38);
		Persona maggie = new Persona("maggie", 1);

		lisa.añadirGenero("Romantico");
		lisa.añadirGenero("Musical");
		lisa.añadirGenero("Infantil");
		lisa.añadirGenero("Aventura");

		bart.añadirGenero("Accion");
		bart.añadirGenero("Musical");
		bart.añadirGenero("Infantil");
		bart.añadirGenero("Aventura");

		homero.añadirGenero("Accion");
		homero.añadirGenero("Musical");
		homero.añadirGenero("Infantil");

		marge.añadirGenero("Romantico");
		marge.añadirGenero("Musical");
		marge.añadirGenero("Infantil");
		marge.añadirGenero("Aventura");

		maggie.añadirGenero("Musical");
		maggie.añadirGenero("Infantil");
		maggie.añadirGenero("Aventura");

		cinema.añadirUsuario(lisa);
		cinema.añadirUsuario(marge);
		cinema.añadirUsuario(homero);
		cinema.añadirUsuario(bart);
		cinema.añadirUsuario(maggie);

		Grupo hombresSimpson = new Grupo("Hombres simpson");
		Grupo hermanosSimpson = new Grupo("Hermanos simpson");
		Grupo familiaSimpson = new Grupo("Familia Simpson");

		hombresSimpson.añadirMiembro(bart);
		hombresSimpson.añadirMiembro(homero);

		hermanosSimpson.añadirMiembro(bart);
		hermanosSimpson.añadirMiembro(lisa);
		hermanosSimpson.añadirMiembro(maggie);

		familiaSimpson.añadirMiembro(hermanosSimpson);
		familiaSimpson.añadirMiembro(marge);
		familiaSimpson.añadirMiembro(homero);

		cinema.añadirUsuario(hermanosSimpson);
		cinema.añadirUsuario(hombresSimpson);
		cinema.añadirUsuario(familiaSimpson);

		Pelicula Up = new Pelicula("Up: una aventura de altura", 120, 2009);
		Up.añadirDirector("Pete Docter");
		Up.añadirDirector("Bob Peterson");
		Up.añadirProtagonista("Pete Docter");
		Up.añadirProtagonista("Ed Asner");
		Up.añadirProtagonista("Bob Peterson");
		Up.añadirProtagonista("Jordan Nagai");
		Up.añadirGenero("Infantil");
		Up.añadirGenero("Accion");
		Up.añadirGenero("Drama");

		Pelicula LosSimpson = new Pelicula("Los Simpson: la película", 110, 2007);
		LosSimpson.añadirGenero("Romantico");
		LosSimpson.añadirGenero("Musical");
		LosSimpson.añadirGenero("Infantil");
		LosSimpson.añadirGenero("Aventura");
		LosSimpson.añadirGenero("Comedia");
		LosSimpson.añadirGenero("Accion");
		LosSimpson.añadirDirector("David Silverman");
		LosSimpson.añadirProtagonista("Dan Castellaneta");
		LosSimpson.añadirProtagonista("Harry Shearer");
		LosSimpson.añadirProtagonista("Julie Kavner");

		Pelicula LosIncreibles = new Pelicula("Los Increibles", 125, 2004);
		LosIncreibles.añadirDirector("Brad Bird");
		LosIncreibles.añadirGenero("Musical");
		LosIncreibles.añadirGenero("Infantil");
		LosIncreibles.añadirGenero("Aventura");
		LosIncreibles.añadirGenero("Accion");
		LosIncreibles.añadirProtagonista("Brad Bird");
		LosIncreibles.añadirProtagonista("Craig T. Nelson");
		LosIncreibles.añadirProtagonista("Holly Hunter");

		Pelicula LosIncreibles2 = new Pelicula("Los Increibles 2", 125, 2018);
		LosIncreibles2.añadirDirector("Brad Bird");
		LosIncreibles2.añadirGenero("Musical");
		LosIncreibles2.añadirGenero("Infantil");
		LosIncreibles2.añadirGenero("Aventura");
		LosIncreibles2.añadirGenero("Accion");
		LosIncreibles2.añadirProtagonista("Brad Bird");
		LosIncreibles2.añadirProtagonista("Craig T. Nelson");
		LosIncreibles2.añadirProtagonista("Holly Hunter");

		Pelicula ToyStory = new Pelicula("Toy Story", 125, 1995);
		ToyStory.añadirDirector("John Lasseter");
		ToyStory.añadirGenero("Infantil");
		ToyStory.añadirGenero("Aventura");
		ToyStory.añadirGenero("Accion");
		ToyStory.añadirProtagonista("Tim Allen");
		ToyStory.añadirProtagonista("Tom Hanks");
		ToyStory.añadirProtagonista("Don Rickles");
		ToyStory.añadirProtagonista("Wallace Shawn");

		Pelicula Monsters = new Pelicula("Monsters Inc.", 125, 2001);
		Monsters.añadirDirector("Pete Docter");
		Monsters.añadirGenero("Musical");
		Monsters.añadirGenero("Infantil");
		Monsters.añadirGenero("Aventura");
		Monsters.añadirGenero("Accion");
		Monsters.añadirProtagonista("John Goodman");
		Monsters.añadirProtagonista("Billy Crystal");
		Monsters.añadirProtagonista("John Ratzenberger");

		cinema.añadirPelicula(Up);
		cinema.añadirPelicula(LosSimpson);
		cinema.añadirPelicula(LosIncreibles);
		cinema.añadirPelicula(LosIncreibles2);
		cinema.añadirPelicula(ToyStory);
		cinema.añadirPelicula(Monsters);

		lisa.puntuarPelicula(LosIncreibles, 5);
		bart.puntuarPelicula(LosIncreibles, 2);
		homero.puntuarPelicula(LosIncreibles, 4);
		
		marge.puntuarPelicula(LosIncreibles, 2);
		marge.puntuarPelicula(LosIncreibles2, 5);
		
		maggie.puntuarPelicula(ToyStory, 1);
		
		
		System.out.println("1.\n");
		mostrarPeliculasVistas(marge);
		System.out.println("2.\n");
		mostrarPeliculasVistas(bart);
		System.out.println("3. Recomendaciones con todos los generos y ordenada por popularidad\n");
		recomenTodosGenerosXPopularidad(lisa, cinema, 2);
		recomenTodosGenerosXPopularidad(bart, cinema, 3);
		recomenTodosGenerosXPopularidad(homero, cinema, 2);
		recomenTodosGenerosXPopularidad(marge, cinema, 2);
		recomenTodosGenerosXPopularidad(maggie, cinema, 2);
		recomenTodosGenerosXPopularidad(hombresSimpson, cinema, 2);
		recomenTodosGenerosXPopularidad(hermanosSimpson, cinema, 2);
		recomenTodosGenerosXPopularidad(familiaSimpson, cinema, 2);
		System.out.println("4. Recomendaciones con algun genero y ordenada por promedio\n");
		recomenAlgunGeneroXPromedio(lisa, cinema, 5);
		recomenAlgunGeneroXPromedio(bart, cinema, 5);
		recomenAlgunGeneroXPromedio(homero, cinema, 5);
		recomenAlgunGeneroXPromedio(marge, cinema, 5);
		recomenAlgunGeneroXPromedio(maggie, cinema, 5);
		recomenAlgunGeneroXPromedio(hombresSimpson, cinema, 5);
		recomenAlgunGeneroXPromedio(hermanosSimpson, cinema, 5);
		recomenAlgunGeneroXPromedio(familiaSimpson, cinema, 5);
		System.out.println("5. Hermanos Simpson Puntuan up con 4 granos de cafe\n");
		hermanosSimpson.puntuarPelicula(Up, 4);
		System.out.println("6.\n");
		System.out.println("repeticion punto 2.\n");
		mostrarPeliculasVistas(bart);
		System.out.println("repeticion punto 3. Recomendaciones con todos los generos y ordenada por popularidad\n");
		recomenTodosGenerosXPopularidad(lisa, cinema, 2);
		recomenTodosGenerosXPopularidad(bart, cinema, 3);
		recomenTodosGenerosXPopularidad(homero, cinema, 2);
		recomenTodosGenerosXPopularidad(marge, cinema, 2);
		recomenTodosGenerosXPopularidad(maggie, cinema, 2);
		recomenTodosGenerosXPopularidad(hombresSimpson, cinema, 2);
		recomenTodosGenerosXPopularidad(hermanosSimpson, cinema, 2);
		recomenTodosGenerosXPopularidad(familiaSimpson, cinema, 2);
		System.out.println("repeticion punto 4. Recomendaciones con algun genero y ordenada por promedio\n");
		recomenAlgunGeneroXPromedio(lisa, cinema, 5);
		recomenAlgunGeneroXPromedio(bart, cinema, 5);
		recomenAlgunGeneroXPromedio(homero, cinema, 5);
		recomenAlgunGeneroXPromedio(marge, cinema, 5);
		recomenAlgunGeneroXPromedio(maggie, cinema, 5);
		recomenAlgunGeneroXPromedio(hombresSimpson, cinema, 5);
		recomenAlgunGeneroXPromedio(hermanosSimpson, cinema, 5);
		recomenAlgunGeneroXPromedio(familiaSimpson, cinema, 5);
		
		System.out.println("7.\n");
		System.out.println("a.\n");
		mostrarPeliculasActorYDirector("Pete Docter", cinema);
		System.out.println("b.\n");
		mostrarPeliculasActor("Tom Hanks", cinema);
		System.out.println("c.\n");
		mostrarPeliculasAño(2000, cinema);
		System.out.println("d.\n");
		mostrarPeliculasGeneros("Romantico", "Comedia", "Drama", cinema);
		
	}
	
	public static void mostrarPeliculasGeneros(String genero1, String genero2, String genero3, Cine cinema) {
		Iterator<Pelicula> b = cinema.BuscarPelicula(new CondicionOr(new CondicionOr(new CondicionGenero(genero1), new CondicionGenero(genero2)), new CondicionGenero(genero3)));
		System.out.println("Peliculas de "+genero1+", "+genero2+", o "+genero3+"\n");
		while (b.hasNext()) {
			System.out.println(b.next().toString());
		}
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------ \n");
	}
	
	public static void mostrarPeliculasAño(int año, Cine cinema) {
		Iterator<Pelicula> b = cinema.BuscarPelicula(new CondicionPosterior(año));
		System.out.println("Peliculas estrenada a partir del año "+año+"\n");
		while (b.hasNext()) {
			System.out.println(b.next().toString());
		}
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------ \n");
	}
	
	public static void mostrarPeliculasActor(String persona, Cine cinema) {
		Iterator<Pelicula> b = cinema.BuscarPelicula(new CondicionProtagonista(persona));
		System.out.println("Peliculas de "+persona+" como actor \n");
		while (b.hasNext()) {
			System.out.println(b.next().toString());
		}
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------ \n");
	}
	
	public static void mostrarPeliculasActorYDirector(String persona, Cine cinema) {
		Iterator<Pelicula> b = cinema.BuscarPelicula(new CondicionAnd(new CondicionDirector(persona), new CondicionProtagonista(persona)));
		System.out.println("Peliculas de "+persona+" actuando y dirigiendo \n");
		while (b.hasNext()) {
			System.out.println(b.next().toString());
		}
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------ \n");
	}
	
	public static void recomenTodosGenerosXPopularidad(User usuario, Cine cinema, int numero) {
		Iterator<Pelicula> recom = cinema.Recomendar(usuario, numero);
		System.out.println("Recomendaciones para: "+usuario.getNombre()+"\n");
		while (recom.hasNext()) {
			System.out.println(recom.next().toString());
		}
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------ \n");
	}
	
	public static void recomenAlgunGeneroXPromedio(User usuario, Cine cinema, int numero) {
		Iterator<Pelicula> recom = cinema.Recomendar(usuario, numero, new SelectorAlgunGenero(), new ComparadorPromedio());
		System.out.println("Recomendaciones para: "+usuario.getNombre()+"\n");
		while (recom.hasNext()) {
			System.out.println(recom.next().toString());
		}
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------ \n");
	}

	public static void mostrarPeliculasVistas(User usuario) {
		Iterator<Pelicula> peliculas = usuario.getPeliculasVistas();
		System.out.println("Peliculas vistas por "+usuario.getNombre()+"\n");
		while (peliculas.hasNext()) {
			System.out.println(peliculas.next().toString());
		}
		System.out.println("\n");
		System.out.println("------------------------------------------------------------------------------------------------------------ \n");
	}
}
