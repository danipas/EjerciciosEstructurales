package ejercicios;

public class Patron04Servir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patron04Plantilla p = new Patron04TortillaNormal();
		p.productoFinal();
		System.out.println();
		p = new Patron04TortillaCebolla();
		p.productoFinal();
		System.out.println();
		p = new Patron04TortillaSuda();
		p.productoFinal();
	}

}
