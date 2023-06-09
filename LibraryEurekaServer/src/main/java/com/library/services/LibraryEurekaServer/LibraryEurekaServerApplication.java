package com.library.services.LibraryEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LibraryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryEurekaServerApplication.class, args);
	}

}
