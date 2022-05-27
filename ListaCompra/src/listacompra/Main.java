package listacompra;
public class Main {

	public static void main(String[] args) {
		Lista lista=new Lista("Prueba");
		lista.anyadirArticulo(new Articulo(2.4,"manzana","manzana Golden"));
		lista.anyadirArticulo(new Articulo(2.4,"pera","manzana Conferencia"));
		lista.anyadirArticulo(new Articulo(2.4,"platano","platano de Canarias"));
		lista.anyadirArticulo(new Articulo(2.4,"kiwi","kiwi New Zealand"));
		System.out.println(lista);

	}

}
