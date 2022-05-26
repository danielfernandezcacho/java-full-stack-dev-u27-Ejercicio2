package com.team2.u27ej2.service;

import java.util.List;

import com.team2.u27ej2.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarproyecto(); //hacer lista de todos los cientificos
	
	public Proyecto guardarProyecto(Proyecto proyecto);	//Guardar servicios
	
	public Proyecto proyectoXID(int id); //leer datis
	
	public Proyecto actualizarProyecto(Proyecto proyecto); //Actualizar proyectos
	
	public void eliminarProyecto(int id);// Eliminar proyecto

	List<Proyecto> listarProyecto();
}