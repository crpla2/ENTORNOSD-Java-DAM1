package builder;

public class Pasos_a_seguir {
	/*
	BUILDER

	1�) Creamos la Clase "Persona" con:
		- atributos corresponientes
		- contructor vacio PRIVATE
		- toString.

	2�) Creamos la Clase "PersonaBuilder" con:
		- los mismos atributos que la Clase "Persona"
		- SOLO con sus getters
		- constructor para cada atributo (ej)
					
				public PersonaBuilder nombre(String nombre) {
						this.nombre = nombre;
						return this;
				}
				
		- crear el build() de la siguiente manera:
		
				public Persona build() {
					return new Persona(this);
				}
				
	3�) Ahora volvemos a la Clase "Persona" y creamos el m�todo constructor.

		- CASO 1. No ponemos ning�n tipo de restricci�n
				Persona(PersonaBuilder builder) {
					this.nombre = builder.getNombre();
					this.dni = builder.getDni();
					this.edad = builder.getEdad();
				}
				
		- CASO 2. Ponemos restricci�n de que si el DNI es null, no se puede crear el objeto 
				Persona(PersonaBuilder builder) {
					this.nombre = builder.getNombre();
					if(builder.getDni() == null)
						throw new IllegalArgumentException("No se puede introducir una persona sin DNI"); // System.out.print("No se puede introducir una persona sin DNI");
					this.dni = builder.getDni();
					this.edad = builder.getEdad();
				}
				
	4�) Creamos un main como en el siguiente ej.

		Persona p = new PersonaBuilder().edad(12).nombre("David").dni("18052485H").nombre("Pegleg").build();
		
		** ES OBLIGATORIO PONER EL ".build" AL FINAL DE CADA CREACI�N, SINO SALDR� ERROR Y NO PODR�S CREARLO **
*/
}
