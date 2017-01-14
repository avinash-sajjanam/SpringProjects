package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		SpringXml spring= (SpringXml) context.getBean("springxml");
		System.out.println(spring.getMessage());
	}

}
