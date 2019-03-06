package com.lingzst.arrays;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
	private static Random rand = new Random(47);
	static final String[] FLAVORS = {
			"A", "B", "C", "D", "e"
	};
	public static String[] flavorSet(int n) {
		if(n > FLAVORS.length)
			throw new IllegalArgumentException("Set too big");
		String[] results = new String[n];
		boolean[] picked = new boolean[FLAVORS.length]; 
		for(int i = 0; i < n; i++) {
			int t;
			do
				t = rand.nextInt(FLAVORS.length);
			while(picked[t]);
			results[i] = FLAVORS[t];
			picked[t] = true;
		}
		return results;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			System.out.println(Arrays.toString(flavorSet(3)));
			System.out.println(flavorSet(3));
	}
}
