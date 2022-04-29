package Ejercicio22Abril_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche= new CocheBuilder()
				.CV(100)
				.marca("BMW")
				.matricula("12345w")
				.build();
		Coche coche2= new CocheBuilder()
				.matricula("12365W")
				.CV(150).build();
				
		System.out.println(coche);
		System.out.println(coche2);

	}

}
