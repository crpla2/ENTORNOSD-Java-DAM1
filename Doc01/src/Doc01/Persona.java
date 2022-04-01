package Doc01;
/**
 * Clase Persona para crear objetos que hacen referencia a personas
 * 
 * Nuestras personas sólo tienen una edad y un nombre.
 * 
 * @author Carlos Rodrigo
 * @version 1.0
 *
 */
public class Persona {
	
	private int edad;
	private String nombre;
	/**
	 * Método constructor con los parámetros edad (entero) y nombre (String)
	 * @param edad es un entero y de momento no controlamos nada.
	 * @param nombre sin restricciones.
	 */
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	/**
	 * Método que muestra la edad.
	 * @return edad como un entero.
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Método para  darle un valor al atributo edad pasado por parámetro. Esto solo hace {@code this.edad=edad;}
	 * @param edad como un entero.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Método que muestra el nombre.
	 * @return nombre como un String.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método que da valor a l atributo nombre pasado por parámetro.
	 * @param nombre como un String.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método para mostrar por pantalla los datos de la persona.
	 * Devuelve un String.
	 */
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
}
