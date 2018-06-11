package ejercicio5Cadena;

public class Maquina {

	private Dispensador dispensar;

	public Maquina() {
		this.dispensar = new Dispensador2L();
		Dispensador d1 = new Dispensador1L();
		Dispensador d01 = new Dispensador0_1L();
		this.dispensar.siguienteBotella(d1);
		d1.siguienteBotella(d01);
	}

	public void ordeñarVaca(double litros) {
		this.dispensar.servirLeche(litros);
	}
}
