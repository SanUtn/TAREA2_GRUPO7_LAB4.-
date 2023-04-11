package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {
	
	public static void main(String[] args) {
		
		//CREO UN ARRAYLIST, LOS OBJETOS, Y LOS AGREGO AL ARRAYLIST
		ArrayList <Edificio> listaEdificios = new ArrayList <Edificio>();
		Polideportivo p1 = new Polideportivo(80, "Centro", 3);
		Polideportivo p2 = new Polideportivo(120,"Rio",2);
		Polideportivo p3 = new Polideportivo(220, "Industrial",4);
	
		Oficina o1 = new Oficina(45, 3);
		Oficina o2 = new Oficina();
		
		listaEdificios.add(p1);
		listaEdificios.add(p2);
		listaEdificios.add(p3);
	
		listaEdificios.add(o1);
		listaEdificios.add(o2);
		
		
		//IMPRIMO POR CONSOLA EL CONTENIDO DEL ARRAYLIST
		System.out.println("Listado de edificios listITERATOR: ");
		ListIterator <Edificio>it = listaEdificios.listIterator();
	
		while(it.hasNext()) {//pregunto si hay siguiente para recorrer
			Edificio e = it.next();//guardo el elemento actual que esta recorriendo.
			System.out.println(e.toString());
		}
	}
}
