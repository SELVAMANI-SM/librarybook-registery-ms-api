package com.librarybooksystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LibraybooksystemRegisteryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraybooksystemRegisteryMsApiApplication.class, args);
	}

}
