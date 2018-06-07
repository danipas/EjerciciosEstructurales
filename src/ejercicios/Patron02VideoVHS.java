package ejercicios;

public class Patron02VideoVHS {

	public Patron02CintaVHS cinta;

	public void setCinta(Patron02CintaVHS c1) {
		this.cinta = c1;
	}

	public void reproducirCinta() {
		this.cinta.reproducirVHS();
	}
}
