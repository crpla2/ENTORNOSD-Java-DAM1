package builder;

public class Persona {
	

		private String nombre;
		private String dni;
		private int edad;
		//Para que no se cree el constructor por defecto
		private Persona() {
		}
		
		//
		
		Persona(PersonaBuilder builder) {
			this.nombre = builder.getNombre();
			if(builder.getDni() == null)
				throw new IllegalArgumentException("No se puede introducir una persona sin DNI"); // System.out.print("No se puede introducir una persona sin DNI");
			this.dni = builder.getDni();
			this.edad = builder.getEdad();
		}
		
		// 
		
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
		}
		
	}
	


