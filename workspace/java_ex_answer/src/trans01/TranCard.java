package trans01;

public class TranCard {
	private int card_no;
	private int bal;
	
	public TranCard(int _card_no) {
		this.card_no = _card_no;
	}
	
	public void depo(int amo) {
		this.bal += amo;
	}
	
	public void withd(int amo) {
		this.bal -= amo;
	}

	@Override
	public String toString() {
		return "TranCard [card_no=" + card_no + ", bal=" + bal + "]";
	}

}
