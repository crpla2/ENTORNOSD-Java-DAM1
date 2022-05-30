package ejemploSingleton;

public final class Director {
	private static Director instancia;
	public String nombre;
	
	//constructor privado para que solo se pueda crear mediante el metodo getInstance
	private Director(String nombre) {
		this.nombre = nombre;
	}
	//Comprueba que no exista otro Director y lo crea con el parametro que le pasamos
	public static Director getInstance(String nombre) {
		if(instancia == null) {
			instancia = new Director(nombre);
		}
		return instancia;	
	}
	public static Director getInstance() {
		if(instancia == null) {
			instancia = new Director("director por defecto");
		}
		return instancia;	
	}

	@Override
	public String toString() {
		return "Director [nombre=" + nombre + "]";
	}
	

}
