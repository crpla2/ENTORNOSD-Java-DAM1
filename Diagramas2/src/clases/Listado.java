package clases;

import java.util.ArrayList;

public class Listado {
	ArrayList<Persona>lista;
	String grupo;
	public Listado(ArrayList<Persona> lista, String grupo) {
		super();
		this.lista = lista;
		this.grupo = grupo;
	}
	public Listado(String grupo) {
	
		this.lista = new ArrayList<Persona>();
		this.grupo = grupo;
	}


	public ArrayList<Persona> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Persona> lista) {
		this.lista = lista;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
