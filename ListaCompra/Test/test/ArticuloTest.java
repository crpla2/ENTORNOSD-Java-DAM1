package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import listacompra.Articulo;

class ArticuloTest {

	
	@Test
	void testArticulo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPrecio() {
		var art=new Articulo(2.4,"manzana","manzana Golden");
		assertEquals(2.4, art.getPrecio());
	}
	
	@Test
	void testGetPrecioNegativo() {
		var art=new Articulo(-2.4,"manzana","manzana Golden");
		assertEquals(10.0, art.getPrecio());
	}

	@Test
	void testSetPrecioNegativo() {
		Exception e= assertThrows(Exception.class, 
				()->{
					Articulo art= new Articulo(2.4,"manzanas","descripcion");
					art.setPrecio(-2.5);
					},
					"Se esperaba una excepción"
				);
		assertEquals(e.getMessage(), "No se puede poner un precio negativo");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDecripcion() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDecripcion() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
