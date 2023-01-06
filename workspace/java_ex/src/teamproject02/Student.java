package teamproject02;

public class Student extends Passenger implements DiscountRate {

	private String studentNo;
	private String school;
	private int grade;
	private double discountRate;

	public Student(int id, String name, String address, int money, String studentNo, String school, int grade,
			double discountRate) {
		super(id, name, address, money);
		this.studentNo = studentNo;
		this.school = school;
		this.grade = grade;
		this.discountRate = discountRate;
	}

	@Override
	public double getDiscountRate() {
		// TODO Auto-generated method stub
		return this.discountRate;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", school=" + school + ", grade=" + grade + ", discountRate="
				+ discountRate + ", toString()=" + super.toString() + "]";
	}

}
