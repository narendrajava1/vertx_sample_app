package com.naren.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MessageService {
	public String sayHello(String message) {
		return message;
	}
}
