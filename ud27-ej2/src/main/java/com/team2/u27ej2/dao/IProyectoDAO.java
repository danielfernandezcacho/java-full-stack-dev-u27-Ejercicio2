/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio2.dao - IProyectoDAO
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 22/05/2022
 */
package com.team2.u27ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team2.u27ej2.dto.Proyecto;

/**
 * IProyectoDAO
 *
 */
public interface IProyectoDAO extends JpaRepository<Proyecto, String>{

}
