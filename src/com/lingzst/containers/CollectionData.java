package com.lingzst.containers;

import java.util.ArrayList;
import java.util.Arrays;

import com.lingzst.generic.Generator;

@SuppressWarnings("serial")
public class CollectionData<T> extends ArrayList<T> {

	public CollectionData(Generator<T> gen, int quantity) {
		for (int i = 0; i < quantity; i++) {
			add(gen.next());
		}
	}
	static String[] a = ("dfjeo dsf" + "dfjejf feo").split(" ");
	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
	}
}
