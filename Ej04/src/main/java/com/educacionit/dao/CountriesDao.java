package com.educacionit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.educacionit.model.Country;


public class CountriesDao implements DAO<Country, Long>, MySQLConnection {

	private String getAll = "SELECT id, name FROM countries;";
	private String getById = "SELECT id, name FROM countries WHERE id = ?";
	
	private PreparedStatement psCountries = null;
	
	@Override
	public List<Country> getAll() {
		
		List<Country> listCountries = new ArrayList<Country>();
		
		try {
			psCountries = conectarDB().prepareStatement(getAll);
			ResultSet resultado = psCountries.executeQuery();
			while(resultado.next()) {
				Country countryAux = new Country();
				countryAux.setId(resultado.getLong("id"));
				countryAux.setName(resultado.getString("name"));
				listCountries.add(countryAux);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listCountries;
	}

	@Override
	public Boolean add(Country t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean upd(Country t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean del(Country t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country getById(Long id) {
		Country countryAux = null;
		try {
			psCountries = conectarDB().prepareStatement(getById);
			psCountries.setLong(1, id);
			ResultSet resultado = psCountries.executeQuery();
			if(resultado.next()) {
				countryAux = new Country();
				countryAux.setId(resultado.getLong("id"));
				countryAux.setName(resultado.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return countryAux;
	}

}
