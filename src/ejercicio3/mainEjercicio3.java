package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {
	
	public static void main(String[] args) {
		
	ArrayList <Edificio> listaEdificios = new ArrayList <Edificio>();
	Polideportivo p1 = new Polideportivo();
	Polideportivo p2 = new Polideportivo();
	Polideportivo p3 = new Polideportivo();

	Oficina o1 = new Oficina();
	Oficina o2 = new Oficina();
	
	listaEdificios.add(p1);
	listaEdificios.add(p2);
	listaEdificios.add(p3);

	listaEdificios.add(o1);
	listaEdificios.add(o2);
	
	System.out.println("Listado de edificios listITERATOR: ");
	ListIterator <Edificio>it = listaEdificios.listIterator();

	while(it.hasNext()) {//pregunto si hay siguiente para recorrer
	Edificio e = it.next();//guardo el elemento actual que esta recorriendo.
	System.out.println(e.toString());
	}


	}
}
