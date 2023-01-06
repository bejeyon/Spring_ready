package teampro0102.vehicle;

import teampro0102.people.People;
import teampro0102.people.Student;

// 대중교통 클래스
public class Transport implements Vehicle {

	private int number;		// 번호
	private int passenger;	// 승객 수
	private int fare;		// 요금
	   
	// 생성자(번호 초기화)
	public Transport(int number, int fare) {
		this.number = number;
		this.fare = fare;
	}
	   
	// getter, setter
    public int getNumber() {
    	return number;
    }
    public int getPassenger() {
    	return passenger;
    }
    public void setPassenger(int passenger) {
    	this.passenger = passenger;
    }
    public int getFare() {
    	return fare;
    }
    public void setFare(int fare) {
    	this.fare = fare;
    }
	
    @Override
    // 승차 메서드
	public void getIn(People people) {
	    ++this.passenger;
	    people.withdraw(this.fare);
	    System.out.println("승차");
	    System.out.println(this.toString());
	    System.out.println(people.toString());
	}
	public void getIn(Student student) {
	    ++this.passenger;
	    student.withdraw(getDiscountFare(student.getDiscountRate()));
	    System.out.println("승차");
	    System.out.println(this.toString());
	    System.out.println(student.toString());
	}
	
	@Override
	// 하차 메서드
	public void getOut(People people) {
	    --this.passenger;
	    System.out.println("하차");
	    System.out.println(this.toString());
	    System.out.println(people.toString());
	}
	
	// 할인요금 계산 메서드
	private int getDiscountFare(double discoutRate) {
		// 요금 * (1-할인율) >> 1의 자리에서 버림
		int discountFare = (int)Math.floor((this.fare * (1-discoutRate))/10) * 10;
		return discountFare;
	}

}
