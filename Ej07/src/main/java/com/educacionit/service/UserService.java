package com.educacionit.service;

import java.util.List;

import com.educacionit.dao.UserDao;
import com.educacionit.model.User;

public class UserService {
	
	UserDao userDao = new UserDao();

	public User getUserById(Long id) {
		return userDao.getById(id);
	}

	public boolean addUser(User user) {
		return userDao.add(user);
	}

	public List<User> getAll() {
		return userDao.getAll();
	}

	public boolean del(User user) {
		return userDao.del(user);
	}

	public boolean upd(User user) {
		//return userDao.upd(user);
		//1 verificar si el usuario existe
		//2 si existe verificar los atributos recibidos y solo actualizar los que vinieron
		User userAux = getUserById(user.getId());
		if (userAux == null) {
			System.out.println("No existe un usuario con id"+user.getId());
			return false;
		}
		if(user.getClave()== null) user.setClave(userAux.getClave());
		if(user.getDireccion()==null) user.setDireccion(userAux.getDireccion());
		if(user.getMail()==null) user.setMail(userAux.getMail());
		if(user.getNombreApellido()==null) user.setNombreApellido(userAux.getNombreApellido());
		
		return userDao.upd(user);
	}

}
