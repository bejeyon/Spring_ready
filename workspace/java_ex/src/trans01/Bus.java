package trans01;

public class Bus {
	private int bus_no;
	private int passenger;
	private int income;
	
	public Bus(int _bus_no) {
		this.bus_no = _bus_no;
	}
	
	public void getIn(TransCard card) {
		card.withdraw(1000);
		this.passenger++;
		this.income += 1000;
	}
	
	public void getOut() {
		this.passenger--;
	}

	@Override
	public String toString() {
		return "Bus [bus_no=" + bus_no + ", passenger=" + passenger + ", income=" + income + "]";
	}
	
}
