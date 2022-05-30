package factory;

public class Main {

	public static void main(String[] args) {
		Transporte p1 = Fabrica.construir("Moto");
		Transporte p2 = Fabrica.construir("Coche");
		Transporte p3 = Fabrica.construir("hola");
		
		p1.arrancar();
		p2.detener();
	}

}
