package com.model;
// Generated 6/05/2017 04:28:50 PM by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Editorial generated by hbm2java
 */
public class Editorial implements java.io.Serializable {

	private Integer idEditorial;
	private Pais pais;
	private String nombreEditorial;
	private String direccion;
	private String telefono;
	private Set<Libro> libros = new HashSet<Libro>(0);

	public Editorial() {
	}

	public Editorial(Pais pais, String nombreEditorial) {
		this.pais = pais;
		this.nombreEditorial = nombreEditorial;
	}

	public Editorial(Pais pais, String nombreEditorial, String direccion, String telefono, Set<Libro> libros) {
		this.pais = pais;
		this.nombreEditorial = nombreEditorial;
		this.direccion = direccion;
		this.telefono = telefono;
		this.libros = libros;
	}

	public Integer getIdEditorial() {
		return this.idEditorial;
	}

	public void setIdEditorial(Integer idEditorial) {
		this.idEditorial = idEditorial;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombreEditorial() {
		return this.nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Set<Libro> getLibros() {
		return this.libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

}
