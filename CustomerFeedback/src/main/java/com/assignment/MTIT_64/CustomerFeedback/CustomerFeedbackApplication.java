package com.assignment.MTIT_64.CustomerFeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CustomerFeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerFeedbackApplication.class, args);
	}

}
