package ejercicio2Adapter;

public class Ejemplo {
	// otroer
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VideoVHS v1 = new VideoVHS();

		// Patron02_CintaVHS cv1 = new Patron02_CintaVHS();

		CintaBETA cb1 = new CintaBETA();
		Adaptador a1 = new Adaptador();
		a1.setBeta(cb1);
		v1.setCinta(a1);
		v1.reproducirCinta();

	}

}
