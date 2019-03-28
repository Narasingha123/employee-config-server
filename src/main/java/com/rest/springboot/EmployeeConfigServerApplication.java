package com.rest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



// http://localhost:8888/application/default

// It will fetch all global properties

@SpringBootApplication
@EnableConfigServer
public class EmployeeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConfigServerApplication.class, args);
	}

}
