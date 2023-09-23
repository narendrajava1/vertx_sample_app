package com.naren;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import io.vertx.core.Verticle;
import io.vertx.core.Vertx;

@Component
public class VetaDeploy {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@PostConstruct
	public void deployVerticles() {
		Map<String, Verticle> beansMap = applicationContext.getBeansOfType(Verticle.class);
		for (Verticle verticle : beansMap.values()) {
			applicationContext.getBean(Vertx.class).deployVerticle(verticle);
			System.out.println("verticle deployed "+ verticle.getClass().getName());
		}
	}

}
