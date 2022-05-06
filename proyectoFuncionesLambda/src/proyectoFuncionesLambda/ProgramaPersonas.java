package proyectoFuncionesLambda;

import java.util.ArrayList;

public class ProgramaPersonas {

	public static void main(String[] args) {
		ArrayList<Persona>lista= new ArrayList<Persona>();
		
		lista.add(new Persona(34, "Juan"));
		lista.add(new Persona(36, "Mariana"));
		lista.add(new Persona(30, "Juan"));
		lista.add(new Persona(24, "Maria"));
		lista.add(new Persona(54, "Jaime"));
		
		lista.forEach(p-> System.out.println(p));
		System.out.println("....................\n");
		lista.sort((p1, p2)->p1.getNombre().compareTo(p2.getNombre()));
		
		lista.forEach(p->System.out.println(p));
	}

}
