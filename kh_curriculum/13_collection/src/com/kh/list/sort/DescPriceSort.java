package com.kh.list.sort;

import java.util.Comparator;

//public class AscPriceSort implements Comparator{
public class DescPriceSort implements Comparator<Product>{

	// 제네릭스를 사용한 후
	@Override
	public int compare(Product p1, Product p2) {
		int result = 0;
		
		if(p1.getPrice() > p2.getPrice()) {
			result= -1;
		}else if(p1.getPrice() < p2.getPrice()) {
			result = 1;
		}
		
		return result;
	}
	
	
	
	// 제네릭스를 사용하기전
//	@Override
//	public int compare(Object o1, Object o2) {
//		
//		Product p1 = (Product)o1;
//		Product p2 = (Product)o2;
//		
//		int result = 0;
//		
//		if(p1.getPrice() > p2.getPrice()) {
//			result = 1;
//		}else if(p1.getPrice() < p2.getPrice()) {
//			result = -1;
//		}
//		
//		return result;
//	}

}
