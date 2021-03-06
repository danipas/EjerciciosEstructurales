package ejercicio4Plantilla;

public abstract class Plantilla {

	public final void productoFinal() {
		System.out.println(pelarPatata());
		System.out.println(cortarPatata());
		System.out.println(aņadirElementos());
		System.out.println(freir());
		System.out.println(mezclarHuevo());
		System.out.println(cocinar());
	}

	public String pelarPatata() {
		return "Se pelan las patatas";
	}

	public String cortarPatata() {
		return "Se cortan las patatas";
	}

	public String aņadirElementos() {
		return "No aņadimos otros elementos";
	}

	public String freir() {
		return "Se frien los ingredientes";
	}

	public String mezclarHuevo() {
		return "Se mezcla con huevo";
	}

	public String cocinar() {
		return "Cocinando 3 minutos";
	}

}
