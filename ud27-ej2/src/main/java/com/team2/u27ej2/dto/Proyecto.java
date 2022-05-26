/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio2.dto - Proyecto
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 25/05/2022
 */
package com.team2.u27ej2.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Proveedor.java
 *
 */
@Entity
@Table(name = "proyectos")
public class Proyecto {

	@Id
	private String id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private int horas;
	
	@OneToMany
	@JoinColumn(name = "proyecto")
	private List<Asignado> asignado;
	public Proyecto() {
		super();
	}

	public Proyecto(String id, String nombre, int horas, List<Asignado> asignado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignado = asignado;
	}

	public String getId() {
		
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}


	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignado=" + asignado + "]";
	}
	
	
}
