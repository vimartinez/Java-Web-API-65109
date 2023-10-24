package com.educacionit.ej10.controller;

import com.educacionit.ej10.model.Car;
import com.educacionit.ej10.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/V1/")
    @Operation(summary = "Devuelve un listado de autos", description = "No tiene parámetros de entrada y no está paginado")
    public @ResponseBody List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("/V2/")
    @Operation(summary = "Devuelve un listado de autos paginado", description = "Debe enviar número de página y cantidad de items por página")
    public ResponseEntity<Page<Car>> getAllCarsPaginated(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Car> cars = carService.getAllCarsPaginated(pageable);

        return new ResponseEntity<>(cars, HttpStatus.OK);
    }


}
