import java.util.ArrayList;

public abstract class User {
	private String nombre;
	protected ArrayList<String> generosPreferidos;
	ArrayList<Pelicula> peliculasVistas;
	
	public abstract void puntuarPelicula(Pelicula p, int x);
	
	public abstract ArrayList<String> getGenerosFavoritos();
}

