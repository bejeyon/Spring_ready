package com.example.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloController {
	// HelloService helloService = new HelloService();
	// HelloServiceV2 helloService = new HelloServiceV2();	// service에 의존성의 문제 발생 -> service단 고치면 여기서도 고쳐야 됨.
	// IHelloService helloService = new HelloServiceV2();	// HelloServiceV2는 IHelloService가 보유한 sayHello() 메소드만 만족하면 됨 -> 만족하는지 컴파일러한테 검사 요청하는 것.
	
	// 5) 유지/보수
	IHelloService helloService;	// Interface를 공통 타입으로 사용. method만 검사 및 보장.
	
//	public HelloController() {
//		String mode = "Test";
//		
//		if (mode.equals("Test")) {
//			helloService = new HelloServiceV2();
//		} else {
//			helloService = new HelloService();
//		}
//	}
	
	// 생성자 오버로딩 이용한 초기화	// 이것도 일종의 디자인 패턴 중 하나.
	public HelloController() {
		//helloService = new HelloService();
		
		// 스프링 이용
		AbstractApplicationContext context = new GenericXmlApplicationContext("apptest-config.xml");	// spring bean 컨테이너에 등록된 객체 생성 => 제어반전(IoC) : 객체 생성 주도권을 스프링에게 넘김. singleton
		// helloService = context.getBean("helloService", HelloService.class);	// 의존성 주입(DI) : 컨트롤러 입장에서 주입당하는 것
		helloService = context.getBean("helloService", IHelloService.class);	// required type 명시. type casting 시 interface type으로 casting. 유연성 확보. method만 맞춰주면 됨.
		
	}
	
	public HelloController(String mode) {
		if (mode.equals("Test")) {
			helloService = new HelloServiceV3();
		} else {
			helloService = new HelloService();
		}
	}
	
	
	public void hello(HelloVO vo) {
		System.out.println("HelloController : " + helloService.sayHello(vo));
	}
}
