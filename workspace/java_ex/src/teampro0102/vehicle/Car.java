package teampro0102.vehicle;

import teampro0102.people.People;

// 일반 차량 클래스
public class Car implements Vehicle{

	@Override
	public void getIn(People people) {
		System.out.println("승차");
		System.out.println(people.toString());
	}

	@Override
	public void getOut(People people) {
		System.out.println("하차");
		System.out.println(people.toString());
	}
	
}
