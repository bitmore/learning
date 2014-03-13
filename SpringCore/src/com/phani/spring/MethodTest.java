package com.phani.spring;

public class MethodTest {
	
	private String name;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void testInitMethod(){
		System.out.println("MethodTest testInitMethod "+getName());
	}
	public void testDestroyMethod(){
		System.out.println("MethodTest testDestroyMethod "+getName());
	}
}
