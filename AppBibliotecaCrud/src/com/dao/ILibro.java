package com.dao;

import com.model.Libro;

public interface ILibro {

	public boolean agregar(Libro libro );
	public boolean eliminar(Libro libro );
	public boolean actualizar(Libro libro );
	public Libro seleccionar(int idLibro );
	
	
}
