package teampro0102;

import teampro0102.people.Passenger;
import teampro0102.people.Student;
import teampro0102.vehicle.Bus;
import teampro0102.vehicle.Car;

// 실행 클래스
public class DoMain {

	public static void main(String[] args) {
		Passenger person1 = new Passenger("James", "A", 10000);
		Passenger person2 = new Passenger("Bake", "B", 30000);
		Passenger person3 = new Passenger("Cat", "C", 20000);
		Student student1 = new Student("KKK", "K", 5000,"ABC", 1);
		Student student2 = new Student("AAA", "A", 5000,"ABC", 2);
		
		Bus bus1 = new Bus(1000);
		
		bus1.getIn(person1);
		bus1.getIn(person2);
		bus1.getIn(person3);
		bus1.getIn(student1);
		bus1.getIn(student2);
		
		bus1.getOut(student2);
		bus1.getOut(person2);
		
		person2.deposit(10000);
		
		Car car1 = new Car();
		car1.getIn(person2);
		car1.getOut(person2);
	}

}
