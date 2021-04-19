package com.grupparbete.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.grupparbete.Controllers","com.grupparbete.repositories","com.grupparbete.services","com.grupparbete.requests"})
public class SurferApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurferApplication.class, args);
	}

}
