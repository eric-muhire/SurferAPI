package com.grupparbete.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.grupparbete.PostControllers"})
public class SurferApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurferApplication.class, args);
	}

}
