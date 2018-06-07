package ejercicios;

public class Patron05Dispensador1L implements Patron05Dispensador {

	private Patron05Dispensador siguiente01L;

	@Override
	public void siguienteBotella(Patron05Dispensador leche01L) {
		this.siguiente01L = leche01L;
	}

	@Override
	public void servirLeche(double litros) {

		while (litros >= 1) {

			System.out.println("Botella de 1Litro");
			litros = litros - 1;
		}

		if (litros != 0) {
			this.siguiente01L.servirLeche(litros);
		} else {
			System.out.println("suministro finalizado");
		}
	}

}
