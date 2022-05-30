package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import zCalculadora.Calcu;
/**
 * Clase  para realizar los tests unitarios sobre los metodos de la clase Calcu
 * @author Carlos Rodrigo Pla
 *
 */
class calcuTest {
	static  int i =0;
	/**
	 * metodo estatico que se ejecuta antes de iniciar los tests
	 */
	@BeforeAll
	public static void testIni() {
		System.out.println("Inicio de los test ...\n");
	}
	/**
	 * Metodo que se ejecuta la final de todos los tests unitarios, muestra por pantalla el númerode tests realizados
	 */
	@AfterAll
	public static void testFin() {
		System.out.println("\n... Final de los test\nSe han realizado un total de "+i+" tests");
	}
	/**
	 * Metodo que se jecuta antes de cada test.
	 */
	@BeforeEach
	public void BefEach() {
		System.out.println("Test unitario numero "+(i+1));
	}
	/**
	 * Método que se ejecuta depues  de cada test y muestra por pantalle el numero de identificación de cada test
	 */
	@AfterEach
	public void AftEach() {
		System.out.println("Realizados "+i+" tests.");
	}

	/**
	 * Metodo que comprueba si el metodo Suma funciona corractamente
	 */
	@Test
	void testSuma() {
		Calcu c= new Calcu(2,3);
		assertEquals(5, c.suma(),"Debería ser cinco");
		i++;
	}
	@Test
	void testResta() {
		Calcu c= new Calcu(2,3);
		assertEquals(-1, c.resta());
		i++;
	}
	@Test
	void testMultiplica() {
		Calcu c= new Calcu(2,3);
		assertEquals(6, c.multiplica());
		i++;
	}
	@ParameterizedTest
	@CsvSource({"6,3,2","5,2,2.5"})
	@Tag("Double")
	void testDivide(int num1,int num2, double resultado) {
		Calcu c= new Calcu(num1, num2);
		assertEquals(resultado, c.divide());
		i++;
	}
	
	@RepeatedTest(10)
	void testRepe() {
		Calcu c= new Calcu(5,2);
		assertEquals(10, c.multiplica());
		i++;
	}
}
