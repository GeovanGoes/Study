package br.com.study.dao;

import java.io.Serializable;
import java.util.Collection;
/**
 * Interface para especificar os m�todos em comum dos objetos de Data Access (DAO)
 * @author Geovan
 * @param <E>
 * Tipo da entidade com a qual o DAO ir� trabalhar
 */
public interface DAO<E> extends Serializable {
	
	/**
	 * Persiste um objeto no banco
	 * @author Geovan
	 * @param E entity
	 * */
	void save(E entity);
	
	/**
	 * Persiste uma lista de objetos no banco
	 * @author Geovan
	 * @param Collection<E> entities
	 * */
	void save (Collection<E> entities);
	
	/**
	 * Retorna todos os objetos do banco
	 * @author Geovan
	 * @return Collection<E> - lisa de uma determinada entidade  
	 * */
	Collection<E> listAll();

	/**
	 * Retorna um registro que tem o id passado como par�metro
	 * @author Geovan
	 * @param Long id - id do registro a ser buscado
	 * @return E - entidade econtrada
	 * */
	E findByLongId(Long id); 
	
	/**
	 * M�todo respons�vel por atualizar um objeto
	 * @author Geovan
	 * @param E entity
	 * */
	void update(E entity);
	
	/**
	 * M�todo respons�vel por remover fisicamente um registro do banco
	 * @author Geovan
	 * @param E entity
	 * */
	void physicalRemove(E entity);
	
	/**
	 * M�todo respons�vel por remover logicamente um registro do banco
	 * @author Geovan
	 * @param E entity
	 * */
	void remove(E entity);
}
