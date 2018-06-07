package ejercicios;

public abstract class Patron04_Plantilla {

	public void productoFinal() {
		System.out.println(pelarPatata());
		System.out.println(cortarPatata());
		System.out.println(añadirElementos());
		System.out.println(freir());
		System.out.println(mezclarHuevo());
		System.out.println(cocinar());
	}

	public final String pelarPatata() {
		return "Se pelan las patatas";
	}

	public final String cortarPatata() {
		return "Se cortan las patatas";
	}

	public String añadirElementos() {
		return "No añadimos otros elementos";
	}

	public String freir() {
		return "Se frien los ingredientes";
	}

	public final String mezclarHuevo() {
		return "Se mezcla con huevo";
	}

	public String cocinar() {
		return "Cocinando 3 minutos";
	}

}
