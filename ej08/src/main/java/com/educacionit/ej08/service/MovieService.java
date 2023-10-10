package com.educacionit.ej08.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.ej08.model.Movie;
import com.educacionit.ej08.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;

	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	public void addMovie(Movie movie) {
		movieRepository.save(movie);
	}

	public Optional<Movie> getMovieById(Long idMovie) {
		return movieRepository.findById(idMovie);
	}

	public void delMovie(Long idMovie) {
		  movieRepository.deleteById(idMovie);
		
	}

	public void updMovie(Movie movie) {
		// buscar si existe el objeto a modificar
		// verificar uno a uno los atributos y actualizar solo aquellos que se recibieron
		movieRepository.save(movie);
	}

	public List<Movie> getAllMoviesByYear(Integer year) {
		return movieRepository.findByYearOfRelease(year);
	}

	public List<Movie> getAllMoviesByYearLessThan(Integer year) {
		return movieRepository.findByYearOfReleaseLessThan(year);
	}

	public List<Movie> getAllMoviesByYearNative(Integer year) {
		return movieRepository.getAllMoviesByYearNative(year);
	}

	public List<Movie> getAllMoviesByYearCriteria(Integer year) {
		return movieRepository.getAllMoviesByYearCriteria(year);
	}

	public List<Movie> getAllMoviesByYearAndDurationCriteria(Integer year, Integer duration) {
		return movieRepository.getAllMoviesByYearAndDuration(year, duration);
	}

}
