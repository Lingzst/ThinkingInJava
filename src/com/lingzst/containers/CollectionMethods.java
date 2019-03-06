package com.lingzst.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		System.out.println(c);
		Object[] array = c.toArray();
		String[] str = c.toArray(new String[5]);
		System.out.println(array);
		System.out.println(str instanceof Object);
		System.out.println(c instanceof ArrayList<?>);
		System.out.println(Collections.max(c));
	}
}
