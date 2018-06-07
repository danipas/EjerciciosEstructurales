package ejercicios;

public class Patron05_Maquina {

	private Patron05_Dispensador dispensar;

	public Patron05_Maquina() {
		this.dispensar = new Patron05_Dispensador2L();
		Patron05_Dispensador d1 = new Patron05_Dispensador1L();
		Patron05_Dispensador d01 = new Patron05_Dispensador0_1L();
		this.dispensar.siguienteBotella(d1);
		d1.siguienteBotella(d01);
	}

	public void ordeñarVaca(double litros) {
		this.dispensar.servirLeche(litros);
	}
}
