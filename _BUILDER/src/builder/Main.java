package builder;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new PersonaBuilder()
				.edad(19)
				.nombre("David")
				.dni("123456789C")
				.nombre("Pedro")
				.build();
		System.out.println(p);
		

	}

}
