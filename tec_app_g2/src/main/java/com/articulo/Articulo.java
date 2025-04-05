package com.articulo;

public class Articulo{

private String Nombre;
private String Precio;
private String cantidad;

public Articulo(String nombre, String cantidad, String Precio) {
	super();
	
	Nombre = nombre;
	Precio = getPrecio();
	this.cantidad = cantidad;

	this.Nombre = nombre;
	this.Precio = Precio;
	this.cantidad = cantidad;

	
}
	public Articulo() {
		super();
		
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getPrecio() {
	return Precio;
}

public void setPrecio(String precio) {
	Precio = precio;
}

public String getCantidad() {
	return cantidad;
}

public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
}
public void setId(int i) {
	
	
}


}




