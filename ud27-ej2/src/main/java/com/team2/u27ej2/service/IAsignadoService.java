package com.team2.u27ej2.service;

import java.util.List;

import com.team2.u27ej2.dto.Asignado;

public interface IAsignadoService {
	
	//Metodos del CRUD
	public List<Asignado> listarAsignado(); //Listar todo
	
	public Asignado guardarAsignado(Asignado asignado);	//Crear un asigando
	
	public Asignado asignadoXID(int id); //Leer todos los datos de Asignado
	
	public Asignado actualizarAsignado(Asignado asignado); //Actualizar datos de asignados
	
	public void eliminarAsignado(int id);// Eliminar asignados


}