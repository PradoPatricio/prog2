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

		lisa.a�adirGenero("Romantico");
		lisa.a�adirGenero("Musical");
		lisa.a�adirGenero("Infantil");
		lisa.a�adirGenero("Aventura");

		bart.a�adirGenero("Accion");
		bart.a�adirGenero("Musical");
		bart.a�adirGenero("Infantil");
		bart.a�adirGenero("Aventura");

		homero.a�adirGenero("Accion");
		homero.a�adirGenero("Musical");
		homero.a�adirGenero("Infantil");

		marge.a�adirGenero("Romantico");
		marge.a�adirGenero("Musical");
		marge.a�adirGenero("Infantil");
		marge.a�adirGenero("Aventura");

		maggie.a�adirGenero("Musical");
		maggie.a�adirGenero("Infantil");
		maggie.a�adirGenero("Aventura");

		cinema.a�adirUsuario(lisa);
		cinema.a�adirUsuario(marge);
		cinema.a�adirUsuario(homero);
		cinema.a�adirUsuario(bart);
		cinema.a�adirUsuario(maggie);

		Grupo hombresSimpson = new Grupo("Hombres simpson");
		Grupo hermanosSimpson = new Grupo("Hermanos simpson");
		Grupo familiaSimpson = new Grupo("Familia Simpson");

		hombresSimpson.a�adirMiembro(bart);
		hombresSimpson.a�adirMiembro(homero);

		hermanosSimpson.a�adirMiembro(bart);
		hermanosSimpson.a�adirMiembro(lisa);
		hermanosSimpson.a�adirMiembro(maggie);

		familiaSimpson.a�adirMiembro(hermanosSimpson);
		familiaSimpson.a�adirMiembro(marge);
		familiaSimpson.a�adirMiembro(homero);

		cinema.a�adirUsuario(hermanosSimpson);
		cinema.a�adirUsuario(hombresSimpson);
		cinema.a�adirUsuario(familiaSimpson);

		Pelicula Up = new Pelicula("Up: una aventura de altura", 120, 2009);
		Up.a�adirDirector("Pete Docter");
		Up.a�adirDirector("Bob Peterson");
		Up.a�adirProtagonista("Pete Docter");
		Up.a�adirProtagonista("Ed Asner");
		Up.a�adirProtagonista("Bob Peterson");
		Up.a�adirProtagonista("Jordan Nagai");
		Up.a�adirGenero("Infantil");
		Up.a�adirGenero("Accion");
		Up.a�adirGenero("Drama");

		Pelicula LosSimpson = new Pelicula("Los Simpson: la pel�cula", 110, 2007);
		LosSimpson.a�adirGenero("Romantico");
		LosSimpson.a�adirGenero("Musical");
		LosSimpson.a�adirGenero("Infantil");
		LosSimpson.a�adirGenero("Aventura");
		LosSimpson.a�adirGenero("Comedia");
		LosSimpson.a�adirGenero("Accion");
		LosSimpson.a�adirDirector("David Silverman");
		LosSimpson.a�adirProtagonista("Dan Castellaneta");
		LosSimpson.a�adirProtagonista("Harry Shearer");
		LosSimpson.a�adirProtagonista("Julie Kavner");

		Pelicula LosIncreibles = new Pelicula("Los Increibles", 125, 2004);
		LosIncreibles.a�adirDirector("Brad Bird");
		LosIncreibles.a�adirGenero("Musical");
		LosIncreibles.a�adirGenero("Infantil");
		LosIncreibles.a�adirGenero("Aventura");
		LosIncreibles.a�adirGenero("Accion");
		LosIncreibles.a�adirProtagonista("Brad Bird");
		LosIncreibles.a�adirProtagonista("Craig T. Nelson");
		LosIncreibles.a�adirProtagonista("Holly Hunter");

		Pelicula LosIncreibles2 = new Pelicula("Los Increibles 2", 125, 2018);
		LosIncreibles2.a�adirDirector("Brad Bird");
		LosIncreibles2.a�adirGenero("Musical");
		LosIncreibles2.a�adirGenero("Infantil");
		LosIncreibles2.a�adirGenero("Aventura");
		LosIncreibles2.a�adirGenero("Accion");
		LosIncreibles2.a�adirProtagonista("Brad Bird");
		LosIncreibles2.a�adirProtagonista("Craig T. Nelson");
		LosIncreibles2.a�adirProtagonista("Holly Hunter");

		Pelicula ToyStory = new Pelicula("Toy Story", 125, 1995);
		ToyStory.a�adirDirector("John Lasseter");
		ToyStory.a�adirGenero("Infantil");
		ToyStory.a�adirGenero("Aventura");
		ToyStory.a�adirGenero("Accion");
		ToyStory.a�adirProtagonista("Tim Allen");
		ToyStory.a�adirProtagonista("Tom Hanks");
		ToyStory.a�adirProtagonista("Don Rickles");
		ToyStory.a�adirProtagonista("Wallace Shawn");

		Pelicula Monsters = new Pelicula("Monsters Inc.", 125, 2001);
		Monsters.a�adirDirector("Pete Docter");
		Monsters.a�adirGenero("Musical");
		Monsters.a�adirGenero("Infantil");
		Monsters.a�adirGenero("Aventura");
		Monsters.a�adirGenero("Accion");
		Monsters.a�adirProtagonista("John Goodman");
		Monsters.a�adirProtagonista("Billy Crystal");
		Monsters.a�adirProtagonista("John Ratzenberger");

		cinema.a�adirPelicula(Up);
		cinema.a�adirPelicula(LosSimpson);
		cinema.a�adirPelicula(LosIncreibles);
		cinema.a�adirPelicula(LosIncreibles2);
		cinema.a�adirPelicula(ToyStory);
		cinema.a�adirPelicula(Monsters);

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
		mostrarPeliculasA�o(2000, cinema);
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
	
	public static void mostrarPeliculasA�o(int a�o, Cine cinema) {
		Iterator<Pelicula> b = cinema.BuscarPelicula(new CondicionPosterior(a�o));
		System.out.println("Peliculas estrenada a partir del a�o "+a�o+"\n");
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
