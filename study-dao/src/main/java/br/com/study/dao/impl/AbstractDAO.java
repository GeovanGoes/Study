package br.com.study.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.study.dao.DAO;
import br.com.study.entities.BasicModel;

@Repository
public abstract class AbstractDAO<E extends BasicModel> implements DAO<E>{

	/**
	 * Número que identifica a classe dentro de uma execução da JVM
	 */
	private static final long serialVersionUID = 8946275501096100424L;
	
	/**
	 * Declaração da factory de entity manager
	 * */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Declaração da Class da entidade que é recebida como parâmetro
	 * */
	private Class<E> entityClass;
	
	/**
	 * Nome simples da entidade que é recebida como parâmetro
	 * */
	private String entityName;
	
	protected AbstractDAO() {
		Type genericSuperClass = this.getClass().getGenericSuperclass();
		if (genericSuperClass instanceof ParameterizedType) {
			this.entityClass = (Class<E>) ((ParameterizedType) genericSuperClass).getActualTypeArguments()[0];
			this.entityName = this.entityClass.getSimpleName();
		}else{
			this.entityClass = null;
			this.entityName = null;
		}
	}
	/**
	 * Método resposnável por criar um entity manager
	 * @author Geovan
	 * @return EntityManager
	 * */

	@Override
	public void save(E entity) {
		try {
			this.entityManager.persist(entity);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public void save(Collection<E> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<E> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E findByLongId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void physicalRemove(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(E entity) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
