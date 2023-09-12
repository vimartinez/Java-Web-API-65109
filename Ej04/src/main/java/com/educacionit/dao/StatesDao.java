package com.educacionit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.educacionit.model.State;

public class StatesDao implements DAO<State, Long>, MySQLConnection {
	
	private String getAll = "SELECT id, id_country, name FROM states";
	private String getById = "SELECT id, id_country, name FROM states WHERE id = ?";
	
	private PreparedStatement psStates = null;

	@Override
	public List<State> getAll() {
		
		List<State> listStates = new ArrayList<State>();
		
		try {
			psStates = conectarDB().prepareStatement(getAll);
			ResultSet resultado = psStates.executeQuery();
			while(resultado.next()) {
				State stateAux = new State();
				stateAux.setId(resultado.getLong("id"));
				stateAux.setId_country(resultado.getLong("id_country"));
				stateAux.setName(resultado.getString("name"));
				listStates.add(stateAux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listStates;
	}

	@Override
	public Boolean add(State t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean upd(State t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean del(State t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State getById(Long id) {
		State stateAux = null;
		try {
			psStates = conectarDB().prepareStatement(getById);
			psStates.setLong(1, id);
			ResultSet resultado = psStates.executeQuery();
			if(resultado.next()) {
				stateAux = new State();
				stateAux.setId(resultado.getLong("id"));
				stateAux.setId_country(resultado.getLong("id_country"));
				stateAux.setName(resultado.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stateAux;
	}

}
