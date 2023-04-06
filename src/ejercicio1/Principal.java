package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor p1 = new Profesor("Jorge",30, "Matematicas", 5);
		
		Profesor p2 = new Profesor("Jorge",30, "Matematicas", 5);
		
		if(p1.equals(p2)) {
			System.out.println("Es el mismo profesor.");
		}else {
			System.out.println("No es el mismo profesor.");
		}
	}

}
