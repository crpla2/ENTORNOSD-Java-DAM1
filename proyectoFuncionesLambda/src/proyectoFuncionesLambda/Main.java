package proyectoFuncionesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	//parametro sin tipar	
    var lista= new ArrayList<String>();
	System.out.println(lista.getClass());

	lista.add("Juan");
	lista.add("Maria");
	lista.add("Jose");
	lista.add("Manuela");
	lista.add("Mariano");
	
	for(String s:lista)
		System.out.println(s);

	//Funcion Lambda
	lista.forEach(elemento -> System.out.println(elemento));
	
	 var mapa=new HashMap<String,String>();
	 mapa.put("España", "Madrid");
	 mapa.put("Huesca", "Mi casa");
	 mapa.put("Aragon", "Huesca");
	 
	 if(mapa.get("Polonia")==null) {
		 mapa.put("Polonia","Varsovia");
	 }
	 //funcion lambda equivalente
	 String valor= mapa.computeIfAbsent("Polonia",s->"Varsovia");
	 
	 //Funcion lambda con dos parametros hacen falta parentesis
	 mapa.forEach((k,v)->System.out.println("La capital de "+k+" es "+v));
	 //Funcion lambda con dos acciones
	 mapa.forEach((k,v)->{
		 System.out.print("La capital de "+k+" es "+v);
		 System.out.println(".");
		 });
	 
	 var contador= new HashMap<String,Integer>();
	 List<String> palabras=Arrays.asList("Hola que tal Hola que".split(" "));
	 palabras.forEach(palabra->{
		 contador.computeIfPresent(palabra, (k,v)->v+1);
		 contador.computeIfAbsent(palabra, v->1);
	 });
	 
	 Collections.sort(lista);
	 System.out.println(contador);
	 
	 
}
}