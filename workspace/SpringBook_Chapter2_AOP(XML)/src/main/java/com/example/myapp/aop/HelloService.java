package com.example.myapp.aop;
// data 부분
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		// 1) 코드
		// System.out.println(">>>Log : " + new java.util.Date());
		
		// 2) oop 코드 분리 - 재활용
		// HelloLog.log();
		
		// 3) HelloServiceProxy 클래스(메서드 실행순서 지정) 이용
		
		System.out.println("HelloService.sayHello() 메서드 실행");
		String message = "Hello~~~" + name;
		
		return message;
	}

	@Override
	public String sayGoodbye(String name) {
		System.out.println("HelloService.sayGoodbye() 메서드 실행");
		String message = "Goodbye~~~" + name;
		
		return message;
	}

}
