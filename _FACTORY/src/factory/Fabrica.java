package factory;

public class Fabrica {

	/**
	 * Clase para crear veh�culos en esta f�brica
	 * @param tipo Le insertas el tipo de veh�culo a crear en la f�brica
	 * @return Devuelve el objeto que se ha creado en la f�brica (coche o moto)
	 */
	public static Transporte construir(String tipo) {

		switch (tipo) {
		case "Moto":
			return new Moto();
		case "Coche":
			return new Coche();
		default:
			System.out.println("No se encuentra dicho objeto en la f�brica");
			return null;
		}

	}


}
