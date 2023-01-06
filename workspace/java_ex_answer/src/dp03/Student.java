package dp03;

public class Student extends People implements Discount {

	private static int gsid = 0;
	private int studentNo = 0;
	private String school = "";
	private int grade = 1;
	private double discountRate = 0.0;
	
	public Student() {
		this.studentNo = ++gsid;
	}
	
	public Student(String name, String addr, int money, String school, int grade, double discountRate) {
		super(name, addr, money);
		this.studentNo = ++gsid;
		this.school = school;
		this.grade = grade;
		this.discountRate = discountRate;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if ( grade > 0 && grade < 4) {
			this.grade = grade;
		} else {
			System.out.println("학년은 1~3사이의 값을 입력해 주세요.");
		}
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getStudentNo() {
		return studentNo;
	}

	@Override
	public double getDiscoutnRate() {
		return discountRate;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", school=" + school + ", grade=" + grade + ", discountRate="
				+ discountRate + ", " + super.toString() + "]";
	}
}
