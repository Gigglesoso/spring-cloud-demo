package com.dkd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DynamicWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicWebServiceApplication.class, args);
	}
}
