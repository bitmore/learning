package com.phani.spring.contextevents;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEvent1 implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent arg0) {
		
		System.out.println("ContextStartEvent onApplicationEvent");
	}

	

	
	

}
