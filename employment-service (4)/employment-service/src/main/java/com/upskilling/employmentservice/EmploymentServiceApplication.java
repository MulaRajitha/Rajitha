package com.upskilling.employmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication

@EnableFeignClients
@OpenAPIDefinition(
		info=@Info(
				title= "Springboot Rest API Documentation",
				description="swagger",
				version="v1.0",
				contact = @Contact(
						name = "Dhatri",
						email = "dhatri@gmail.com"
//						url = "https://www.dhatri.net"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.dhatri.net/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Employee Service Documentation",
				url = "https://www.dhatri.net/user_management.html"

		)
)
public class EmploymentServiceApplication {
	
//	@Bean
//	public RestTemplate restTemplate(){
//		return  new RestTemplate();
//	}


//	@Bean
//	public WebClient webClient(){
//		return WebClient.builder().build();
//	}

	public static void main(String[] args) {
		SpringApplication.run(EmploymentServiceApplication.class, args);
	}

}
