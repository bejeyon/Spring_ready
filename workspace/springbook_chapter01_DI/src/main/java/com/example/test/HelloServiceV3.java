package com.example.test;

import java.time.LocalDate;

public class HelloServiceV3 implements IHelloService {

	@Override
	public String sayHello(HelloVO vo) {
		String result = "";
		
		String name = vo.getName();
		String lang = "en";
		
		LocalDate now = LocalDate.now();
		
		if (lang.equals("ko")) {
			result = "안녕하세요. " + name + "님";
		} else {
			result = "Hello. " + name + "님";
		}
		
		result += " today : " + now;
		
		return result;
	}

}
