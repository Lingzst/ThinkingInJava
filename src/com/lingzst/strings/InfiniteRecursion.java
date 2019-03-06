package com.lingzst.strings;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfiniteRecursion {
	public String toString() {
		return "InfiniteRecusion Address: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
		System.out.println(new Date());
	}
}
