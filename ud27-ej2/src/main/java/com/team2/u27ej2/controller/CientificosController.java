/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio2.controller - CientificosController
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

import com.team2.u27ej2.dto.Cientificos;
import com.team2.u27ej2.service.CientificoServiceImpl;


/**
 * ProveedorController.java
 *
 */
@RestController
@RequestMapping("/Cientificos")
public class CientificosController {

	
	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/")
	public List<Cientificos> listarCcursos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	
	@PostMapping("/")
	public Cientificos salvarCientificos(@RequestBody Cientificos curso) {
		
		return cientificoServiceImpl.guardarCientificos(curso);
	}
	
	
	@GetMapping("/{dni}")
	public Cientificos CientificosXID(@PathVariable(name="dni") String dni) {
		
		Cientificos Cientificos_xid= new Cientificos();
		
		Cientificos_xid=cientificoServiceImpl.cientificosXID(dni);

		
		return Cientificos_xid;
	}
	
	@PutMapping("/{dni}")
	public Cientificos actualizarCientificos(@PathVariable(name="dni")String dni,@RequestBody Cientificos Cientificos) {
		
		Cientificos Cientificos_seleccionado= new Cientificos();
		Cientificos Cientificos_actualizado= new Cientificos();
		
		Cientificos_seleccionado= cientificoServiceImpl.cientificosXID(dni);
		
		Cientificos_seleccionado.setNombre(Cientificos.getNombre());
		
		
		Cientificos_actualizado = cientificoServiceImpl.actualizarCientificos(Cientificos_seleccionado);
		
		return Cientificos_actualizado;
	}
	
	@DeleteMapping("/{dni}")
	public void eleiminarCientificos(@PathVariable(name="dni")String dni) {
		cientificoServiceImpl.eliminarCientificos(dni);
	}
}
