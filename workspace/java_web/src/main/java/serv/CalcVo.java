package serv;

import lombok.Data;

@Data
public class CalcVo {
	private int num1;	// private: 함부로 변경되면 안 됨.
	private int num2;
	private String opt;
	private int result;
}
