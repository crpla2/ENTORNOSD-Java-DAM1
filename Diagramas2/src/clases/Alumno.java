package clases;

public class Alumno extends Persona {
	String expediente;
	private String attPrivado;
	public String attPublico;
	protected String attProtected;

	public Alumno(String expediente) {

		this.expediente = expediente;
	}

	public String getExpediente() {
		return expediente;
	}
	protected  void metodoProtected() {
		
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public String getAttPrivado() {
		return attPrivado;
	}

	public void setAttPrivado(String attPrivado) {
		this.attPrivado = attPrivado;
	}

}
