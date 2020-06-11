package com.kh.list.run;

import java.util.ArrayList;

import com.kh.list.TestList;
import com.kh.list.sort.AscNameSort;
import com.kh.list.sort.AscPriceSort;
import com.kh.list.sort.DescNameSort;
import com.kh.list.sort.DescPriceSort;
import com.kh.list.sort.Product;

public class Run {
	public static void main(String[] args) {
		TestList tl = new TestList();
//		tl.method1();
		
		
		// 객체리스트 정렬 테스트
		ArrayList list = new ArrayList();
		list.add(new Product("PAV",5000000,0.05));
		list.add(new Product("iPhone",800000,0.02));
		list.add(new Product("Gallaxy",700000,0.01));
		System.out.println("list : " + list);

		for(Object obj: list) {
			System.out.println(obj);
		}

		// price 기준으로 오름차순
		list.sort(new AscPriceSort());
		System.out.println("======= ASC ================");
		for(Object obj: list) {
			System.out.println(obj);
		}


		// price 기준으로 내림차순
		list.sort(new DescPriceSort());
		System.out.println("========DESC===============");
		for(Object obj: list) {
			System.out.println(obj);
		}

		// AscNameSort
		list.sort(new AscNameSort());
		System.out.println("=======================");
		for(Object obj: list) {
			System.out.println(obj);
		}

		// DescNameSort
		list.sort(new DescNameSort());
		System.out.println("=======================");
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
}

















