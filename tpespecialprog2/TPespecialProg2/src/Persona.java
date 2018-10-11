import java.util.ArrayList;

public class Persona extends User {
	private int edad;

	public void puntuarPelicula(Pelicula p, int x) {
		p.agregarPuntuacionPersonal(x);
	}
	public ArrayList<String> getGenerosFavoritos(){
		ArrayList<String> aux=new ArrayList<String>();
		for(int i=0;i<generosPreferidos.size();i++) {
			aux.add(generosPreferidos.get(i));			
		}
		return generosPreferidos;
}
}
