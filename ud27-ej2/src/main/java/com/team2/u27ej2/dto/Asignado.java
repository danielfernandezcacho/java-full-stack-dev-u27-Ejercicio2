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
	private int precio;

	@ManyToOne
	@JoinColumn(name = "cientifico")
	Cientificos cientifico;
	
	@ManyToOne
	@JoinColumn(name = "proyecto")
	Proyecto proyecto;
	

	public Asignado() {
		super();
	}

	/**
	 * @param id
	 * @param precio
	 * @param cientifico
	 * @param proyecto
	 */
	public Asignado(int id, int precio, Cientificos cientifico, Proyecto proyecto) {
		this.id = id;
		this.precio = precio;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public int getId() {
		return id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
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
		return "Asignado [id=" + id + ", precio=" + precio + ", cientifico=" + cientifico + ", proyecto=" + proyecto
				+ "]";
	}

	

}
