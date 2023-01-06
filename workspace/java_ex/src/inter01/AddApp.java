// 선생님

package inter01;

public class AddApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddClass add = new AddClass();
		add.add(1, 2, 3);
		
		// 함수형 인터페이스. functional interface -> 햠수지향형 흉내내기 시작, 매개변수 타입 추론
		AddInterface add2 = (a, b, c) -> System.out.println(a + b + c);
		add2.add(1, 2, 3);	// 안의 값 1, 2, 3을 통해 위의 a, b, c의 타입을 컴파일러가 자동으로 유추.
		
//		var a = 10;
	}

}
