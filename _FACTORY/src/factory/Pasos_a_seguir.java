package factory;

public class Pasos_a_seguir {
/*
 * FACTORY METHOD
	
	- Esquema:
	Coche_
	 	  \
		   }---> Transporte ---> Fabrica
	Moto _/


1º) Creamos la interfaz "Transporte" con los metodos que obtendran todas las subclases ().

2º) Creamos las subclases (Coche, Moto) e implementamos la interfaz en estas.

3º) Creamos la clase "Fabrica" en la que creamos un metodo estatico constructor donde pasamos un parametro de texto para crear un Transporte 
	del tipo que deseemos. En este metodo, en forma de varios if o un switch, tenemos que hacer que si el parametro introducido coincide con 
	el valor que identifica a la clase (en nuestro caso el tipo de transporte) cree la clase, en caso de que no exista, devuelva null.
	
4º) Para probarlo, crearemos un main y deberemos crear objetos de la siguiente manera.
 	
 		Transporte p1 = Fabrica.construir("Moto");
 * 
 * */
}
