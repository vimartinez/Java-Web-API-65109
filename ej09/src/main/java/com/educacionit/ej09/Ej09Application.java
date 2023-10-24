package com.educacionit.ej09;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class Ej09Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej09Application.class, args);
	}
	
	@Bean
	public OpenAPI customOpenAPI(@Value("V1") String AppVersion) {
		return new OpenAPI().info(new Info().title("Java Web API - Ej 09")
				.version(AppVersion)
				.description("API de consumo de una API externa")
				.termsOfService("http://www.google.com")
				.license(new License().name("Apache 2.0").url("http://www.google.com")));
	}

}
