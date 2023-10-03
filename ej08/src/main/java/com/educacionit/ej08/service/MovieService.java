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

}
