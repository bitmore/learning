package com.phani.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class CreationTest {
	
	public static void main(String[] args) {
		
		//beanFactoryTest();
		//classpathXmlAppContextTest();
		testConfigAppContext();
		//fileSystemContextTest();
	}
	public static void fileSystemContextTest(){
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Phanidhar/Java/software/spring_workspace/SpringCore/src/com/phani/spring/beansdef.xml");
		Person person = (Person)context.getBean("person");
		System.out.println("file context person:"+person);	
	}
	public static void classpathXmlAppContextTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beansdef.xml");
		Person person = (Person)context.getBean("person");
		System.out.println("context person:"+person);
		
	}
	public static void testConfigAppContext(){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beansdef.xml");
		Person person = (Person)context.getBean("person");
		System.out.println("context person:"+person);
		context.close();
	}
	public static void beanFactoryTest(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beansdef.xml"));
		Person person = (Person)bf.getBean("person");
		System.out.println("person:"+person.getName());
		
	}
}
