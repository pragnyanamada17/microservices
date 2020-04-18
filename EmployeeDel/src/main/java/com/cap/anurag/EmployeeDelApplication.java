package com.cap.anurag;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient

public class EmployeeDelApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDelApplication.class, args);
	}

}
