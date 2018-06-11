package ejercicio3Puente;

public abstract class Vehiculo {

	protected Motor m;

	public Motor getM() {
		return this.m;
	}

	public void setM(Motor _m) {
		this.m = _m;
	}

	public abstract void queSoy();

}
