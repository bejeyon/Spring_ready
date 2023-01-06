package teampro0102.people;

// 승객 클래스
public class Passenger implements People {

	private static int gid = 0;
	private int id;				// ID(식별번호)
	private String name;		// 이름
	private String address;		// 주소
	private int money;			// 잔고
	
	// 기본 생성자(ID 자동 생성)
	private Passenger() {
		this.id = ++gid;
	}
	
	// 생성자(이름, 주소, 잔고 초기화 + 기본 생성자 호출)
	public Passenger(String name, String address, int money) {
		this();
		this.name = name;
		this.address = address;
		this.money = money;
	}
	
	@Override
	// 입금 메서드
	public void deposit(int inmoney) {
		this.money += inmoney;		// 입금 금액만큼 합산
	}

	@Override
	// 출금 메서드
	public void withdraw(int outmoney) {
		this.money -= outmoney;		// 출금 금액만큼 차감
	}

	@Override
	// Status 반환
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", address=" + address + ", money=" + money + "]";
	}
	
}
