/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio2.controller - ProyectoController
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/05/2022
 */
package com.team2.u27ej2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team2.u27ej2.dto.Proyecto;
import com.team2.u27ej2.service.ProyectoServiceImpl;

/**
 * ProyectoController.java
 *
 */
@RestController
@RequestMapping("/Proyecto")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	
	@GetMapping("/")
	public List<Proyecto> listarProyecto(){
		return proyectoServiceImpl.listarProyecto();
	}
	
	
	@PostMapping("/")
	public Proyecto salvarProyecto(@RequestBody Proyecto curso) {
		
		return proyectoServiceImpl.guardarProyecto(curso);
	}
	
	
	@GetMapping("/{id}")
	public Proyecto ProyectoXID(@PathVariable(name="id") String id) {
		
		Proyecto Proyecto_xid= new Proyecto();
		
		Proyecto_xid=proyectoServiceImpl.proyectoXID(id);

		
		return Proyecto_xid;
	}
	
	@PutMapping("/{id}")
public Proyecto actualizarProyecto(@PathVariable(name="id")String id,@RequestBody Proyecto Proyecto) {
		
		Proyecto Proyecto_seleccionado= new Proyecto();
		Proyecto Proyecto_actualizado= new Proyecto();
		
		Proyecto_seleccionado= proyectoServiceImpl.proyectoXID(id);
		
		Proyecto_seleccionado.setNombre(Proyecto.getNombre());
		
		
		Proyecto_actualizado = proyectoServiceImpl.actualizarProyecto(Proyecto_seleccionado);
		
		
		return Proyecto_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarProyecto(@PathVariable(name="id")String id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
	
}
