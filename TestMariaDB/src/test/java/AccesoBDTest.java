import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Programa.AccesoBD;

class AccesoBDTest {

	@Test
	void testConexionBuena(){
		AccesoBD abd=new AccesoBD("src/main/resources/bdproperties.properties");
		abd.conectar();
		assertTrue(abd.testConexion());
		abd.desconectar();
		
	}
	void testConexionMala(){
		AccesoBD abd=new AccesoBD("src/main/resources/bdpropertiesmalo.properties");
		abd.conectar();
		assertTrue(abd.testConexion());
		abd.desconectar();
		
	}

}
