package teampro0102.vehicle;

public class Airplane extends Transport {

	private static int gid = 0;
	
	// 생성자(번호 자동 생성 + 요금 초기화)
	public Airplane(int fare) {
		super(++gid, fare);
	}

	@Override
	// Status 출력
	public String toString() {
		return "Airplane [number=" + getNumber() + ", passenger=" + getPassenger() + ", fare=" + getFare() + "]";
	}
}
