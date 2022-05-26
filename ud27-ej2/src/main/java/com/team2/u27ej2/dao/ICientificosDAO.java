/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio1.dao - ICientificosDAO
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 17/05/2022
 */
package com.team2.u27ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.team2.u27ej2.dto.Cientificos;

/**
 * ICientificosDAO
 */

public interface ICientificosDAO extends JpaRepository<Cientificos, String> {
}
