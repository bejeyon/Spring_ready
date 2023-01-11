package com.example.myapp.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {

		AbstractApplicationContext context;	// spring bean container에 객체 담아줌
		context = new AnnotationConfigApplicationContext(AppConfig.class);
//		context = new GenericXmlApplicationContext("application-config.xml");
		
		HelloController controller = context.getBean("helloController", HelloController.class);
		controller.hello("JinKyoung");
		context.close();
	}
}