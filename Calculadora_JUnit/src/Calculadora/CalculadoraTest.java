package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculadoraTest {
	
	@BeforeAll
	public static void init() {
		System.out.println("Metodo init");
	}
	@AfterAll
	public static void after() {
		System.out.println("Metodo after");
	}
	@BeforeEach
	public  void initEach() {
		System.out.println("Metodo init cada vez");
	}
	@AfterEach
	public  void afterEach() {
		System.out.println("Metodo after cada vez");
	}
	@Test
	void testImprimirSuma() {
		PrintStream salida=System.out;
		ByteArrayOutputStream outputStreamCaptor= new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		Calculadora c= new Calculadora(3, 4);
		c.imprimirSuma();
	//	assertEquals("7\r\n",outputStreamCaptor.toString());
		assertEquals("7",outputStreamCaptor.toString().trim());
		System.setOut(salida);
	}
	@Test
	void testImprimirSumaLarga() {
		PrintStream salida=System.out;
		ByteArrayOutputStream outputStreamCaptor= new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		Calculadora c= new Calculadora(6, 8);
		c.imprimirSumaLarga();
		assertEquals("suma 6+8=\r\n14",outputStreamCaptor.toString().trim());
		System.setOut(salida);
	}
	@Test
	@Timeout(value=500, unit=TimeUnit.MILLISECONDS)
	void comprobarSumaLenta()  throws InterruptedException{
		Calculadora c= new Calculadora(2,3);
		assertEquals(5, c.sumaLenta());
	}
	
	@Test
	void testCalculadora() {
		//fail("Not yet implemented");
	}

	@Test
	void testSuma() {
		Calculadora c=new Calculadora(4, 5);
		int resultado=c.suma();
		assertEquals(9, resultado); 
		//fail("Not yet implemented");
	}

	@Test
	void testResta() {
		Calculadora c=new Calculadora(4, 5);
		int resultado=c.resta();
		assertEquals(-1, resultado,"Deberia dar -1"); 
		//fail("Not yet implemented");
	}
	

	@Test
	void testRestaPositivo() {
		Calculadora c=new Calculadora(9, 5);
		int resultado=c.resta();
		assertEquals(4, resultado,"Deberia dar 4"); 
		//fail("Not yet implemented");
	}
	
	@RepeatedTest(10)
	void testProducto() {
		Calculadora c=new Calculadora(4, 5);
		int resultado=c.producto();
		assertEquals(20, resultado); 
		//fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		Calculadora c=new Calculadora(5, 2);
		double resultado=c.division();
		assertEquals(2.5, resultado); 
		//fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@ValueSource(ints= {2,3,4,5,6})
	void comprobarSignoRaiz(int candidate) {
		Calculadora c= new Calculadora(candidate,1);
		assertTrue(c.raizCuadrada()>0);
	}
	
	@ParameterizedTest
	@CsvSource({"1,1,2","2,-1,1","2,3,5"})
	void comprobarSumas(int num1, int num2, int resultado) {
		Calculadora c= new Calculadora(num1, num2);
		assertEquals(resultado, c.suma());
	}
	
	@ParameterizedTest
	@CsvSource({"1,1,1","2,-1,-2","5,2,2.5"})
	void comprobarDivisiones(int num1, int num2, double resultado) {
		Calculadora c= new Calculadora(num1, num2);
		assertEquals(resultado, c.division());
	}
	
}
