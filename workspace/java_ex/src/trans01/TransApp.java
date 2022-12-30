package trans01;

public class TransApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransCard card1 = new TransCard(1111);
		TransCard card2 = new TransCard(2222);
		TransCard card3 = new TransCard(3333);
		
		card1.deposit(10000);
		card2.deposit(15000);
		card3.deposit(20000);
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		bus100.getIn(card1);
		System.out.println(bus100);
		bus100.getIn(card2);
		System.out.println(bus100);
		bus100.getIn(card3);
		System.out.println(bus100);
		
		bus100.getOut();
		System.out.println(bus100);
		
		bus200.getIn(card1);
		System.out.println(bus200);
		
		
	}

}
