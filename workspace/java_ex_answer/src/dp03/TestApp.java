package dp03;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People("이름1", "주소1", 1000);
		System.out.println(p1.toString());
		
		p1.deposit(1000);
		System.out.println(p1.toString());
		
		p1.withdraw(500);
		System.out.println(p1.toString());
		
		Car car1 = new Car();
		car1.getIn(p1);
		car1.getOut(p1);
		
		People p2 = new People("이름2", "주소2", 10000);
		System.out.println(p2.toString());
		car1.getIn(p2);
		car1.getOut(p2);
		
		Bus bus100 = new Bus(100, 0, 1000);
		bus100.getIn(p1);
		bus100.getIn(p2);
		
		bus100.getOut(p2);
		
		p1.deposit(10000);
		
		Student s1 = new Student("학생1", "주소3", 10000, "학교1", 1, 0.1);
		System.out.println(s1.toString());
		
		bus100.getIn(s1);
		
	}

}
