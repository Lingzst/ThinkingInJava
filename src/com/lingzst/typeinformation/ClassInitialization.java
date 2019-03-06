package com.lingzst.typeinformation;

import java.util.Random;

class Initable{
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializing Initable");
	}
	public void test() {
		System.out.println("hello");
	}
}
class Initable2{
	static int staticNonFinal = 47;
	static {
		System.out.println("Initializing Initable2");
	}
}

public class ClassInitialization {
	public static Random rand = new Random(47);
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			Class<?> initable = Initable.class;
		} catch (Exception e) {
			System.out.println("error");
		}
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
	}
}
