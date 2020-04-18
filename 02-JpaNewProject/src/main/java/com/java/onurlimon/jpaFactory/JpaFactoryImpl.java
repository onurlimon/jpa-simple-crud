package com.java.onurlimon.jpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaFactoryImpl implements IJpaFactory{

	private EntityManager entityManager = null;
	
	public EntityManager getEntityManager() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		this.entityManager = factory.createEntityManager();
		
		return entityManager;
	}

	public EntityTransaction getTransaction() {
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		return transaction;
	}

	
}
