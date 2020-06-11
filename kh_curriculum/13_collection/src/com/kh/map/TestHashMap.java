package com.kh.map;

import java.util.Date;
import java.util.HashMap;

public class TestHashMap {
	// Map:
	//		데이터(자료)를 저장할 때
	//		각각의 자료들을 구분짓는 고유의 값을
	//		정하여 해당 값으로 접근하는 실제 객체를 
	//		구분지으려고 할 때 사용하는 자료구조
	//		해당 객체를 저장할 때 Key와 Value로 나누어서
	//		Key는 Set의 특성으로, Value는 list의 특성으로 관리한다.
	//		HashMap, TreeMap, Properties
	public void method1() {
		HashMap hmap = new HashMap();
		
		// map에 값을 저장할 때에는
		// put()메소드를 사용하는데
		// 키(key)와 값(value) 두가지 객체를 모두 저장해야한다.
		hmap.put("one", new Date());
		hmap.put("two","안녕하세요");
		hmap.put("three", 12345);
		
		System.out.println("hmap : " + hmap + "\n : " + hmap.get("one"));
	}
}





