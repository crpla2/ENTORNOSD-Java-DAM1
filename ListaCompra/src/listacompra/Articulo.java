package listacompra;

public class Articulo {
	double precio;
	String nombre;
	String decripcion;

	public Articulo(double precio, String nombre, String decripcion) {
		super();
		if (precio <= 0) {
			this.precio = 10.0;
		} else {
			this.precio = precio;
		}
		this.nombre = nombre;
		this.decripcion = decripcion;
	}

	public Articulo() {
		super();
		this.precio = 0;
		this.nombre = "";
		this.decripcion = "";
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) throws Exception {
		if (precio < 0) {
			throw new Exception("No se puede poner un precio negativo");
		} else {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}

	@Override
	public String toString() {
		return "Articulo [precio=" + precio + ", nombre=" + nombre + ", decripcion=" + decripcion + "]\n";
	}
}
