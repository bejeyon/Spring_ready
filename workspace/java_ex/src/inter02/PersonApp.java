package inter02;

public class PersonApp {

	public static void main(String[] args) {
		// Person 구현 클래스 생성 후 "걷는다"라는 메세지를 출력하세요.
//		Person person = () -> System.out.println("걷는다");
//		person.walk();
		
		PersonClass person1 = new PersonClass();
		person1.walk();
		
		System.out.println("걷는다");
		
		Person person2 = new PersonClass();
		person2.walk();
		
		Person person3 = new Person() {

			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("걷는다");
			}
			
		};	// 무명class. anonymous class
		
		person3.walk();
		
		Person person4 = () -> System.out.println("걷는다");
		person4.walk();
	}

}
