package ejercicio3Puente;

public class Ejemplo {
	// cambio en vehiculo, ahora no tiene constructor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor m1 = new MotorCoche("opel");
		Coche coche = new Coche();

		coche.setM(m1);
		coche.queSoy();
		System.out.println("Con un motor " + coche.getM().getTipo());

		Motor m2 = new MotorMoto("Yamaha");
		Moto moto = new Moto();

		moto.setM(m2);
		moto.queSoy();
		System.out.println("Con un motor " + moto.getM().getTipo());


	}

}
