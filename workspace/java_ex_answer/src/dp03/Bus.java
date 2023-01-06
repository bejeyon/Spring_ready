package dp03;

public class Bus extends Car {
	private int busNum = 100;
	private int passenger = 0;
	private int fare = 0;
	
	public Bus() {}

	public Bus(int busNum, int passenger, int fare) {
		this.busNum = busNum;
		this.passenger = passenger;
		this.fare = fare;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getBusNum() {
		return busNum;
	}

	public int getPassenger() {
		return passenger;
	};
	
	@Override
	public void getIn(People people) {
		++this.passenger;
		people.withdraw(this.fare);
		
		System.out.println("승차");
		System.out.println(this.toString());
		System.out.println(people.toString());
	}

	@Override
	public void getOut(People people) {
		// TODO Auto-generated method stub
		--this.passenger;
		
		System.out.println("하차");
		System.out.println(this.toString());
	}

	public void getIn(Student people) {
		++this.passenger;
		people.withdraw((int)(this.fare*(1.0-people.getDiscoutnRate())));
		
		System.out.println("승차");
		System.out.println(this.toString());
		System.out.println(people.toString());
	}

	public void getOut(Student people) {
		// TODO Auto-generated method stub
		--this.passenger;
		
		System.out.println("하차");
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Bus [busNum=" + busNum + ", passenger=" + passenger + ", fare=" + fare + "]";
	}
	
}
