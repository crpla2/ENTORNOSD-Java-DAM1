package builder;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<String>intereses= new TreeSet<String>();
		intereses.add("motor");
		intereses.add("tecnología");
		intereses.add("informática");
		Usuario usu= new UsuarioBuilder()
				.email("hola@esviernes.com")
				.nombre("Juan", "Gonzalez")
				.direccion("Calle Perena, 25")
				.nombre("Jorge", "Gonzalez")
				.intereses(intereses)
				.interes("informática")
				.build();
		System.out.println(usu);
		
	
	}

}
