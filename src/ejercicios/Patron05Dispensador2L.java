package ejercicios;

public class Patron05Dispensador2L implements Patron05Dispensador {

	private Patron05Dispensador siguiente1L;

	@Override
	public void siguienteBotella(Patron05Dispensador leche1L) {
		this.siguiente1L = leche1L;
	}

	@Override
	public void servirLeche(double litros) {

		while (litros >= 2) {
			System.out.println("Botella de 2Litros");
			litros = litros - 2;
			System.out.println(litros);
		}
		if (litros != 0) {
			this.siguiente1L.servirLeche(litros);
		} else {
			System.out.println("suministro finalizado");
		}
	}

}
