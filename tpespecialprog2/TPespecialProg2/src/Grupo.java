import java.util.ArrayList;

public class Grupo extends User {
	ArrayList<User> miembros;

	public void puntuarPelicula(Pelicula p, int x) {
		p.agregarPuntuacionGrupo(x);
	}
	
	public ArrayList<String> getGenerosFavoritos(){
		ArrayList<String> aux=new ArrayList<String>();
		for(int i=0;i<miembros.size();i++) {
			ArrayList<String> aux2=miembros.get(i).getGenerosFavoritos();
			for(int j=0;j<aux2.size();j++) {
				if(!aux.contains(aux2.get(j))) {
					aux.add(aux2.get(j));
				}
			}
			
		}
		
		return aux;
		
		}
	}
