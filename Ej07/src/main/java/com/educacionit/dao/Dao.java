package com.educacionit.dao;

import java.util.List;

public interface Dao <T,k>{

	T getById(k id);
	
	List<T> getAll();
	
	Boolean add(T t);
	
	Boolean del(T t);
	
	Boolean upd(T t);
}
