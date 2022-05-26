/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio2.controller - AsignadoController
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

import com.team2.u27ej2.dto.Asignado;
import com.team2.u27ej2.service.AsignadoServiceImpl;

/**
 * AsignadoController.java
 *
 */

@RestController
@RequestMapping("/Asignado")
public class AsignadoController {

	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;

	@GetMapping("/")
	public List<Asignado> listarAsignados() {
		return asignadoServiceImpl.listarAsignado();
	}

	@PostMapping("/")
	public Asignado salvarAsignado(@RequestBody Asignado Asignado) {

		return asignadoServiceImpl.guardarAsignado(Asignado);
	}

	@GetMapping("/{id}")
	public Asignado asignadoXID(@PathVariable(name = "id") int id) {

		Asignado asignado_xid = new Asignado();

		asignado_xid = asignadoServiceImpl.asignadoXID(id);

		return asignado_xid;
	}

	@PutMapping("/{id}")
	public Asignado actualizarAsignado(@PathVariable(name = "id") int id, @RequestBody Asignado asignado) {

		Asignado asignado_seleccionado = new Asignado();
		Asignado asignado_actualizado = new Asignado();

		asignado_seleccionado = asignadoServiceImpl.asignadoXID(id);

		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());

		asignado_actualizado = asignadoServiceImpl.actualizarAsignado(asignado_seleccionado);

		return asignado_actualizado;
	}

	@DeleteMapping("/{id}")
	public void eliminarAsignado(@PathVariable(name = "id") int id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}

}
