package com.example.myapp.aop;

// 호출 순서가 정의된 클래스
public class HelloServiceProxy extends HelloService {
	@Override
	public String sayHello(String name) {
		
		HelloLog.log();
		
		String result = super.sayHello(name);
		
		return result;
	}
}
