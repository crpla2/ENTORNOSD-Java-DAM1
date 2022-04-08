package builder;

public class Main {

	public static void main(String[] args) {
		Usuario usu= new UsuarioBuilder()
				.email("hola@esviernes.com")
				.nombre("Juan", "Gonzalez")
				.direccion("Calle Perena, 25")
				.build();
		System.out.println(usu);

	}

}
