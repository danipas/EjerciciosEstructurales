package ejercicios;

public class Patron04_Servir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patron04_Plantilla p = new Patron04_TortillaNormal();
		p.productoFinal();
		System.out.println();
		p = new Patron04_TortillaCebolla();
		p.productoFinal();
		System.out.println();
		p = new Patron04_TortillaSuda();
		p.productoFinal();
	}

}
