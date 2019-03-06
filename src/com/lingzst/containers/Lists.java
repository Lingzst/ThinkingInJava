package com.lingzst.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;
	public static void basicTest(List<String> a) {
		a.add(1, "x");
		a.add("x");
		ArrayList<String> list = new ArrayList<>(Collections.nCopies(4,"2")); 
		list.listIterator();
		a.addAll(list);
		b = a.contains("2");
		boolean c = a.contains(list);
		s = a.get(1);
		i = a.indexOf("2");
		b = a.isEmpty();
		it = a.iterator();
		lit = a.listIterator();
		lit = a.listIterator();
		i = a.lastIndexOf("2");
		a.remove(2);
		a.remove("2");
		a.set(1, "y");
		a.retainAll(list);
		i = a.size();
		a.clear();
	}
	public static void iterMotion(List<String> a) {
		ListIterator<String> it = a.listIterator();
	}
}
