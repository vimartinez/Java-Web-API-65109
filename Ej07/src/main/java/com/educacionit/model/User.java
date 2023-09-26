package com.educacionit.model;

public class User {
	
	private Long id;
	private String nombreApellido;
	private String mail;
	private String direccion;
	private String clave;
	
	public User() {
		
	}

	public User(Long id, String nombreApellido, String mail, String direccion, String clave) {
		super();
		this.id = id;
		this.nombreApellido = nombreApellido;
		this.mail = mail;
		this.direccion = direccion;
		this.clave = clave;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nombreApellido=" + nombreApellido + ", mail=" + mail + ", direccion=" + direccion
				+ ", clave=" + clave + "]";
	}
	
	

}
