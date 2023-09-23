package com.naren.service;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;

public class DeliveryScheduler {
	private static volatile Integer counter=1;
	private static Handler<Long> action;
	Vertx vertx=Vertx.vertx();
	
	public void startScheduler() {
		action=id->{
			if(counter<=5) {
				System.out.println("this is from the "+counter++);
			}
			System.out.println("this is from the "+counter++);
		};
		System.out.println("this is from the "+counter++);
		vertx.setPeriodic(1000 , (action));
	}
}
