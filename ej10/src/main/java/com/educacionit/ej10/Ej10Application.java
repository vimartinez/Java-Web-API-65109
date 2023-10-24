package com.educacionit.ej10;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ej10Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej10Application.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("V1") String AppVersion){
		return new OpenAPI().info(new Info().title("API Spring Autos")
				.version(AppVersion)
				.termsOfService("http://sxs")
				.license(new License().name("Apache 2.0").url("http://url")));

	}

}
