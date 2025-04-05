package com.tec_app_g2.tec_app_g2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tec_app_g2.tec_app_g2.modelo.Profesor;
import com.tec_app_g2.tec_app_g2.service.IProfesorService;

import sucursales.Sucursales;

import com.articulo.Articulo;

//RestController
@Controller 
public class HomeController {
	
	@Autowired
	private IProfesorService iProfesorService;
	
	//Variables 
	String nombre="Maria";
	String apellido="Cruz";
	String dire="Lomas";
	String tel="123456789";
	
	@GetMapping("/listaProfesores")
	public String mostrarTabla(Model modelo) {
		List<Profesor> lista=iProfesorService.listarProfesores();
		modelo.addAttribute("profesores",lista);
		return "tabla";
	}
	
	@GetMapping("/detalleProfesor")
	public String mostrarDetalle(Model modelo) {
		Profesor profesor=new Profesor();
		profesor.setId(1);
		profesor.setNombre("juana");
		profesor.setApellido("lopez");
		profesor.setDireccion("tulanchismes");
		profesor.setTelefono("7721234987");
		modelo.addAttribute("profe", profesor);
		return "detalle";
	}
	
		@GetMapping("/")
		public String inicio () {
			return "home";  // llama una pagina web renderizada
		}
		
		@GetMapping("/inicio")
		public String mostrarMensaje(Model model) {
			model.addAttribute("nombre", nombre);
			model.addAttribute("apellidoP", apellido);
			model.addAttribute("direccion", dire);
			model.addAttribute("telefono", tel);
			return "inicio";
			
		}
		
		@GetMapping("/articulo")
		public String mostrarDetalle1(Model modelo) {
			Articulo articulo=new Articulo();
			articulo.setId(1);
			articulo.setNombre("juana");
			articulo.setPrecio("45");
			articulo.setCantidad("84");
			
			modelo.addAttribute("arti", articulo);
			return "articulo";
			
		}
			
			@GetMapping("/sucursales")
			public String MostrarDetalle(Model modelo) {
			    Sucursales sucursales = new Sucursales();
			   
			    sucursales.setId_gerente(1); 
			    sucursales.setId_sucursal_fk(1); 
			    sucursales.setNombre_sucursal("Sucursal 1");
			    sucursales.setDireccion("Calle  123");
			    sucursales.setTelefono("1234567890");
			    sucursales.setCorreo("contacto@sucursal.com");
			    sucursales.setEstatus("Activo");
			    sucursales.setHorario_atencion("9:00 AM - 6:00 PM");
			    sucursales.setCuenta_cuenta("Cuenta de ahorros");
			    sucursales.setUsuario("admin");
			    sucursales.setContraseña("password123");
			    
			    modelo.addAttribute("sucur", sucursales);
			    return "sucursales"; 
		
		}
		
}
