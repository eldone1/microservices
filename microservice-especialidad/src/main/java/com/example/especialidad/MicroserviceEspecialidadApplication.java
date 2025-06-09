package com.example.especialidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceEspecialidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEspecialidadApplication.class, args);
	}

}
