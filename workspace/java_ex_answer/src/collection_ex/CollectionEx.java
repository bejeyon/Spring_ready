package collection_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> stud1 = new HashMap();
		stud1.put("학년", "1");
		stud1.put("반", "1");
		stud1.put("번호", "1");
		stud1.put("이름", "학생1");
		stud1.put("점수", "100");

		Map<String, String> stud2 = new HashMap();
		stud2.put("학년", "1");
		stud2.put("반", "1");
		stud2.put("번호", "2");
		stud2.put("이름", "학생2");
		stud2.put("점수", "90");
		
		Map<String, String> stud3 = new HashMap();
		stud3.put("학년", "1");
		stud3.put("반", "1");
		stud3.put("번호", "3");
		stud3.put("이름", "학생3");
		stud3.put("점수", "80");
		
		Map<String, String> stud4 = new HashMap();
		stud4.put("학년", "1");
		stud4.put("반", "1");
		stud4.put("번호", "4");
		stud4.put("이름", "학생4");
		stud4.put("점수", "95");
		
		Map<String, String> stud5 = new HashMap();
		stud5.put("학년", "1");
		stud5.put("반", "1");
		stud5.put("번호", "5");
		stud5.put("이름", "학생5");
		stud5.put("점수", "85");
			
		List<Map<String, String>> class_01 = new ArrayList () {{
			add(stud1); add(stud2); add(stud3); add(stud4); add(stud5);
		}};
		
		int sum = 0;
		for (Map<String, String> item: class_01) {
			System.out.println(item.get("학년") + "," + item.get("반") + "," + item.get("번호") + "," + item.get("이름") + "," + item.get("점수"));
			
			sum += Integer.parseInt(item.get("점수").toString());
		}
		
		System.out.println("총점:" + sum + ", 평균:" + sum/class_01.size() );
		
		
		
	}

}
