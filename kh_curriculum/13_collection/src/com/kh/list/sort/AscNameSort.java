package com.kh.list.sort;

import java.util.Comparator;

public class AscNameSort  implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// compareTo: int를 리턴하게 하고, 리턴되는 int값이 음수이면 현재 인스턴스가 
		//            비교대상인 인스턴스보다 작고, 양수이면 크고 0이면 같도록하자
		
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		
		return p1.getName().compareTo(p2.getName());
	}

}
