package com.educacionit.ws;

import java.util.List;

import com.educacionit.dto.CiudadesDTO;
import com.educacionit.service.CiudadesService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CiudadesWs {
	
	CiudadesService ciudadesService = new CiudadesService();

	@WebMethod(operationName="statesList")
	public List<CiudadesDTO> getAllStates(){
		return ciudadesService.getAllStates();
		
	}
	
	@WebMethod(operationName="getCity")
	public CiudadesDTO getCityById(@WebParam(name="CityId")Long cityId) {
		return ciudadesService.getCityById(cityId);
		
	}
}
