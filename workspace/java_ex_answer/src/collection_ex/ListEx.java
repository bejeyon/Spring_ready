package collection_ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List : interface
		/* - 중복허용
		 * - 가변크기
		 * - 입력 순서
		 * - add(value), set(index, value), remove(index), clear()
		 */
		
		/**
		 * 1. ArrayList
		 * - 순차적 처리
		 * - 인덱스 이용
		 */
		List<Integer> array_list = new ArrayList<Integer>();
		array_list.add(1);
		array_list.add(5);
		array_list.add(3);
		array_list.add(3);
		array_list.add(2);
		array_list.add(4);
		
		for (Integer item: array_list) {
			System.out.println(item);
		}
		
		System.out.println(array_list.size());
		
		/**
		 * LinkedList
		 */
		List<Integer> linked_list = new LinkedList<Integer>();
		linked_list.add(1);
		linked_list.add(5);
		linked_list.add(3);
		linked_list.add(3);
		linked_list.add(2);
		linked_list.add(4);
		
		for (Integer item: linked_list) {
			System.out.println(item);
		}
		
		System.out.println(linked_list.size());		
		
		
		/**
		 * HashSet
		 */
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(1);
		hashset.add(5);
		hashset.add(3);
		hashset.add(3);
		hashset.add(2);
		hashset.add(4);
		
		for (Integer item: hashset) {
			System.out.println(item);
		}
		
		System.out.println(hashset.size());
		
		int a1 = 1;
		Integer a = 1;  // boxing -> heap: Method 
		Integer b = new Integer("2");
		System.out.println(a + b);
		
		int c = a.intValue(); // unboxing -> stack: 연산
		
		
		List<Integer> array_list1 = new ArrayList<Integer>();
		array_list1.add(1);
		array_list1.add(2);
		array_list1.add(3);
		array_list1.add(4);
		array_list1.add(5);
		array_list1.add(6);	
		array_list1.add(7);
		array_list1.add(8);
		array_list1.add(9);
		array_list1.add(10);
		
		for (Integer item: array_list1) {
			System.out.println(item);
		}
		
		int total = 0;
		for (Integer item: array_list1) {
			total += item.intValue();
		}
		System.out.println(total);
		
		array_list1.forEach((item) -> System.out.println(item));
		total = array_list1.stream().mapToInt(n -> n).sum();
		
	}

}
