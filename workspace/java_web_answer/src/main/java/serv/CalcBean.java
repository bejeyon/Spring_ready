package serv;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CalcBean {
	private String num1;
	private String num2;
	private String opt;
	private String result;
	
	public CalcBean() {}

	public String getNum1() {
		return num1;
	}
	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}
	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getOpt() {
		return opt;
	}
	public void setOpt(String opt) {
		this.opt = opt;
	}

	public String getResult() {
		return result;
	}



	public void calculate() {
		log.debug(num1);
		if (this.num1 == null) num1 = "0";
		if (this.num2 == null) num2 = "0";
		if (this.opt == null) opt = "+";
		
		int _num1 = Integer.parseInt(num1);
		int _num2 = Integer.parseInt(num2);
		
		if (opt.equals("+")) {
			result = String.valueOf(_num1 + _num2);
		} else if (opt.equals("-")) {
			result = String.valueOf(_num1 - _num2);
		} else if (opt.equals("*")) {
			result = String.valueOf(_num1 * _num2);
		} else if (opt.equals("/")) {
			result = String.valueOf(_num1 / _num2);
		}
	}
	
	
}
