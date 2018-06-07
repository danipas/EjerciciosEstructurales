package ejercicios;

public class Patron05_Dispensador2L implements Patron05_Dispensador {

	private Patron05_Dispensador siguiente1L;

	@Override
	public void siguienteBotella(Patron05_Dispensador leche1L) {
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
