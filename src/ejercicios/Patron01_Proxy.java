package ejercicios;

public class Patron01_Proxy {

	public int numeroAleatorio(int min, int max) {
		int numero;

		numero = (int) Math.floor(Math.random() * (max - min + 1) + min);

		return numero;
	}
}
