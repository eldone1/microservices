package com.microservice.especialidad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceEspecialidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEspecialidadApplication.class, args);
	}

}
