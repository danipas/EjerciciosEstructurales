package ejercicios;

import java.util.ArrayList;

public class Patron06Almacen {
	ArrayList<String> cadenas = new ArrayList<String>();

	public void a�adir(String texto) {

		this.cadenas.add(texto);
	}

	public void eliminar(String texto) {

		System.out.println(this.cadenas.remove(texto));
	}

}
