package trans01;

public class TransCard {
	private int card_no;
	private int balance;
	
	public TransCard(int _card_no) {
		this.card_no = _card_no;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}

	@Override
	public String toString() {
		return "TransCard [card_no=" + card_no + ", balance=" + balance + "]";
	}
}
