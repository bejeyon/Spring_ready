package collection_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericEx {
	// Type 도 매개변수
	public static <T> void print(List<T> list1) {
		for (T item: list1) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList() {{
			add(1); add(2); add(3); add(4); add(5);
		}};
		
		List<String> list2 = new ArrayList() {{
			add("가"); add("나"); add("다"); add("라"); add("마");
		}};
		
		for (Integer item: list1) {
			System.out.println(item);
		}
		
		for (String item: list2) {
			System.out.println(item);
		}
		
		print(list1);
		print(list2);
	}

}
