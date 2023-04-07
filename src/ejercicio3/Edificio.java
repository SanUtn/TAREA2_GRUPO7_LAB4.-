package ejercicio3;

public class Edificio {

	//ATRIBUTOS
	private double superficie;
	
	//CONSTRUCTORES	
	Edificio(){
		
	}
	
	Edificio(double superficie){
		this.superficie=superficie;
	}

	//GETTERS Y SETTERS
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	public double getSuperficieEdificio() {
		return superficie;
	}

	//METODO TOSTRING
	@Override
	public String toString() {
		return "El Edificio tiene una superficie de " + superficie + " metros cuadrados";
	}
}
