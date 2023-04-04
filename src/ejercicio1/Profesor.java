package ejercicio1;

public class Profesor extends Empleado {
	
	//ATRIBUTOS
	private String cargo;
	private int antiguedadDocente;
	
	
	//CONSTRUCTORES
	public Profesor() {
		super();
	}
	
	public Profesor ( String cargo, int antiguedadDocente ) {
		super();
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
