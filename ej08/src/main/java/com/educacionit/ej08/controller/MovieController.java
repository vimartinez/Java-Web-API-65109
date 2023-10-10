package com.educacionit.ej08.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@DeleteMapping(path="/{idMovie}", produces="application/json")
	@Operation(summary="Borra una película de la Base de Datos", description="Debe enviar el id de la película a borrar",  tags= {"Pelis"})
	public @ResponseBody void delMovie(@Parameter(description="id de la película a borrar") @PathVariable("idMovie") Long idMovie) {
		movieService.delMovie(idMovie);
	}
	
	
	@PutMapping(path="/", produces="application/json")
	@Operation(summary="Permite modificar una película", description="Debe enviar el objeto a modificar, no se puede modificar el id", tags= {"Pelis"})
	public @ResponseBody void updMovie(Movie movie) {
		movieService.updMovie(movie);
	}
	
	@GetMapping(value="/year/{year}")
	@Operation(summary="Devuelve un listado de películas según el año de estreno con Derived Query", description="Debe enviar el año de la peli", tags= {"Derived Querys"})
	public @ResponseBody List<Movie> getAllMoviesByYear(@Parameter(description="Año a buscar") @PathVariable("year") Integer year){
		return movieService.getAllMoviesByYear(year);
		
	}
	
	@GetMapping(value="/yearlessthan/{year}")
	@Operation(summary="Devuelve un listado de películas que se estrenaron antes del año indicado", description="Debe enviar el a filtrar", tags= {"Derived Querys"})
	public @ResponseBody List<Movie> getAllMoviesByYearLessThan(@Parameter(description="Año a buscar") @PathVariable("year") Integer year){
		return movieService.getAllMoviesByYearLessThan(year);
		
	}
	
	@GetMapping(value="yearnative/{year}")
	@Operation(summary="Devuelve un listado de películas de un año con Native Query", description="Listado con native query", tags= {"Native Query"})
	public @ResponseBody List<Movie> getAllMoviesByYearNative(@Parameter(description="Año a buscar") @PathVariable("year") Integer year){
		return movieService.getAllMoviesByYearNative(year);
		
	}
	
	@GetMapping(value="yearcriteria/{year}")
	@Operation(summary="Devuelve un listado de películas de un año con Critera", description="Listado con criteria", tags= {"Criteria"})
	public @ResponseBody List<Movie> getAllMoviesByYearCriteria(@Parameter(description="Año a buscar") @PathVariable("year") Integer year){
		return movieService.getAllMoviesByYearCriteria(year);
		
	}
	
	@GetMapping(value="yearandduration/")
	@Operation(summary="Devuelve un listado de películas por año y duración Critera", description="Listado con criteria", tags= {"Criteria"})
	public @ResponseBody List<Movie> getAllMoviesByYearAndDurationCriteria(@RequestParam("year") Integer year, @RequestParam("duration") Integer duration){
		return movieService.getAllMoviesByYearAndDurationCriteria(year, duration);
		
	}

}
