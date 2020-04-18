package com.java.onurlimon.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.java.onurlimon.jpaFactory.IJpaFactory;
import com.java.onurlimon.jpaFactory.JpaFactoryImpl;
import com.java.onurlimon.model.Book;

public class BookRepositoryImpl implements IBookRepository {

	private IJpaFactory factory = new JpaFactoryImpl();

	private EntityManager entityManager = factory.getEntityManager();

	private EntityTransaction transaction = entityManager.getTransaction();

	public void save(Book book) {

		transaction.begin();

		entityManager.persist(book);

		transaction.commit();

	}

	public void delete(Book book) {
		
		transaction.begin();
		
		entityManager.remove(book);
		
		transaction.commit();

	}

	public Book find(int id) {
		
		transaction.begin();
		
		Book foundedBook = entityManager.find(Book.class, id);
		
		transaction.commit();
		
		return foundedBook;
	}

	public Book update(Book book) {
		
		transaction.begin();
		
		Book updatedBook = entityManager.merge(book);
		
		transaction.commit();
		
		return updatedBook;
	}

}
