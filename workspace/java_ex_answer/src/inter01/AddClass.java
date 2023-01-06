package inter01;

public class AddClass implements AddInterface {

	@Override
	public void add(int a, int b, int c) {
		System.out.println(a + b+ c);
	}

}
