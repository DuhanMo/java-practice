package com.kh.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Collection - List, Set
 * 		List 계열 : 순서를 유지하고 저장, 중복 저장 가능(ArrayList,Vector,LinkedList)
 * 			ArrayList : 빠르고 마음대로 조절할 수 있는 배열
 * 						단방향 포인터 구조로 자료에 대한 순차적인 접근에 강점이 있다.
 * 			Vector : ArrayList의 구형버전이며 모든 메소드 도기화되어있음(Thread Safe 기능이 있음)
 * 			LinkedList: 양방향 포인터 구조로 데이터의 삽입, 삭제가 빈번할 경우 빠른 성능을 보장 -> 스택,큐,양뱡향 큐를 만들기 위한 용도
 * 		
 * 		Set 계열 : 순서를 유지하지 않고 저장, 중복 저장 안됨(HashSet, TreeSet)
 * 			HashSet : 가장빠른 임의의 접근 속도 순서를 전혀 예즉할 수 없다.
 * 			LinkedHashSet : 추가된 순서 또는 가장 최근대 접근한 순서대로 접근 가능
 * 			TreeSet : 정렬된 순서대로 보관하며 정렬방버을 지정할 수 있음
 * Map - 키와 값의 쌍으로 저장  키는 중복 저장안된다(HashMap, HashTable,TreeMap,Properties)
 * 		HashMap : Map인터페이스를 구현하기 위해 해시테이블을 사용한 클래스
 * 				  중복을 허용하지 않고 순서를 보장하지 않음 
 *               키와 값으로 null이 허용
 *      HashTable : HashMap보다는 느리지만 동기화가 지원(Thread Safe)
 *                  키와 값으로 null이 허용되지 않는다.
 *               
 *      TreeMap : 이진검색트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 저장
 *                정렬된 순서대로 키/값 쌍을 저장하므로 빠른 검색이 가능
 *   	
 * 
 */

public class TestList {

	// ArrayList 테스트
	public void method1() {
		ArrayList alist = new ArrayList();
		
		// 다형성 적용
		List blist = new ArrayList();
		Collection clist = new ArrayList();
		// List를 포함한 Collection 객체들은
		// 여러 자료형을 하나에 담을 수있다.
		
		alist.add("사과");
		alist.add(12345); // 자동으로 래퍼클래스로 박싱처리된다.
		alist.add(true);
		alist.add(12.5);
		alist.add('A');
		
		// 1. 순서가 유지된다.
		// 2. toString() 이 재정의 되어있다.
		System.out.println("alist : " + alist.toString());
		
		// index(순번)을 기준으로
		// for문을 통해 반복할 수 있다.
		for(int i=0; i < alist.size();i++) {
			System.out.println(i+ " : " + alist.get(i));
		}
		
		// 중복이 허용된다.
		alist.add("사과");
		System.out.println("alist : " + alist.toString());
		
		// 배열 중간에 값을 쉽게 추가할 수 있으며,
		// 추가할 때 해당 위치에 있던 값과 그 뒤의 값들이 한칸씩 뒤로 밀려난다.
		alist.add(2,"추가");
		System.out.println("alist : " + alist.toString());
		
		// 배열 중간의 값을 쉽게 삭제할 수 있다.
		// 삭제할 경우 그 뒤의 값들이 한칸씩 앞으로 당겨진다.
		alist.remove(0);
		System.out.println("alist : " + alist.toString());
		
		// 값의 변경 시에 set() 메소드를 통해
		// 해당 위치의 값을 변경할 수 있다.
		alist.set(3, "바뀐다.");
		System.out.println("alist : " + alist.toString());
		
		alist.clear();
		System.out.println("alist : " + alist.toString());
		
		ArrayList sortList = new ArrayList();
		
		sortList.add("자동차");
		sortList.add("엘리베이터");
		sortList.add("안경");
		sortList.add("사과");
		sortList.add("카레라이스");
		sortList.add("마라탕");
		
		System.out.println("sortList : " + sortList.toString());
		
		// 오른차순 정렬
		Collections.sort(sortList);
		System.out.println("sortList : " + sortList.toString());
		
		// 내림차순 정렬
		Iterator iter = new LinkedList(sortList).descendingIterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		Collections.reverse(sortList);
		System.out.println("sortList : " + sortList.toString());
	}
	

	
}















