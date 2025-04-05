package com.tec_app_g2.tec_app_g2.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tec_app_g2.tec_app_g2.modelo.Profesor;


@Service
public class ProfesorServiceImpl implements IProfesorService{
	
	private List<Profesor> lista=null;
	public ProfesorServiceImpl() {
		
		lista=new LinkedList<Profesor>();
		Profesor Profe1=new Profesor();
		Profe1.setId(1);
		Profe1.setNombre("Ana");
		Profe1.setApellido("Sanchez");
		Profe1.setDireccion("TEPA");
		Profe1.setTelefono("77231354");
		
		Profesor Profe2=new Profesor();
		Profe2.setId(1);
		Profe2.setNombre("paco");
		Profe2.setApellido("Lopez");
		Profe2.setDireccion("Actopan");
		Profe2.setTelefono("55551354");
		
		Profesor Profe3=new Profesor();
		Profe3.setId(1);
		Profe3.setNombre("Luis");
		Profe3.setApellido("Martinez");
		Profe3.setDireccion("Guerrero");
		Profe3.setTelefono("459861354");
		
		lista.add(Profe1);
		lista.add(Profe2);
		lista.add(Profe3);
	}
		
	@Override
	public List<Profesor> listarProfesores() {
		return lista;
	}

}
