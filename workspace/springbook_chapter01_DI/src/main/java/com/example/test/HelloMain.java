package com.example.test;

import java.time.LocalDate;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 안녕하세요. 홍길동님 출력 : 현재를 위한 코딩
		System.out.println("안녕하세요. 홍길동님");
		
		// 2) 홍길동 => 변수
		String name = "홍길동";
		System.out.println("안녕하세요. " + name + "님");	// 여기까지가 절차지향형
		
		// 3) 분리 : MVC의 기본. : 미래를 위한 코딩
		// 변수 (VO)
		name = "홍길동";
		String lang = "ko";
		
		// 로직 (service)
		String result = "";
		if (lang.equals("ko")) {
			result = "안녕하세요. " + name + "님";
		} else {
			result = "Hello. " + name + "님";
		}
		
		// 출력 (controller)
		System.out.println(result);
		
		// 4) MVC
		HelloVO vo = new HelloVO();
		vo.setName("홍길동");
		vo.setLang("ko");
		
		HelloController helloController = new HelloController();
		helloController.hello(vo);
		
		// 5) 유지/보수 (Interface , HelloServiceV2)
		// controller가 service에 의존성 문제 발생
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		HelloController helloController01 = new HelloController();
		helloController01.hello(vo);
		
		HelloController helloController02 = new HelloController("Test");
		helloController02.hello(vo);
		
		// 6) 스프링을 이용해서 서비스 선택
		// 1. 환경설정 - 스프링에 서비스 등록(id 별 class 지정)
		// 2. resource 폴더 : apptest-config.xml
		HelloController helloController03 = new HelloController();
		helloController01.hello(vo);
	}

}
