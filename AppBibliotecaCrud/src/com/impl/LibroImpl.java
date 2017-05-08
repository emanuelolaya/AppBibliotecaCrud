package com.impl;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.util.HibernateUtil;

import com.dao.ILibro;
import com.model.Libro;

public class LibroImpl implements ILibro {

	@Override
	public boolean agregar(Libro libro) {

		Session session= null;
		try {
			
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			
			System.out.println("Conectado");
			
			session.save(libro);
			
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
			
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return false;
		}
	}

	@Override
	public boolean eliminar(Libro libro) {
		Session session= null;
		try {
			
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			
			System.out.println("Conectado");
			
			session.delete(libro);
			
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
			
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return false;
		}
	}

	@Override
	public boolean actualizar(Libro libro) {
		Session session= null;
		try {
			
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			
			System.out.println("Conectado");
			
			session.update(libro);
			
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return true;
			
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   return false;
		}
	}

	@Override
	public Libro seleccionar(int idLibro) {
		Session session= null;
		Libro libro;
		try {
			
			session= HibernateUtil.getSessionFactoty().openSession();
			session.beginTransaction();
			
			System.out.println("Conectado");
			
			libro = (Libro)session.get(Libro.class, idLibro);
			System.out.println("titulo del libro "+libro.getTitulo());
			
			session.getTransaction().commit();
			HibernateUtil.shutdown();
			return libro;
			
			
			
		} catch (Exception e) {
		   if(session!=null){
			   session.getTransaction().rollback();
			   HibernateUtil.shutdown();
		   }
		   System.out.println("errorrrr " + e);
		   return null;
		}
	}

}
