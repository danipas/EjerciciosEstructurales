package ejercicios;

public class Patron03Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patron03Motor m1 = new Patron03Motor();
		Patron03Coche c1 = new Patron03Coche(m1);

		c1.m.setTipo("opel");
		c1.queSoy();
		System.out.println("Con un motor" + c1.m.getTipo());


	}

}
