package com.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dao.ILibro;
import com.impl.LibroImpl;
import com.model.Autor;
import com.model.Categoria;
import com.model.Editorial;
import com.model.Idioma;
import com.model.Libro;

public class LibroImplTest {

	@Test
	public void testAgregar() {
		
		
	    ILibro libroDAO= new LibroImpl();
		
	    
		Libro libro= new  Libro();
		
		
		Editorial editorial = new Editorial();
		Autor autor= new Autor();
		Idioma idioma= new Idioma();
		Categoria categoria= new Categoria();
		
		
		editorial.setIdEditorial(2);
		autor.setIdAutor(1);
		idioma.setIdIdioma(1);
		categoria.setIdCategoria(4);
		
		libro.setTitulo("jadfjkladjf");
		//libro.setIdLibro(1);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		libro.setIdioma(idioma);	
		
		
		
		assertEquals(true, libroDAO.agregar(libro));
		
	}
	
	@Test
	public void testEliminar() {
		
		
	    ILibro libroDAO= new LibroImpl();
		
	    
		Libro libro= new  Libro();
		
		
		Editorial editorial = new Editorial();
		Autor autor= new Autor();
		Idioma idioma= new Idioma();
		Categoria categoria= new Categoria();
		
		
		editorial.setIdEditorial(2);
		autor.setIdAutor(1);
		idioma.setIdIdioma(1);
		categoria.setIdCategoria(4);
		
		libro.setTitulo("jadfjkladjf");
		libro.setIdLibro(1);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		libro.setIdioma(idioma);	
		
		
		
		assertEquals(true, libroDAO.eliminar(libro));
		
	}
	
	@Test
	public void testActualizar() {
		
		
	    ILibro libroDAO= new LibroImpl();
		
	    
		Libro libro= new  Libro();
		
		
		Editorial editorial = new Editorial();
		Autor autor= new Autor();
		Idioma idioma= new Idioma();
		Categoria categoria= new Categoria();
		
		
		editorial.setIdEditorial(2);
		autor.setIdAutor(1);
		idioma.setIdIdioma(1);
		categoria.setIdCategoria(4);
		
		libro.setTitulo("emanuel");
		libro.setIdLibro(2);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		libro.setEditorial(editorial);
		libro.setIdioma(idioma);	
		
		
		
		assertEquals(true, libroDAO.actualizar(libro));
		
	}
	
	@Test
	public void testSeleccionar() {
		
		
	    ILibro libroDAO= new LibroImpl();
	    Libro libro= new  Libro();
	    libro.setIdLibro(2);
			
		assertEquals(Libro.class, libroDAO.seleccionar(libro.getIdLibro()).getClass());
		
	}

}
