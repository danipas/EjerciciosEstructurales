package ejercicios;

public class Patron02_VideoVHS extends Patron02_CintaVHS {
	public Patron02_CintaVHS cinta;
	
	public void reproducirCinta() {
		this.cinta.reproducirVHS();
	}
}
