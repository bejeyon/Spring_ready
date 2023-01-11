package com.example.myapp.aop;
// 출력 부분
public class HelloController {
	// 1)
//	IHelloService helloService = new HelloService();
//	
//	public void hello(String name) {
//		System.out.println("HelloController : " + helloService.sayHello(name));
//	}
	
	// 2) Constructor DI
	IHelloService helloService;
	
	public HelloController() {}
	
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}
		
	public void hello(String name) {
		System.out.println("HelloController : " + helloService.sayHello(name));
	}
	
	public void goodbye(String name) {
		System.out.println("HelloController : " + helloService.sayGoodbye(name));
	}
	
//	// 3) setter DI
//	IHelloService helloService;
//	
//	public HelloController() {}
//	
//	public void setHelloService(IHelloService helloService) {
//		this.helloService = helloService;
//	}
//	
//	public void hello(String name) {
//		System.out.println("HelloController : " + helloService.sayHello(name));
//	}
}
