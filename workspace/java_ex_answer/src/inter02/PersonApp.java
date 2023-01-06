package inter02;

public class PersonApp {

	public static void main(String[] args) {
		// Person구현 클래스 생성 후 "걷는다"라는 메시지를 출력하세요. 
		PersonClass person1 = new PersonClass();
		person1.work();
		
		System.out.println("걷는다.");
		
		Person person2 = new PersonClass();
		person2.work();
		
		Person person3 = new Person() {
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("걷는다.");
			}
		};
		
		person3.work();
		
		Person person4 = () -> System.out.println("걷는다.");
		person4.work();
		
	}

}
