package serv;

public class CalcSvc implements ICalc {
	
	private int result = 0;	// 결과값 외부에서 못 바꾸게 은닉.
	private CalcVo vo;
	
	public CalcSvc(CalcVo vo) {
		switch(vo.getOpt()) {	// 자바 8부터는 switch문에 문자열 가능
		case "+":
			//result = num1 + num2;
			vo.setResult(vo.getNum1() + vo.getNum2());
			break;
		case "-":
			//result = num1 - num2;
			vo.setResult(vo.getNum1() - vo.getNum2());
			break;
		case "*":
			//result = num1 * num2;
			vo.setResult(vo.getNum1() * vo.getNum2());
			break;
		case "/":
			//result = num1 / num2;
			vo.setResult(vo.getNum1() / vo.getNum2());
		}
		
		this.vo = vo;
	}
	
	public CalcSvc(int num1, int num2, String opt) {
		switch(opt) {	// 자바 8부터는 switch문에 문자열 가능
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
		}
	}
	
	@Override
	public int getResult() {	// controller 작성자가 기다리지 않도록 인터페이스로 만들어야 함. -> 동시 개발 가능해짐.
		return this.result;
	}
	
	public CalcVo getResultVO() {	// controller 작성자가 기다리지 않도록 인터페이스로 만들어야 함. -> 동시 개발 가능해짐.
		return this.vo;
	}

}
