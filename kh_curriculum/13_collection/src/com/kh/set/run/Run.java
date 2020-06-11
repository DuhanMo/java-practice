package com.kh.set.run;

import com.kh.set.TestHashSet;
import com.kh.set.TestLinkedSet;
import com.kh.set.TestTreeSet;

public class Run {
	public static void main(String[] args) {
		TestHashSet ths = new TestHashSet();
		//ths.method1();
		TestLinkedSet tls = new TestLinkedSet();
		//tls.method1();
		TestTreeSet tts = new TestTreeSet();
		tts.method1();
	}
}
