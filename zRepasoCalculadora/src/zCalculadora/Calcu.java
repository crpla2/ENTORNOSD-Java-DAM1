package zCalculadora;
/**
 * Clase que implementa un clase que desarrolla una calculadora
 * @author Carlos Rodrigo Pla
 *
 */
public class Calcu {
	int num1;
	int num2;
/**
 * Constructor de la clase Calcu que crea un objeto del tipo Calcu parametrizado
 * @param num1 numero entero
 * @param num2 numero entero
 */
	public Calcu(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
/**
 * Metodo que realiza una suma
 * @return devuelve un número entero como resultado de la opeeación
 */
	public int suma() {
		return num1+num2;
	}
	
	public int resta() {
		return num1-num2;
	}
	
	public int multiplica() {
		return num1*num2;
	}
	
	public double divide() {
		return(double)num1/num2;	
		
	}
}
