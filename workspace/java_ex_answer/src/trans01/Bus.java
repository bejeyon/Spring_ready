package trans01;

public class Bus {
	private int bus_no;
	private int pass;
	private int income;
	
	public Bus(int _bus_no) {
		this.bus_no = _bus_no;
	}
	
	public void getIn(TranCard card) {
		card.withd(1000);
		this.pass++;
		this.income += 1000;
	}

	public void getOut() {
		this.pass--;
	}

	@Override
	public String toString() {
		return "Bus [bus_no=" + bus_no + ", pass=" + pass + ", income=" + income + "]";
	}
}
