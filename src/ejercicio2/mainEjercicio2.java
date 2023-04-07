package ejercicio2;

import java.util.ArrayList;
import java.util.ListIterator;



public class mainEjercicio2 {

	public static void main(String[] args) {
		
		ProductoFresco productoFresco = new ProductoFresco();
		productoFresco.setNombre("Huevos");
		productoFresco.setFechaCaducidad("05/05/2023");
		productoFresco.setNumeroLote(5);
		productoFresco.setFechaEnvasado("06/06/2023");
		productoFresco.setPaisOrigen("Argentina");
		
		ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("Leche","10/05/2023", 10, "1A");
		
		ProductoCongelado productoCongelado = new ProductoCongelado ("Helado", "12/06/2023", 8, 19);

		//creamos la lista de productos
		ArrayList <Producto> listaProductos = new ArrayList <Producto>();
		
		//agregamos los productos a la lista
		listaProductos.add(productoFresco);
		listaProductos.add(productoRefrigerado);
		listaProductos.add(productoCongelado);
		
		//los recorremos con iterator
		ListIterator <Producto> it = listaProductos.listIterator();
		
		while (it.hasNext()) {
			Producto p = it.next();
			System.out.println(p.toString());
		}
		
		
		
		
	}

}
