package ejercicio2;

public class ProductoCongelado extends Producto{
	
	//Atributos
	private int temperaturaCongelacion;
	
	//Constructores
	public ProductoCongelado() {
		super();
		this.temperaturaCongelacion = 9999;
	}
	
	public ProductoCongelado(String nombre, String fechacaducidad, int numero, int congelacion) {
		super(nombre, fechacaducidad, numero);
		this.temperaturaCongelacion = congelacion;
	}

	//Getters y setters
	public int getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setTemperaturaCongelacion(int temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}
	
	@Override
	public String toString() {
		return "El producto congelado " + getNombre() + " tiene una temperatura de congelacion de:" + getTemperaturaCongelacion() + ", su fecha de caducidad es: " + getFechaCaducidad() + ", su numero de lote es: " + getNumeroLote() + ".";
	}
	
}
