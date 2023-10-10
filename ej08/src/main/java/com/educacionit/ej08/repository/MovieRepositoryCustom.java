package com.educacionit.ej08.repository;

import java.util.List;

import com.educacionit.ej08.model.Movie;

public interface MovieRepositoryCustom {
	
	List<Movie> getAllMoviesByYearCriteria(Integer year);
	
	List<Movie> getAllMoviesByYearAndDuration(Integer year, Integer duration);

}
