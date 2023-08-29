package model;

public class Usuario {

	private String nombreApellido;
	private String nombreUsuario;
	private String clave;
	
	public Usuario() {
		super();
	}

	public Usuario(String nombreApellido, String nombreUsuario, String clave) {
		super();
		this.nombreApellido = nombreApellido;
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
	
}
