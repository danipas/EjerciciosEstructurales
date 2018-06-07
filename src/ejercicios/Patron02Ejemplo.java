package ejercicios;

public class Patron02Ejemplo {
	// otro
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patron02VideoVHS v1 = new Patron02VideoVHS();

		// Patron02_CintaVHS cv1 = new Patron02_CintaVHS();

		Patron02CintaBETA cb1 = new Patron02CintaBETA();
		Patron02Adaptador a1 = new Patron02Adaptador();
		a1.setBeta(cb1);
		v1.setCinta(a1);
		v1.reproducirCinta();

	}

}
