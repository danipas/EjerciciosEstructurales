package ejercicios;

public abstract class Patron03Vehiculo {

	protected Patron03Motor m;

	public Patron03Vehiculo(Patron03Motor mo) {
		this.m = mo;
	}
	public abstract void queSoy();

}
