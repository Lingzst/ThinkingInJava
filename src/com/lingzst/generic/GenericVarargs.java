package com.lingzst.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	@SafeVarargs
	public static <E> List<E> makeList(E... args){
		List<E> result = new ArrayList<E>();
		for(E item : args)
			result.add(item);
		return result;
	}
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A", "B", "C");
		System.out.println(ls);
	}
}
