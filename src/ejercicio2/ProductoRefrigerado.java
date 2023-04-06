package ejercicio2;

public class ProductoRefrigerado extends Producto {
	//Atributos
	private String codigoOrganismo;
	
	//Constructores
	public ProductoRefrigerado() {
		super();
		this.codigoOrganismo = "Sin codigo";
	}
	
	public ProductoRefrigerado(String nombre, String fechacaducidad, int numero, String codigo) {
		super(nombre, fechacaducidad, numero);
		this.codigoOrganismo = codigo;
	}
	
	//Getters y setters
	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}
	
	@Override
	public String toString() {
		return "El producto refrigerado " + getNombre() + " tiene codigo de organismo: " + getCodigoOrganismo() + ", su fecha de caducidad es: " + getFechaCaducidad() + ", su numero de lote es: " + getNumeroLote() + ".";
	}
}
