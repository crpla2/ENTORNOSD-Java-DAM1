package patronBuilder;

import java.util.TreeSet;

public class UsuarioBuilder {

		private String email;
	    private String nombre;
	    private String apellidos;
	    private String telefono;
	    private String direccion;
	    private TreeSet<String> intereses;

	    public UsuarioBuilder() {
	    }

	    public UsuarioBuilder email(String email) {
	        this.email = email;
	        return this;
	    }

	    public UsuarioBuilder nombre(String nombre, String apellidos) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        return this;
	    }

	    public UsuarioBuilder telefono(String telefono) {
	        this.telefono = telefono;
	        return this;
	    }

	    public UsuarioBuilder direccion(String direccion) {
	        this.direccion = direccion;
	        return this;
	    }
	    
	    public UsuarioBuilder intereses(TreeSet<String> intereses) {
	    	if(this.intereses == null) {
	    		this.intereses = intereses;
	    	}else{
	    		this.intereses.addAll(intereses);
	    	}
	    	return this;
	    }
	    
	    public UsuarioBuilder interes(String interes) {
	    	if (this.intereses == null) {
	    		this.intereses = new TreeSet<String>();
	    	}
	    	intereses.add(interes);
	    	return this;
	    }

	    public Usuario build() {
	        return new Usuario(this);
	    }
	    
	    // Getters
	    public String getEmail() {
	        return email;
	    };
	    
	    public String getNombre() {
	        return nombre;
	    };
	    
	    public String getApellidos() {
	        return apellidos;
	    };
	    
	    public String getTelefono() {
	        return telefono;
	    };
	    
	    public String getDireccion() {
	        return direccion;
	    }

		public TreeSet<String> getIntereses() {
			return intereses;
		};
	
}
