package com.grupparbete.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
@ComponentScan({"com.grupparbete.Controllers","com.grupparbete.repositories","com.grupparbete.services","com.grupparbete.requests"})
public class SurferApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurferApplication.class, args);
	}


		@Bean
		public Docket swaggerConfiguration() {
			//return a prepared docket instance
			return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.paths(PathSelectors.regex("/api.*"))
		.apis(RequestHandlerSelectors.basePackage("com.grupparbete"))
		.build();
		}
		private ApiInfo apiDetails(){
			return new ApiInfo(
					"Surfer API",
					"Api for finding out information before going to the beach for surfing",
					"1.0",
					"Free to use",
					new springfox.documentation.service.Contact("Eric Muhire,Mousaab Yedjour,John Moberg", "N/A" , "N/A"),
					"Free of charge",
					"N/A",
					Collections.emptyList());

		}
	}

