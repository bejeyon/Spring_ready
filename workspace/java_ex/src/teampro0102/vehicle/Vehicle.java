package teampro0102.vehicle;

import teampro0102.people.People;

// 교통수단 인터페이스
public interface Vehicle {
	public abstract void getIn(People people);	// 승차 메서드
	public abstract void getOut(People people);	// 하차 메서드
}
