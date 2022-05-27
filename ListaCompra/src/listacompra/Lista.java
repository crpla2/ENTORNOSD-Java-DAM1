package listacompra;
import java.util.ArrayList;

public class Lista {
	String nombre;	
	ArrayList<Articulo>lista;
	
	public Lista(String nombre) {
		lista= new ArrayList<Articulo>();
	}
	
	public void anyadirArticulo(Articulo art) {
		lista.add(art);
	}
	
	public void borrarArticulo(Articulo art) {
		lista.remove(lista.size()-1);
	}

	@Override
	public String toString() {
		return "Lista= " + nombre+" [" + lista + "]";
	}
	
	
}
