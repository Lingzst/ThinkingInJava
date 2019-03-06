package com.lingzst.holdingyourobjects;

import java.util.*;

public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i < 1000; i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : ++freq);
		}
		System.out.println(m);
	}
}
