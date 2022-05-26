/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio2.dto - Asignado
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 22/05/2022
 */
package com.team2.u27ej2.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 
/**
 * Asigna.java
 *
 */
@Entity
@Table (name= "asignado_a")
public class Asignado {

	// Atributos de entidad Asignado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//mira el ultimo valor i pone el nuestro en fuincion de el ultimo valor
	private int id;
	

	@ManyToOne
	@JoinColumn(name = "id_cientifico")
	Cientificos cientifico;
	
	@ManyToOne
	@JoinColumn(name = "id_proyecto")
	Proyecto proyecto;



	/**
	 * @param id
	 * @param proveedor
	 * @param pieza
	 * @param precio
	 */
	public Asignado(int id, Cientificos cientifico, Proyecto proyecto) {
		super();
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}


	public Asignado() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignado [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}
	
	

}
