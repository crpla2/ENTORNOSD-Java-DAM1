import java.util.Date;

public class Mensaje {
	private String emisor;
	private String cuerpo;
	private Date fechaHoraModificacion;
	private Date fechaHoraCreacion;
	private String destinatario;

	public Mensaje() {
		this.emisor = "Emisor desconocido";
		this.cuerpo = "Texto desconocido";
		this.fechaHoraModificacion = new Date();
		this.fechaHoraCreacion = new Date();

	}

	public Mensaje(String emisor, String cuerpo) {
		super();
		this.emisor = emisor;
		this.cuerpo = cuerpo;
		this.fechaHoraModificacion = new Date();
		this.fechaHoraCreacion = new Date();
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
		actualizarFechaModificacion();

	}

	private void actualizarFechaModificacion() {
		this.fechaHoraModificacion = new Date();
		System.out.println("Hora actualizada");
	}

	@Override
	public String toString() {
		return "(" + fechaHoraModificacion + ") " + "Mensaje de " + emisor + ": " + cuerpo;
	}

}
