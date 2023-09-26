package com.educacionit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.eduacionit.conf.MySQLConnection;
import com.educacionit.model.User;

public class UserDao implements Dao<User, Long>, MySQLConnection {
	
	private PreparedStatement psGetByID = null;
	private PreparedStatement psAdd = null;
	private PreparedStatement psGetAll = null;
	private PreparedStatement psDel = null;
	private PreparedStatement psUpd = null;

	@Override
	public User getById(Long id) {
		User user = null;
		
		try {
			psGetByID = conectarDB().prepareStatement("SELECT id, nombreApellido, mail, direccion, clave "
					+ "FROM users "
					+ "WHERE id = ?;");
			psGetByID.setLong(1, id);
			ResultSet resultado = psGetByID.executeQuery();
			if(resultado.next()) {
				user = new User();
				user.setNombreApellido(resultado.getString("nombreApellido"));
				user.setId(resultado.getLong("id"));
				user.setClave(resultado.getString("clave"));
				user.setDireccion(resultado.getString("direccion"));
				user.setMail(resultado.getString("mail"));
				System.out.println("Usuario encontrado:" + user.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> getAll() {
		List<User> usersList = new ArrayList<User>();
		
		try {
			psGetAll = conectarDB().prepareStatement("SELECT id, nombreApellido, mail, direccion, clave "
					+ "FROM users");
			ResultSet resultado = psGetAll.executeQuery();
			while(resultado.next()) {
				User userAux = new User();
				userAux.setNombreApellido(resultado.getString("nombreApellido"));
				userAux.setDireccion(resultado.getString("direccion"));
				userAux.setMail(resultado.getString("mail"));
				userAux.setClave(resultado.getString("clave"));
				userAux.setId(resultado.getLong("id"));
				usersList.add(userAux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return usersList;
	}

	@Override
	public Boolean add(User user) {
		Boolean resultado = false;
		try {
			psAdd = conectarDB().prepareStatement("INSERT INTO users (nombreApellido, direccion, mail, clave) "
					+ " VALUES (?,?,?,MD5(?));");
			psAdd.setString(1, user.getNombreApellido());
			psAdd.setString(2, user.getDireccion());
			psAdd.setString(3, user.getMail());
			psAdd.setString(4, user.getClave());
			if(psAdd.executeUpdate()==1) {
				resultado = true;
				System.out.println("Usuario generado!:"+ user.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Boolean del(User user) {
		Boolean resultado = false;
		try {
			if(psDel == null) {
				psDel = conectarDB().prepareStatement("DELETE FROM users WHERE id = ? ");
			}
			psDel.setLong(1, user.getId());
			if(psDel.executeUpdate()==1) {
				resultado = true;
				System.out.println("usuario eliminado:" + user.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Boolean upd(User user) {
		Boolean resultado = false;
		try {
			if(psUpd == null) {
				psUpd = conectarDB().prepareStatement("UPDATE users SET nombreApellido=?, mail=?, direccion=?, clave=MD5(?) "
						+ " WHERE id = ?");
			}
			psUpd.setString(1, user.getNombreApellido());
			psUpd.setString(2, user.getMail());
			psUpd.setString(3, user.getDireccion());
			psUpd.setString(4, user.getClave());
			psUpd.setLong(5, user.getId());
			if (psUpd.executeUpdate() == 1) {
				resultado = true;
				System.out.println("Se actualizó el usuario: "+ user.toString());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
