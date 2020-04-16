package com.cap.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeAdd1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAdd1Application.class, args);
	}

}
