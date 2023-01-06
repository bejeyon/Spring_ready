package dp03;

public class People {
	private static int gid = 0;
	private int id = 0;
	private String name ="";
	private String addr = "";
	private int money = 0;
	
	public People() {
		this.id = ++gid;
	}

	public People(String name, String addr, int money) {
		this();
		this.name = name;
		this.addr = addr;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public int getMoney() {
		return money;
	}
	
	public void deposit(int amount) {
		this.money += amount;
	}
	
	public void withdraw(int amount) {
		this.money -= amount;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", addr=" + addr + ", money=" + money + "]";
	}

}
