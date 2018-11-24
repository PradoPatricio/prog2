package tpeprog2;

public class CondicionProtagonista extends Condicion {

	private String protagonista;

	public CondicionProtagonista(String protagonista) {
		this.protagonista = protagonista.toLowerCase();
	}

	public boolean seCumple(Pelicula p) {
		return p.tieneProtagonista(protagonista);
	}
}
