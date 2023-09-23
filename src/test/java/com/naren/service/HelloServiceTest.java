package com.naren.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Description;
@ExtendWith(MockitoExtension.class) 
class HelloServiceTest {

	@InjectMocks
	private HelloService helloService;
	@Mock
	private MessageService messageService;
	
	@Test
	@Description("checking the sayHello method")
	public void sayHelloTest() {
		when(messageService.sayHello(anyString())).thenReturn("Hi");
		assertEquals("Hi", helloService.sayHello());
	}

}
