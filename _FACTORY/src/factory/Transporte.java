package factory;

public interface Transporte {
	
	/**
	 * Se arranca el vehículo
	 */
	public void arrancar();
	
	/**
	 * Se detiene el vehículo
	 */
	public void detener();
	
	/**
	 * Metodo para mostrar el tipo
	 * @return el tipo de vehículo
	 */
	public String tipo();


}
