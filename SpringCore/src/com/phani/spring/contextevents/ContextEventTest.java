package com.phani.spring.contextevents;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextEventTest {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext("contextevent.xml");
		context.start();
	}

}
