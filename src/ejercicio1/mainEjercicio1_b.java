package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		//CREAMOS LOS OBJETOS Y LES CARGAMOS DATOS
		Profesor prof1 = new Profesor();
		prof1.setNombre("Heriberto");
		prof1.setEdad(30);
		prof1.setCargo("Parra");
		prof1.setAntiguedadDocente(10);
		
		Profesor prof2 = new Profesor();
		prof2.setNombre("Diego");
		prof2.setEdad(41);
		prof2.setCargo("Rivero");
		prof2.setAntiguedadDocente(10);

		Profesor prof3 = new Profesor("Enzo", 20, "Hoyos", 2);
		Profesor prof4 = new Profesor("Diego", 28, "Perdomo", 6);
		Profesor prof5 = new Profesor("Rodrigo", 52, "Salinas", 20);
		
		//CREAMOS UNA COLECCIÓN PARA AGREGAR LOS OBJETOS CREADOS
		TreeSet<Profesor>  listadoProfesores = new TreeSet <Profesor>();
		
		//AGREGAMOS LOS OBJETOS A LA COLECCIÓN
		listadoProfesores.add(prof1);
		listadoProfesores.add(prof2);
		listadoProfesores.add(prof3);
		listadoProfesores.add(prof4);
		listadoProfesores.add(prof5);
		
		//CREAMOS UN INTERADOR PARA PODER RECORRER LA COLECCIÓN
		Iterator<Profesor> it = listadoProfesores.iterator();
		
		//RECORREMOS LA COLECCIÓN USANDO ITERATOR Y SE MUESTRA DE MAYOR A MENOR SEGUN I		
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
	}
}
