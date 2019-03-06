package com.lingzst.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Unsupported {
	static void test(String msg, List<String> list) {
		System.out.println("--- " + msg + " ---");
		Collection<String> c = list;
		Collection<String> sublist = list.subList(1, 2);
		Collection<String> c2 = new ArrayList<String>(sublist);
		try {
			c.retainAll(c2);
		} catch (Exception e) {
			System.out.println("retainAll(): " + e);
		}
	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L,M,N".split(","));
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("dfe");
		arrayList.add("dfe");
		arrayList.add("dfe");
		test("modifiable copy", new ArrayList<String>(list));
		test("Arrays.aslist", list);
		test("test",arrayList);
	}
}
