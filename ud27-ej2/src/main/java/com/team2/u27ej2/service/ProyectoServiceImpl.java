package com.team2.u27ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team2.u27ej2.dao.IProyectoDAO;
import com.team2.u27ej2.dto.Proyecto;



@Service
public class ProyectoServiceImpl implements IProyectoService{
	
	@Autowired
	IProyectoDAO iProyectoDAO;

	@Override
	public List<Proyecto> listarProyecto() {
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(int id) {
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(int id) {
		iProyectoDAO.deleteById(id);
	}

	@Override
	public List<Proyecto> listarproyecto() {
		return iProyectoDAO.findAll();
	}
}