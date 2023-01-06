package dp03;

public class Car implements Vehicle {

	@Override
	public void getIn(People people) {
		// TODO Auto-generated method stub
		System.out.println("승차");
		System.out.println(people.toString());
	}

	@Override
	public void getOut(People people) {
		// TODO Auto-generated method stub
		System.out.println("하차");
		System.out.println(people.toString());
	}

}
