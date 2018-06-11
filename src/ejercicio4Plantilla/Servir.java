package ejercicio4Plantilla;

public class Servir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plantilla p = new TortillaNormal();
		p.productoFinal();
		System.out.println();
		p = new TortillaCebolla();
		p.productoFinal();
		System.out.println();
		p = new TortillaSuda();
		p.productoFinal();
	}

}
