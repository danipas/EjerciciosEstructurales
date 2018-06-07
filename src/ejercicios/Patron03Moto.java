package ejercicios;

public class Patron03Moto extends Patron03Vehiculo {

	public Patron03Moto(Patron03Motor mo) {
		super(mo);
	}
	public void queSoy() {
		System.out.println("soy una moto");
	}
}
