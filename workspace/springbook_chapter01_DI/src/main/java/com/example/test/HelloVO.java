package com.example.test;

// Bean
public class HelloVO {	// 재활용하고 싶으면 상속받아서 메소드만 추가하면 됨. // 거의 표준적인 코딩 // getter setter 디자인 패턴
	private String name;
	private String lang;

	public HelloVO() {	// 변수 초기화는 생성자에서
		name = "홍길동";
		lang = "ko";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {	// data filtering 감안해야. 열거형으로. exception 많이 사용.
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "HelloVO [name=" + name + ", lang=" + lang + "]";
	}
	
}
