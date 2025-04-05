//Universidad Politecnica de Francisco I Madero
//ingenieria en sistemas cumputacionales
//tecnologias y aplicaciones en internet
//Ing.cain hernandez angeles												
//Alumnos:Edwin emir rodriguez serrano y Alan santiago viveros



package sucursales;

public class Sucursales {

	private Integer id_gerente; 
	private Integer Id_sucursal_fk; 
	private String Nombre_sucursal; 
    private String direccion; // Cambié de "Dirección" a "direccion"
    private String telefono; // Cambié de "Teléfono" a "telefono"
	private String Correo; 
	private String Estatus; 
	private String Horario_atencion; 
	private String Cuenta_cuenta; 
	private String Usuario;
	private String Contraseña;
	
	public Sucursales(Integer id_gerente, Integer id_sucursal_fk, String nombre_sucursal, String direccion,
			String telefono, String correo, String estatus, String horario_atencion, String cuenta_cuenta,
			String usuario, String contraseña) {
		super();
		
		this.id_gerente = id_gerente;
		Id_sucursal_fk = id_sucursal_fk;
		Nombre_sucursal = nombre_sucursal;
		direccion = direccion;
		telefono = telefono;
		Correo = correo;
		Estatus = estatus;
		Horario_atencion = horario_atencion;
		Cuenta_cuenta = cuenta_cuenta;
		Usuario = usuario;
		Contraseña = contraseña;
		
		
		
	}

	public Sucursales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId_gerente() {
		return id_gerente;
	}

	public void setId_gerente(Integer id_gerente) {
		this.id_gerente = id_gerente;
	}

	public Integer getId_sucursal_fk() {
		return Id_sucursal_fk;
	}

	public void setId_sucursal_fk(Integer id_sucursal_fk) {
		Id_sucursal_fk = id_sucursal_fk;
	}

	public String getNombre_sucursal() {
		return Nombre_sucursal;
	}

	public void setNombre_sucursal(String nombre_sucursal) {
		Nombre_sucursal = nombre_sucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getEstatus() {
		return Estatus;
	}

	public void setEstatus(String estatus) {
		Estatus = estatus;
	}

	public String getHorario_atencion() {
		return Horario_atencion;
	}

	public void setHorario_atencion(String horario_atencion) {
		Horario_atencion = horario_atencion;
	}

	public String getCuenta_cuenta() {
		return Cuenta_cuenta;
	}

	public void setCuenta_cuenta(String cuenta_cuenta) {
		Cuenta_cuenta = cuenta_cuenta;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
}
