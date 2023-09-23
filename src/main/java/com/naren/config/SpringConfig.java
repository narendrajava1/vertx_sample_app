package com.naren.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.vertx.core.Vertx;

@Configuration
@ComponentScan({"com.naren","com.naren.service"})
public class SpringConfig {
	
	@Bean
	public Vertx vertx() {
		return Vertx.vertx();
	}
	
//	@Bean
//	public Router router(Vertx vertx) {
//		Router.rou
//		return 
//	}

}
