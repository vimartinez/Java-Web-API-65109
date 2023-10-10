package com.educacionit.ej08.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.educacionit.ej08.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>, MovieRepositoryCustom {

	//Derived Query
	List<Movie> findByYearOfRelease(Integer year);
	List<Movie> findByYearOfReleaseLessThan(Integer year);
	
	
	//Native Query
	@Query(nativeQuery=true, value= "SELECT id, duration_in_minutes, name, summary, year_of_release FROM movie WHERE year_of_release= :year")
	List<Movie> getAllMoviesByYearNative(Integer year);
	

}

