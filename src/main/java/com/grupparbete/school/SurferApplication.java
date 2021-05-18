package com.grupparbete.school;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Collections;

@Slf4j
@SpringBootApplication
@EnableSwagger2
@ComponentScan({"com.grupparbete.Controllers","com.grupparbete.services","com.grupparbete.requests","com.grupparbete.AspectedOrientedProgramming"})
@EntityScan("com.grupparbete.entities")
@EnableJpaRepositories("com.grupparbete.repositories")
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
		.build()
		.apiInfo(apiDetails());
		}
		private ApiInfo apiDetails(){
			return new ApiInfo(
					"Surfer API",
				
							"The API allow users (surfers) to post, read, update, delete and comment about wheather on different beaches around the World.",
					"1.0.0",
					"http://example.com/terms/",
					new springfox.documentation.service.Contact("Developer of Surfer API", "https://www.jensenyh.se/vara-utbildningar/cloud-amazon-webbservice" , "developer"),

					"Apache 2.0",
					"http://www.apache.org/licenses/LICENSE-2.0.html",
					Collections.emptyList());

		}
	}

