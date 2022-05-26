/**
 * u26-Ejercicio2 - com.team02.u26.ejercicio2.dto - Cientifico
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 22/05/2022
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
 * Cientifico.java
 *
 */

@Entity
@Table(name = "cientificos")
public class Cientificos {
	
	//Atributos de la clase Cientificos
	@Id
	private String dni;
	@Column (name = "nombre_completo")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "cientifico")
	private List<Asignado> asignado;

	
	public Cientificos() {
		super();
	}



	public Cientificos(String dni, String nombre, List<Asignado> asignado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.asignado = asignado;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}


	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}


	@Override
	public String toString() {
		return "Cientificos [id=" + dni + ", nombre=" + nombre + ", asignado=" + asignado + "]";
	}

	}
