package br.com.projetojpahibernate.dao;

import javax.persistence.EntityManager;

abstract class AbstractDAO {
	
   public abstract EntityManager getEntityManager();
    
}
