package teampro0102.vehicle;

public class Subway extends Transport {

private static int gid = 0;
	
	// 생성자(번호 자동 생성 + 요금 초기화)
	public Subway(int fare) {
		super(++gid, fare);
	}

	@Override
	// Status 출력
	public String toString() {
		return "Subway [number=" + getNumber() + ", passenger=" + getPassenger() + ", fare=" + getFare() + "]";
	}

}
