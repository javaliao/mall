package com.javaliao.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HomeWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeWebApplication.class, args);
	}

}
