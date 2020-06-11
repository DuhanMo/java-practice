package com.kh.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	
	public void method1() {
		// Tree구조를 활용하여 
		// 데이터를 저장함으로써
		// 자동으로 정렬까지 처리하는 set클래스
		
		TreeSet tset = new TreeSet();
		Set tset2 = new TreeSet();
		
		tset.add("5java");
		tset.add("2oracle");
		tset.add("1html");
		tset.add("4css");
		tset.add("3javascript");
		// treeset은 데이터를 저장할 때
		// 자동으로 오름차순 정렬을 한다.
		System.out.println("tset : " + tset);
		
		// 1. Object[] 배열로 만들어서 꺼내는 방법
		Object[] arr = tset.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println((String) arr[i]);
		}
		
		
		Set tset1 = new TreeSet();
		
//		for(;tset1.size()<6;) {
//			int rnd = (int)(Math.random()*45)+1;
//			tset1.add(rnd);
//		}
		System.out.println(tset1.size());
		while(tset1.size() < 6) {
			tset1.add((int)(Math.random()*45)+1);
		}
		
		System.out.println(tset1);
	}
}
















