package ejercicios;

public class Patron02Adaptador implements Patron02CintaVHS {

	private Patron02CintaBETA beta;

	public void setBeta(Patron02CintaBETA cinta) {
		this.beta = cinta;
	}

	@Override
	public void reproducirVHS() {
		this.beta.reproducirContenido();
		
	}


}
