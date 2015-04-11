package br.com.projetojpahibernate.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 
 * @author Nataniel Paiva
 * 
 * Essa é a minha entidade que vai fazer com que o 
 * Hibernate entenda que a classe turma é uma tabela 
 * em algum banco de dados e que os seus atributos são
 * as colunas dessa mesma tabela
 *
 */
@Entity
@Table(name = "tb_turma")
public class Turma {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	/**
	 * Caso não tenha-se a annotation explicada anteriormente
	 * o Hibernate vai entender que o nome exato do atributo reflete com a
	 * coluna do seu banco de dados, seja ele qual for, Oracle, postgres, mysql e etc...
	 */
	private String modulo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	

}
