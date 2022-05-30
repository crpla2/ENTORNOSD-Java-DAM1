package factory;

public interface Transporte {
	
	/**
	 * Se arranca el veh�culo
	 */
	public void arrancar();
	
	/**
	 * Se detiene el veh�culo
	 */
	public void detener();
	
	/**
	 * Metodo para mostrar el tipo
	 * @return el tipo de veh�culo
	 */
	public String tipo();


}
