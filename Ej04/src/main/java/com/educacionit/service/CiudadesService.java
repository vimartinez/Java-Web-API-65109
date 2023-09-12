package com.educacionit.service;


import java.util.ArrayList;
import java.util.List;

import com.educacionit.dao.CitiesDao;
import com.educacionit.dao.CountriesDao;
import com.educacionit.dao.StatesDao;
import com.educacionit.dto.CiudadesDTO;
import com.educacionit.model.City;
import com.educacionit.model.Country;
import com.educacionit.model.State;

public class CiudadesService {
	
	private CountriesDao countriesDao = new CountriesDao();
	private StatesDao statesDao = new StatesDao();
	private CitiesDao citiesDao = new CitiesDao();

	public List<CiudadesDTO> getAllStates() {
		
		List<Country> countries = countriesDao.getAll();
		List<State> states = statesDao.getAll();
		
		List<CiudadesDTO> countriesWithSates = new ArrayList<CiudadesDTO>();
		
		for (Country country : countries) {
			for (State state : states) {
				if(country.getId() == state.getId_country()) {
					CiudadesDTO ciudadDtoAux = new CiudadesDTO();
					ciudadDtoAux.setCityName(state.getName());
					ciudadDtoAux.setCountryName(country.getName());
					countriesWithSates.add(ciudadDtoAux);
				}				
			}
			
		}
		
		return countriesWithSates;
	}

	public CiudadesDTO getCityById(Long cityId) {
		
		CiudadesDTO ciudad = new CiudadesDTO();
		City cityAux = citiesDao.getById(cityId);
		if (cityAux != null) {
			ciudad.setCityName(cityAux.getName());
			State stateAux = statesDao.getById(cityAux.getId_state());
			if(stateAux != null) {
				ciudad.setStateName(stateAux.getName());
				Country countryAux = countriesDao.getById(stateAux.getId_country());
				if(countryAux != null) ciudad.setCountryName(countryAux.getName());
			}
		}
		
		return ciudad;
	}

}
