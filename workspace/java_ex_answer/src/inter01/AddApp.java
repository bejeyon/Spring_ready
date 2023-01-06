package inter01;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AddApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddClass add = new AddClass();
		add.add(1, 2, 3);
		
		// 함수형 인터페이스 , 매개변수 타입 추론
		AddInterface add2 = (a, b, c) -> System.out.println(a + b+ c);
		add2.add(1, 2, 3);
		
		Consumer<String> consumer = t -> System.out.println(t);
        consumer.accept("Consumer: Hello Consumer!!");
        
        Supplier<String> supplier = () -> {
        	String str = "Hello Supplier!!";
            return str;
        };
 
        String str = supplier.get();
        System.out.println("Supplier: " + str);
		
	}

}
