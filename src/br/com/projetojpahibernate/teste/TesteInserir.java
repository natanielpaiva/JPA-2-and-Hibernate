package br.com.projetojpahibernate.teste;

import javax.persistence.EntityManager;

import br.com.projetojpahibernate.dao.JpaDAO;
import br.com.projetojpahibernate.entity.Turma;

/**
 * 
 * @author Nataniel Paiva
 * Essa classe vai simplesmente utlizar a JPA 
 * com a implementação Hibernate inserindo registros
 * no banco de dados projetoJpaHibernate configurado no persistence.xml
 */
public class TesteInserir {

	public static void main(String[] args) {
		
		/**
		 * Instância do EntityManager
		 */
		JpaDAO jpaDAO = new JpaDAO();
		
		EntityManager em = jpaDAO.getEntityManager();
		
		//Abrindo a transação
		em.getTransaction().begin();
		
		Turma turma = new Turma();
		
		/**
		  Até essa linha o objeto turma encontra-se
	      em um estado transient que significa que é necessário 
	      chamar o método persist para que o objeto vá para o estado
	      manager e possa ser persistido pelo banco de dados		
		*/
		turma.setModulo("Módulo 2");
		
		
		em.persist(turma);
		
		//Comitando a transação
		em.getTransaction().commit();

	}

}
