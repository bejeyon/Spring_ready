package collection_ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Map Interface
		 * - K(ey), V(alue) 쌍으로 이루어짐.
		 * - 빠른 검색 속도 제공.
		 * - V : null 허용
		 */
		
		/* 1. HashMap
		 * - 속도가 빠름
		 * - 입력 순서가 저장되지 X
		 */
		
		Map<String, String> hashmap = new HashMap<String, String>();	// 다이아몬드 연산자. 제너릭. 일반화 프로그래밍.
		hashmap.put("A", "사과");
		hashmap.put("C", "바나나");
		hashmap.put("B", "수박");
		hashmap.put("F", "배");
		hashmap.put("B", "귤");
		
		System.out.println(hashmap.get("B"));
		
		// hashmap.keySet();	// key값만 set형으로 넘어옴.
		
		for(String k: hashmap.keySet()) {	// 내부적으로 HashCode 순서대로 정렬됨.
			System.out.println(k + ":" + hashmap.get(k));
		}
		
		
		/* 2. LinkedHashMap
		 * - 입력순서가 저장됨 O
		 */
		
		Map<String, String> linkedhashmap = new LinkedHashMap<String, String>();	// 다이아몬드 연산자. 제너릭. 일반화 프로그래밍.
		linkedhashmap.put("A", "사과");
		linkedhashmap.put("C", "바나나");
		linkedhashmap.put("B", "수박");
		linkedhashmap.put("F", "배");
		linkedhashmap.put("B", "귤");
		
		System.out.println(linkedhashmap.get("B"));
		
		// hashmap.keySet();	// key값만 set형으로 넘어옴.
		
		for(String k: linkedhashmap.keySet()) {	// 내부적으로 HashCode 순서대로 정렬됨.
			System.out.println(k + ":" + linkedhashmap.get(k));
		}
	}

}
