package com.kh.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	// Set :
	//		자료구조 유형 중 하나로
	// 		List와 대조되는 특성을 가지고 있다.
	// 		먼저, set은 순서가 유지되지 않으며, 중복을 허용하지 않는다.
	//		이러한 set의 종류는 크게 HashSet과 TreeSet, LinkedHashSet이 있다.
	
	public void method1() {
		// HashSet 테스트
		HashSet hset = new HashSet();
		
		// 다형성 적용한 생성
		Set hset2 = new HashSet();
		Collection hset3 = new HashSet();
		
		hset.add("사과");
		hset.add(12345);
		hset.add(true);
		hset.add(12.5);
		hset.add('A');
		
		// 1. 저장 순서가 유지되지 않는다.
		// 2. toString()이 재정의가 되어 있다.
		System.out.println("hset : " + hset.toString());
		
		hset.add("사과");
		hset.add("키위");
		hset.add("사과");
		hset.add("사과");

		System.out.println("hset : " + hset.toString());
		System.out.println("저장개수 : " + hset.size());
		System.out.println("포함여부 확인 : " + hset.contains("사과"));
		
		// 순서가 유지되지 않는 SET의 각 요소를 차례대로 꺼내는 방법
		System.out.println("----------------");
		
		// 1. set객체를 배열로 만들어서 하나씩 꺼내는방법
		Object[] oArr = hset.toArray();
		
		for(Object obj : oArr) {
			System.out.println(obj);
		}
		
		// 2. set객체를 목록화(Iterator)
		Iterator iter = hset.iterator();
		
		// iter.hasNext() : 다음에 꺼내줄 요소가 있는가?
		while(iter.hasNext()) {
			// iter.next() : 현재요소를 꺼내어 오고 다음 요소로 이동한다.
			Object obj = iter.next();
			System.out.println(obj);
		}
		
	}
}









