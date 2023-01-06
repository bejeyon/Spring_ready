package trans01;

public class TransApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TranCard card1 = new TranCard(1111);
		TranCard card2 = new TranCard(2222);
		TranCard card3 = new TranCard(3333);
		
		card1.depo(10000);
		card2.depo(15000);
		card3.depo(20000);
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
