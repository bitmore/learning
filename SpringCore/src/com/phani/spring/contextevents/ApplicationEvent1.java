package com.phani.spring.contextevents;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEvent1 implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("On Application Event"+event.getTimestamp());
		
	}

}
