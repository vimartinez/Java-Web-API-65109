package com.educacionit.ej09.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.ej09.dto.MovieDTO;
import com.educacionit.ej09.service.MovieFinderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/moviefinder")
public class MovieFinderController {
	
	@Autowired
	MovieFinderService movieFinderService;
	
	@Operation(summary="Devuelve un listado de películas según el nombre ingresado", description="Tenés que ingresar una parte del nombre de la película a buscar y se mostrarán los resultados")
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description="Se ejecutó la consulta correctamente"),
			@ApiResponse(responseCode="404", description="No se encontraron resultados con los valores ingresados!")
	})
	@GetMapping(value="/", produces="Application/json")
	public List<MovieDTO> getMoviesByName(@Parameter(description="Nombre de la Película a buscar") @RequestParam(value="Nombre", defaultValue="Back to the Future") String movieName){
		return movieFinderService.getMoviesByName(movieName);
		
	}

}
