package ejercicio2Adapter;

public class Adaptador implements CintaVHS {

	private CintaBETA beta;

	public void setBeta(CintaBETA cinta) {
		this.beta = cinta;
	}

	@Override
	public void reproducirVHS() {
		this.beta.reproducirContenido();
		
	}


}
