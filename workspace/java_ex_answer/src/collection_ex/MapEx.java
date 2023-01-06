package collection_ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Map Interface
		 * - K, V
		 * - 빠른 검색속도, HashCode
		 * - V: null 허용
		 */
		
		// 1. HashMap
		// - 속도가 빠름
		// - 입력순서가 저장(X)
		Map<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("A", "사과");
		hashmap.put("C", "바나나");
		hashmap.put("B", "수박");
		hashmap.put("F", "배");
		hashmap.put("B", "귤");
		
		System.out.println(hashmap.get("B"));
		
		for(String k: hashmap.keySet()) {
			System.out.println(k + ":" + hashmap.get(k));
		}

		// 2. LinkedHashMap
		// - 입력순서가 저장(O)
		Map<String, String> linkedhashmap = new LinkedHashMap<String, String>();
		linkedhashmap.put("A", "사과");
		linkedhashmap.put("C", "바나나");
		linkedhashmap.put("B", "수박");
		linkedhashmap.put("F", "배");
		linkedhashmap.put("B", "귤");
		
		System.out.println(linkedhashmap.get("B"));
		
		for(String k: linkedhashmap.keySet()) {
			System.out.println(k + ":" + linkedhashmap.get(k));
		}		
		
	}

}
