package com.stock.mvc.dao;

import java.util.List;


// cette interface permet de définir tous les méthodes dont on aura besoins
public interface IGenericDao<E> {
	
	public E save(E entity);
	
	public E update(E entity);
	
	public List<E> selectAll();
	
	public List<E> selectAll(String sortFied, String sort);
	
    public E getById(Long id);
	
	public void remove(Long id);
	
	public E findOne(String paramName, Object paramValue);
	
	public E findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	
	

}
