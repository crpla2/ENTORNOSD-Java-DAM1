package builder;

import java.util.TreeSet;

public class Usuario {
	 private String email;
	    private String nombre;
	    private String apellidos;
	    private String telefono;
	    private String direccion;
	    private TreeSet<String>intereses;
	    
	  //se crea un contructor privado para que no se pueda crear desde fuera de la clase y obligue a crearlo con un builder
	    private Usuario() {
	    }
	  
	    Usuario(UsuarioBuilder builder) {
	        if (builder.getEmail() == null) {
	            throw new IllegalArgumentException("email es requerido");
	        }
	        this.email = builder.getEmail();
	        this.nombre = builder.getNombre();
	        this.apellidos = builder.getApellidos();
	        this.telefono = builder.getTelefono();
	        this.direccion = builder.getDireccion();
	        this.intereses=builder.getIntereses();
	    }

		@Override
		public String toString() {
			return "Usuario [email=" + email + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono="
					+ telefono + ", direccion=" + direccion + ", intereses=" + intereses + "]";
		}

		
}
