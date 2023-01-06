package teampro0102.people;

import teampro0102.discount.DiscountRate;

// 학생 클래스
public class Student extends Passenger implements DiscountRate {

	private static int gid = 0;
	private int studentNo;				// 학번
	private String school;				// 학교
	private int grade;					// 학년
	private double discountRate = 0.1;	// 할인율
	
	// 생성자(상위 클래스 초기화 + 학번 자동 생성)
	private Student(String name, String address, int money) {
		super(name, address, money);
		this.studentNo = ++gid;
	}

	// 생성자(학교, 학년 초기화 + 생성자 호출)
	public Student(String name, String address, int money, String school, int grade) {
		this(name, address, money);
		this.school = school;
		this.grade = grade;
	}

	@Override
	// 할인율 반환
	public double getDiscountRate() {
		return this.discountRate;
	}

	@Override
	// Status 반환
	public String toString() {
		return "Student [studentNo=" + studentNo + ", school=" + school + ", grade=" + grade + ", discountRate="
				+ discountRate + ", toString()=" + super.toString() + "]";
	}

}
