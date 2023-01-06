package teampro0102.vehicle;

public class Bus extends Transport {
	
	private static int gid = 0;
	
	// 생성자(번호 자동 생성 + 요금 초기화)
	public Bus(int fare) {
		super(++gid, fare);
	}

	@Override
	// Status 출력
	public String toString() {
		return "Bus [number=" + getNumber() + ", passenger=" + getPassenger() + ", fare=" + getFare() + "]";
	}	
}
