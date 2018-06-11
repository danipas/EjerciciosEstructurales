package ejercicio5Cadena;

public class Dispensador0_1L implements Dispensador {

	@Override
	public void siguienteBotella(Dispensador leche1l) {

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
