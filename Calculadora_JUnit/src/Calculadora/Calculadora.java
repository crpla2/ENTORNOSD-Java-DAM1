package Calculadora;

public class Calculadora {
	int num1;
	int num2;
	
	/**
	 * 
	 * @param numero1 es un numero entero
	 * @param numero2 es un numero entero
	 */
	public Calculadora(int numero1, int numero2) {
		super();
		this.num1 = numero1;
		this.num2 = numero2;
	}
/**
 * 
 * @return integer
 */
	public int suma() {
		return num1 + num2;
	}

	public int resta() {
		return num1 - num2;
	}

	public int producto() {
		return num1 * num2;
	}

	public double division() {
		return (double)num1 / num2;
	}
	public double raizCuadrada() {
		return Math.sqrt(num1);
	}
	public double raizCuadrada2() {
		return Math.sqrt(num2);
	}

	public void imprimirSuma() {
		System.out.println(num1+num2);
	}
		
	public void imprimirSumaLarga() {
		System.out.println("suma "+num1+"+"+num2+"=\r\n"+(num1+num2));
	}
	
	/**
	 * 
	 * @return devuelve la suma de los numeros con medio segundo de retraso
	 * @throws InterruptedException esto lo lanza el metodo sleep de la clase Thread
	 * <pre>
	 * {@code
	 * public int sumaLenta()throws InterruptedException{
	 *   //duerme medio segundo
 	 *   Thread.sleep(500);
	 *   return num1+num2;
	 * }}
	 * </pre>
	 */
	public int sumaLenta()throws InterruptedException{
		//duerme medio segundo
		Thread.sleep(500);
		return num1+num2;
	}
}
