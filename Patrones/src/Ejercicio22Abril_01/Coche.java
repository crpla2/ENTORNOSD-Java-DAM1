package Ejercicio22Abril_01;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private double peso;
	private int CV;

	private Coche(){}
	
	Coche (CocheBuilder builder){
		if (builder.getMatricula()==null) {
			throw new IllegalArgumentException("la matricula es requerida");
		}
		this.matricula = builder.getMatricula();
	    this.marca = builder.getMarca();
	    this.modelo = builder.getModelo();
	    this.peso = builder.getPeso();
	    this.CV = builder.getCV();
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", peso=" + peso + ", CV="
				+ CV + "]";
	}
}
