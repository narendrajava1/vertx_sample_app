package com.naren.service;

import javax.websocket.OnMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Autowired
	private MessageService messageService;
	
	public String sayHello() {
		String message="Hi Narendra Kumar Kolli";
		return messageService.sayHello(message);
	}
}
