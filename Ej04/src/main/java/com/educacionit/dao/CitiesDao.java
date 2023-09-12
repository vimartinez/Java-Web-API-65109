package com.educacionit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.educacionit.model.City;

public class CitiesDao implements DAO<City, Long>, MySQLConnection {
	
	private String getById = "SELECT id, id_state, name FROM cities WHERE id = ?";
	
	private PreparedStatement psCities = null;

	@Override
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean add(City t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean upd(City t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean del(City t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City getById(Long id) {
		City cityAux = null;
		try {
			psCities = conectarDB().prepareStatement(getById);
			psCities.setLong(1, id);
			ResultSet resultado = psCities.executeQuery();
			if(resultado.next()) {
				cityAux = new City();
				cityAux.setId(resultado.getLong("id"));
				cityAux.setId_state(resultado.getLong("id_state"));
				cityAux.setName(resultado.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cityAux;
	}

}
