package factory;

public class Moto implements Transporte {

	/**
	 * Arranca la moto
	 */
	@Override
	public void arrancar() {
		System.out.println("Arrancando la moto...");
	}

	/**
	 * Detiene la moto
	 */
	@Override
	public void detener() {
		System.out.println("Deteniendo la moto...");
	}

	/**
	 * Muestra el tipo de veh�culo (moto)
	 */
	@Override
	public String tipo() {
		return "Moto";
	}

}
