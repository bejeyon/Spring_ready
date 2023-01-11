package com.corderby.myapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context;	// spring bean container에 객체 담아줌
		context = new GenericXmlApplicationContext("application-config.xml");
		
		EmpController controller = context.getBean("empController", EmpController.class);
		controller.printInfo();
		context.close();

	}

}
