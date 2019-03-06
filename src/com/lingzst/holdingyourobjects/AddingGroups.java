package com.lingzst.holdingyourobjects;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		List<Integer> list = Arrays.asList(16,17,18,19,10);
		list.set(1, 99);
		System.out.println("fj l  fejl".split(" "));
	}
}
