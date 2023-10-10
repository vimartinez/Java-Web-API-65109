package com.educacionit.ej08.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.educacionit.ej08.model.Movie;

public class MovieRepositoryCustomImpl implements MovieRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Movie> getAllMoviesByYearCriteria(Integer year) {
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Movie> query = criteriaBuilder.createQuery(Movie.class);
		Root<Movie> root = query.from(Movie.class);
		
		List<Predicate> predicates = new ArrayList<>();
		predicates.add(criteriaBuilder.equal(root.get("yearOfRelease"), year));
		query.select(root).where(criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()])));
		
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public List<Movie> getAllMoviesByYearAndDuration(Integer year, Integer duration) {
		
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Movie> query = criteriaBuilder.createQuery(Movie.class);
		Root<Movie> root = query.from(Movie.class);
		
		List<Predicate> predicates = new ArrayList<>();
		predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("yearOfRelease"), year)));
		predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("durationInMinutes"), duration)));
		query.select(root).where(criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()])));
		
		return entityManager.createQuery(query).getResultList();
	}

}
