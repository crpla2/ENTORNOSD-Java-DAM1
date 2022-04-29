package Ejercicio22Abril_01;

public class CocheBuilder {
	private String matricula;
	private String marca;
	private String modelo;
	private double peso;
	private int CV;
	
	public CocheBuilder() {
		
	}
	public CocheBuilder matricula(String matricula) {
		this.matricula = matricula;
		return this;
	}
	public CocheBuilder marca(String marca) {
		this.marca = marca;
		return this;
	}
	public CocheBuilder modelo(String modelo) {
		this.modelo = modelo;
		return this;
	}
	public CocheBuilder peso(double peso) {
		this.peso = peso;
		return this;
	}
	public CocheBuilder CV(int CV) {
		this.CV = CV;
		return this;
	}
	public Coche build() {
		return new Coche(this);
	}
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getPeso() {
		return peso;
	}
	public int getCV() {
		return CV;
	}
	
	
}
