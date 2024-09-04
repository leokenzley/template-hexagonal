package com.leokenzley.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TemplateJavaHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateJavaHexagonalApplication.class, args);
	}

}
