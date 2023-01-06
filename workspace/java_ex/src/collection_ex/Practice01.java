package collection_ex;

import java.util.ArrayList;
import java.util.List;


public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> class11 = new ArrayList<Student>();
		class11.add(new Student(1, 1, 1, "학생1", 100));
		class11.add(new Student(1, 1, 2, "학생2", 90));
		class11.add(new Student(1, 1, 3, "학생3", 80));
		class11.add(new Student(1, 1, 4, "학생4", 95));
		class11.add(new Student(1, 1, 5, "학생5", 85));
		
		class11.forEach((item) -> System.out.println(item));
		int total = 0;
		double avg = 0;
		for (int i = 0; i < class11.size(); i++) {
			total += class11.get(i).getScore();
		}
		avg = (double)total/class11.size();
		
		System.out.println("1학년 1반의 총합 : " + total + "점");
		System.out.println("1학년 1반의 평균 : " + avg + "점");
	}

}

class Student {
	private int grade;
	private int group;
	private int num;
	private String name;
	private int score;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int grade, int group, int num, String name, int score) {
		super();
		this.grade = grade;
		this.group = group;
		this.num = num;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", group=" + group + ", num=" + num + ", name=" + name + ", score=" + score
				+ "]";
	}
	
	
}

