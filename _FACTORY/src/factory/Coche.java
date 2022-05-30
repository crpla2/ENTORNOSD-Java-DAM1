package factory;

public class Coche implements Transporte {
	
	/**
	 * Arranca el coche
	 */
	@Override
	public void arrancar() {
		System.out.println("Arracando el coche...");
	}

	/**
	 * Detiene el coche
	 */
	@Override
	public void detener() {
		System.out.println("Deteniendo el coche...");
	}

	/**
	 * Muestra que es el tipo es un coche
	 */
	@Override
	public String tipo() {
		return "Coche";
	}



}
