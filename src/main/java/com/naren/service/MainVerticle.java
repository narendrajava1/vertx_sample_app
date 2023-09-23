package com.naren.service;

import org.springframework.stereotype.Component;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
@Component
public class MainVerticle extends AbstractVerticle {
	
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
	  DeliveryScheduler deliveryScheduler=new DeliveryScheduler();
    vertx.createHttpServer().requestHandler(req -> {
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x!");
    }).listen(8888, http -> {
      if (http.succeeded()) {
        startPromise.complete();
        System.out.println("HTTP server started on port 8888");
        deliveryScheduler.startScheduler();
      } else {
        startPromise.fail(http.cause());
      }
    });
  }
}
