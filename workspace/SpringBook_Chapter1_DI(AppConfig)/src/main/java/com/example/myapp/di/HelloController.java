package com.example.myapp.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {	// helloController라는 이름으로 등록됨. 마음에 안 들면 @Controller(value="")로 고치기.

	@Autowired	// 이거 쓰려면 @Controller로 꼭 등록 해야됨. @Controller 생략 불가. @Controller는 이 클래스가 스프링 프레임워크가 관리할 대상이라고 알려주는 것.
	IHelloService helloService;	// 1) Type 이용해서 자동 주입 (getBean() 생략.) 원래는 new 하거나 getBean을 써야 됨.
								// 4) bean 등록 -> 우선권 가짐
	
//	@Autowired
//	IHelloService niceService;	// 2) 멤버필드명을 bean id와 같게(class NiceService -> bean id niceService) 

//	@Autowired
//	@Qualifier("niceService")
//	IHelloService helloService;	// 3) @Qualifier 이용
	
	public HelloController() {} 
	
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
//		this.niceService = helloService;
	}

	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
//		this.niceService = helloService;
	}
	
	public void hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
//		System.out.println("HelloController : " + niceService.sayHello(name));
	}
}