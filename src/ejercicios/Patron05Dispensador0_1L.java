package ejercicios;

public class Patron05Dispensador0_1L implements Patron05Dispensador {

	@Override
	public void siguienteBotella(Patron05Dispensador leche1l) {

	}

	@Override
	public void servirLeche(double litros) {

		while (litros >= 0.1) {

			System.out.println("suministrado botellin 0.1Litro");
			litros = litros - (0.1);
		}

		if (litros > 0) {
			System.out.println("La cantidad de " + litros + " no puede ser suministrada, ha perdido dinero");
		} else {
			System.out.println("suministro finalizado");
		}
	}

}
