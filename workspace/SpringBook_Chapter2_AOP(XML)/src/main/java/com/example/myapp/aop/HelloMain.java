package com.example.myapp.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 실행 부분 == HelloTest
public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0)
		//System.out.println("Hello~~~홍길동");
		
		
		// 1)
//		HelloController hellocontroller = new HelloController();
//		hellocontroller.hello("홍길동");
		
		// 2) Constructor DI
//		IHelloService helloService = new HelloService();
//		HelloController hellocontroller = new HelloController(helloService);	// 의존성 발생
//		hellocontroller.hello("홍길동");
		
		// 3) setter DI
//		IHelloService helloService = new HelloService();
//		HelloController hellocontroller = new HelloController();	// 의존성 발생
//		hellocontroller.setHelloService(helloService);	// 주입(주입보다는 주소가 넘어가는 것이지만)
//		hellocontroller.hello("홍길동");
		
		// 4) spring DI, xml
//		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
//		
//		context.close();
		
		// 5) spring bean 사용
//		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
//		HelloController controller = context.getBean("helloController", HelloController.class);
//		controller.hello("홍길동");
//		
//		context.close();
		
		// 6) spring bean setter 사용
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		HelloController controller = context.getBean("helloController", HelloController.class);
		controller.hello("홍길동");
		controller.goodbye("홍길동");
		
		context.close();
	}

}
