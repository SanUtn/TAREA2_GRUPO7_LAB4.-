package ejercicio3;

public class Oficina extends Edificio {
	
	private int cantOfi;
	
	public Oficina(){
		super();
	    cantOfi = 0;
	}
  
	public Oficina(int cantOfi, double superficie){
		super(superficie);
		this.cantOfi= cantOfi;
	}

	public int getCantOfi() {
		return cantOfi;
	}

	public void setCantOfi(int cantOfi) {
		this.cantOfi = cantOfi;
	}

	@Override
	public String toString() {
		return "Tiene una cantidad de oficinas igual a: " + cantOfi;
	}
	
	
}
