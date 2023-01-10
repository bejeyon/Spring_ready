package com.example.test;

public class HelloService implements IHelloService {
	
	@Override	// compiler에게 보내는 부가정보
	public String sayHello(HelloVO vo) {
		String result = "";
		
		String name = vo.getName();
		String lang = vo.getLang();
		
		// LocalDate now = LocalDate.now();
		
		if (lang.equals("ko")) {
			result = "안녕하세요. " + name + "님";
		} else {
			result = "Hello. " + name + "님";
		}
		
		// result += " today : " + now;
		
		return result;
	}
}
