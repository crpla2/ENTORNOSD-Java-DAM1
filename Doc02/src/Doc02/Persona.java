package Doc02;
/**
 * Clase para definir los atributos de una persona
 * @author Carlos Rodrigo
 * @version 1.0
 */
public class Persona {
	String nombre;
	String apellido;
	String apellido2;
	int edad;
	/**
	 * Constructor de la clase pasandole el valor de los atributos por parametro.
	 * @param nombre Nombre de la persona de tipo String
	 * @param apellido Primer apellido de la persona de tipo String.
	 * @param apellido2 Segundo apellido de la persona de tipo String.
	 * @param edad Edad de la persona de tipo Int
	 */
	public Persona(String nombre, String apellido, String apellido2, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.edad = edad;
	}
	/**
	 * Devuelve el nombre de la persona
	 * @return de tipo String
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Define el nombre de la persona
	 * @param nombre de tipo String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el primer apellido de la persona.
	 * @return de tipo String
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Define el primer apellido de la persona.
	 * @param apellido de tipo String
	 */
	 
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Devuelve el segundo apellido de la persona.
	 * @return de tipo String
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * Define el primer apellido de la persona.
	 * @param apellido2 de tipo String
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * Devuelve la edad de la persona.
	 * @return de tipo int.
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Definela edad de la persona.
	 * @param edad de tipo int.
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Devuelve los datos de la persona
	 * @return de tipo String
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", apellido2=" + apellido2 + ", edad=" + edad
				+ "]";
	}
	
}
