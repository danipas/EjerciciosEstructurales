package ejercicios;

import java.util.ArrayList;

public class Patron06_Almacen {
	ArrayList<String> cadenas = new ArrayList<String>();

	public void añadir(String texto) {

		this.cadenas.add(texto);
	}

	public void eliminar(String texto) {

		System.out.println(this.cadenas.remove(texto));
	}

}
