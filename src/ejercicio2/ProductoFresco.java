package ejercicio2;

public class ProductoFresco extends Producto {

	//Atributos
	private String fechaEnvasado;
	private String paisOrigen;
	
	//Constructores
	public ProductoFresco() {
		super();
		this.fechaEnvasado = "Sin fecha";
		this.paisOrigen = "Sin pais";
	}
	
	public ProductoFresco(String nombre, String fechacaducidad, int numero, String fechaenvasado, String pais) {
		super(nombre, fechacaducidad, numero);
		this.fechaEnvasado = fechaenvasado;
		this.paisOrigen = pais;
	}
	
	
	//Getters y setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "El producto fresco " + getNombre() + " tiene fecha de envasado: " + getFechaEnvasado() + ", su pais de origen es: " + getPaisOrigen()  + ", su fecha de caducidad es: " + getFechaCaducidad() + ", su numero de lote es: " + getNumeroLote() + ".";
	}
	
	
	
	
}
