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
	
	//MÉTODO toString
	@Override
	public String toString(){
	     return "El ID del profesor es "+getId() + ", Se llama "+getNombre() + ", tiene "+getEdad() + " años, su cargo es "+getCargo()+ " y su antiguedad es de "+getAntiguedadDocente() +  " años.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}
	
	
	
}
