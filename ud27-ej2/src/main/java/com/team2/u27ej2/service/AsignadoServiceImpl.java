package com.team2.u27ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team2.u27ej2.dao.IAsignadoDAO;
import com.team2.u27ej2.dto.Asignado;



@Service
public class AsignadoServiceImpl  implements IAsignadoService {
	

	@Autowired
	IAsignadoDAO iAsignadoDAO;

	@Override
	public List<Asignado> listarAsignado() {
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado guardarAsignado(Asignado curso) {
		return iAsignadoDAO.save(curso);
	}

	@Override
	public Asignado asignadoXID(int id) {
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizarAsignado(Asignado curso) {
		return iAsignadoDAO.save(curso);
	}

	@Override
	public void eliminarAsignado(int id) {
		iAsignadoDAO.deleteById(id);
	}

}