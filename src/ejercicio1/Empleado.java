package ejercicio1;

public class Empleado implements Comparable<Empleado> {
	
		
		//ATRIBUTOS DEL OBJETO
		private final int id;
		private String nombre;
		private int edad;

		//ATRIBUTOS DE LA CLASE
		private static int contLegajo = 1000;
		
		//CONSTRUCTORES
		public Empleado() {
			this.id = contLegajo++;
			this.nombre = "sin nombre";
			this.edad = 99;
		}
		
		public Empleado( String nombre, int edad ) {
			this.id = contLegajo++;
			this.nombre = nombre;
			this.edad = edad;
		}
		
		//METODOS ÉSTATICOS
		public static int devuelveProximoID() {

		 return contLegajo;

		}

		//GETTERS Y SETTERS 
		public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return this.edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getId() {
			return this.id;
		}

		//METODO TOSTRING()
		@Override
		public String toString() {
			return "El empleado " + nombre + " tiene " + edad + " años y su ID es el número " + id + ".";
		}

		@Override
		public int compareTo(Empleado o) {
			// Ordenamiento por ID de < a <
			if(o.id == this.id) {
				return 0;
			}
			if(o.id < this.id) {
				return -1;
			}
			return 1;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + edad;
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Empleado other = (Empleado) obj;
			if (edad != other.edad)
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}

		
		
}

