package com.educacionit.ej10.repository;

import com.educacionit.ej10.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CarRepository extends JpaRepository<Car,Long>, JpaSpecificationExecutor<Car> {
}
