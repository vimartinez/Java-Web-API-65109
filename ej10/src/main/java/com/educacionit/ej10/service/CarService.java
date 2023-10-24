package com.educacionit.ej10.service;

import com.educacionit.ej10.model.Car;
import com.educacionit.ej10.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Page<Car> getAllCarsPaginated(Pageable pageable) {
        return carRepository.findAll(pageable);
    }
}
