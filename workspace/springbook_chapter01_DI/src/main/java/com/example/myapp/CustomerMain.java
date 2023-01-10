package com.example.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		Customer customer = context.getBean(Customer.class);
		
		System.out.println(customer);	// customer의 toString 호출됨
		
		Person person1 = context.getBean(Person.class);
		Person person2 = context.getBean(Person.class);
		
		System.out.println(person1 == person2);	// singleton으로 만들어진 두 객체의 주소가 같은지 확인. prototype으로 만들어진 두 객체의 주소가 다른지 확인.
	}

}
