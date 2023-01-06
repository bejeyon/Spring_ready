package teamproject02;

public class Passenger implements People {

	private int id;
	private String name;
	private String address;
	private int money;
	
	public Passenger(int id, String name, String address, int money) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.money = money;
	}
	
	@Override
	public void deposit(int inmoney) {
		// TODO Auto-generated method stub
		this.money += inmoney;
	}

	@Override
	public void withdraw(int outmoney) {
		// TODO Auto-generated method stub
		this.money -= outmoney;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", address=" + address + ", money=" + money + "]";
	}
	
	
}
