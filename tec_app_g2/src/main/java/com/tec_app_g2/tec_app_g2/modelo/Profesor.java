package com.tec_app_g2.tec_app_g2.modelo;

public class Profesor {
	private Integer id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	
	public Profesor(Integer id, String nombre, String apellido, String direccion, String telefono) {
		super();
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}
	public Profesor() {
		super();
			
	}                                                          
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
