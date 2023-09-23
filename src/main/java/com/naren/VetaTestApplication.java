package com.naren;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naren.config.SpringConfig;

//@SpringBootApplication
public class VetaTestApplication {

	public static void main(String[] args) {
//		SpringApplication.run(VetaTestApplication.class, args);
		ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("app started");
	}

}
