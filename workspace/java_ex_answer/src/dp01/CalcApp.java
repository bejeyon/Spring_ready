package dp01;

public class CalcApp {
	static void showResult(int result) {
		System.out.println(result);
	}
	
	static void showResult(double result) {
		System.out.println(result);
	}
	
	static void showResult(CalcOperator opt, int a, int b) {
		System.out.println(opt.operator(a, b));
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수
		int a = 10;
		int b = 20;
		// 10과 20의 합은 얼마입니까?
		System.out.println(a+b);
		System.out.println(10+20);
		
		{ // scope
			int c = 20;
		}
		//System.out.println(c); // 주석
		
		/*
		void hell_world(int cnt) {
			for(int i=0; i < cnt; i++) {
				System.out.println(i+". Hello World!!");
			}
			//return  //지역변수 전달
		}
		*/
		
		CalcPlus plus = new CalcPlus();
		System.out.println(plus.operator(1, 3));
		
		CalcOperator minus = new CalcMinus();
		System.out.println(minus.operator(1, 3));
	
		showResult(plus.operator(1, 3));
		showResult(minus.operator(1.0, 3.0));
		
		showResult(minus, 1, 3);
		showResult(new CalcPlus(), 1, 3);
		showResult(new CalcMinus(), 1, 3);
		
		//showResult((a, b)->a+b, 1, 3);
		
	}

}
