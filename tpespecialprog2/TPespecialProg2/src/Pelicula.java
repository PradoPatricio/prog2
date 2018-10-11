import java.util.ArrayList;

public class Pelicula {

	private String titulo;
	private String sinopsis;
	private int duracion;
	private int año;
	ArrayList<String> categorias;
	ArrayList<String> directores;
	ArrayList<String> protagonistas;
	ArrayList<Integer> valoracionesUsuarios;
	ArrayList<Integer> valoracionesGrupos;

	public void agregarPuntuacionGrupo(int x) {
		valoracionesGrupos.add(x);
	}

	public void agregarPuntuacionPersonal(int x) {
		valoracionesUsuarios.add(x);

	}

	public double calcularPromedio() {
		double aux = 0;
		for (int i = 0; i < valoracionesUsuarios.size(); i++) {
			aux += valoracionesUsuarios.get(i);
		}
		for (int i = 0; i < valoracionesGrupos.size(); i++) {
			aux += valoracionesGrupos.get(i);
		}
		return aux / (valoracionesUsuarios.size() + valoracionesGrupos.size());
	}

}
