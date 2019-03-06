package com.lingzst.arrays;

import com.lingzst.generic.Generator;

public class CountingGenerator {
	public static class Boolean implements Generator<java.lang.Boolean>{
		private boolean value = false;
		public java.lang.Boolean next() {
			value = !value;
			return value;
		}
	}
}
