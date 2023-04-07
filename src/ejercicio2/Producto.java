package ejercicio2;

public abstract class Producto  {
	
	//Atributos
	private String nombre;
	private String fechaCaducidad;
	private int numeroLote;
	
	//Constructores
	public Producto() {
		this.nombre = "Sin nombre";
		this.fechaCaducidad = "Sin fecha";
		this.numeroLote = 9999;
	}
	
	public Producto(String nombre, String fecha, int numero) {
		this.nombre = nombre;
		this.fechaCaducidad = fecha;
		this.numeroLote = numero;
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	@Override
	public String toString() {
		return "El producto "+ getNombre() +" tiene fecha de caducidad: " + getFechaCaducidad() + ", Numero de lote: " + getNumeroLote() + ".";
	}





	
	
	
	

}
