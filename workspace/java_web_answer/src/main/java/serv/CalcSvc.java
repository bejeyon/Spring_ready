package serv;

public class CalcSvc implements ICalc {

	private int result = 0;
	private CalcVo vo;
	
	public CalcSvc(CalcVo vo) {
		
		if (vo.getOpt().equals("+")) {
			vo.setResult(vo.getNum1() + vo.getNum2());
		} else if (vo.getOpt().equals("-")) {
			vo.setResult(vo.getNum1() - vo.getNum1());
		} else if (vo.getOpt().equals("*")) {
			vo.setResult(vo.getNum1() * vo.getNum1());
		} else if (vo.getOpt().equals("/")) {
			vo.setResult(vo.getNum1() / vo.getNum1());
		}
		
		this.vo = vo;
	}
	
	public CalcSvc(int num1, int num2, String opt) {
		
		if (opt.equals("+")) {
			result = num1 + num2;
		} else if (opt.equals("-")) {
			result = num1 - num2;
		} else if (opt.equals("*")) {
			result = num1 * num2;
		} else if (opt.equals("/")) {
			result = num1 / num2;
		}
	}
	
	@Override
	public int getResult() {
		return this.result;
	}
	
	public CalcVo getResultVO() {
		return this.vo;
	}
}
