package com.educacionit.dao;

import java.util.List;

public interface DAO<T, k> {
	
	List<T> getAll();
	
	Boolean add(T t);
	
	Boolean upd(T t);
	
	Boolean del(T t);
	
	T getById(k id);
	
}
