package ejercicio1;

public class Profesor extends Empleado {
	
	//ATRIBUTOS
	private String cargo;
	private int antiguedadDocente;
	
	
	//CONSTRUCTORES
	public Profesor() {
		super();
		this.cargo = "sin cargo";
		this.antiguedadDocente = 0;
	}
	
	public Profesor ( String nombre, int edad, String cargo, int antiguedadDocente ) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//GETTERS Y SETTERS
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	
	
}
