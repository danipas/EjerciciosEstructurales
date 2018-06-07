package ejercicios;

public class Patron03Coche extends Patron03Vehiculo {

	public Patron03Coche(Patron03Motor mo) {
		super(mo);
	}

	public void queSoy() {
		System.out.println("soy un coche");
	}
}
