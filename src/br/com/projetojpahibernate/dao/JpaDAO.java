package br.com.projetojpahibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDAO extends AbstractDAO {
	
	private EntityManagerFactory entityManager = Persistence.createEntityManagerFactory("projetoJpaHibernate");

	public EntityManager getEntityManager() {
		return entityManager.createEntityManager();
	}

}
