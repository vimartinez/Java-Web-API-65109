package com.educacionit.ej08.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacionit.ej08.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
