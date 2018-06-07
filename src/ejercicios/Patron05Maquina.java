package ejercicios;

public class Patron05Maquina {

	private Patron05Dispensador dispensar;

	public Patron05Maquina() {
		this.dispensar = new Patron05Dispensador2L();
		Patron05Dispensador d1 = new Patron05Dispensador1L();
		Patron05Dispensador d01 = new Patron05Dispensador0_1L();
		this.dispensar.siguienteBotella(d1);
		d1.siguienteBotella(d01);
	}

	public void ordeñarVaca(double litros) {
		this.dispensar.servirLeche(litros);
	}
}
