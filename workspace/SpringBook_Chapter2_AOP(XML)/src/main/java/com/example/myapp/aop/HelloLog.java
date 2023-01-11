package com.example.myapp.aop;

public class HelloLog {
	public static void log() {	// 객체 생성 없이 불러올 수 있는 util class : static method. class method <-> instance method
		System.out.println(">>>Log : " + new java.util.Date());
	}
}
