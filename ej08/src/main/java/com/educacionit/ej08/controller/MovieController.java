package com.educacionit.ej08.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.ej08.model.Movie;
import com.educacionit.ej08.service.MovieService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping(value="/")
	@Operation(summary="Devuelve un listado de Películas", description="No tiene parámetros de entrada, no está paginada y devuelve todas las pelis de bd", tags= {"Pelis"})
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description = "Se encontraron pelis en bd!"),
			@ApiResponse(responseCode="404", description = "No se encotraron películas en BD!")
			
	})
	public @ResponseBody List<Movie> getAllMovies(){
		return movieService.getAllMovies();
		
	}
	
	@PostMapping(value="/",produces="application/json")
	@Operation(summary="Permite ingresar una nueva película a nuestra aplicación", description="debe enviar el objeto película a ingresar", tags= {"Pelis"})
	public @ResponseBody void addMovie(Movie movie) {
		movieService.addMovie(movie);
	}
	
	@GetMapping(value="/{idMovie}")
	@Operation(summary="Devuelve una película de la base de datos", description="debe enviar el id de la película a buscar", tags= {"Pelis"})
	@ApiResponses(value= {
			@ApiResponse(responseCode="200", description = "Se encontró la película buscada!"),
			@ApiResponse(responseCode="404", description = "No existe una película con el id ingresado")
			
	})
	public @ResponseBody Optional<Movie> getMovieById(@Parameter(description="id de la película a buscar") @PathVariable("idMovie") Long idMovie){
		return movieService.getMovieById(idMovie);
		
	}

}
