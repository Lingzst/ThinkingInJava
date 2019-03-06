package com.lingzst.object;

import java.util.Random;

public class MathOps {
	Random rand = new Random();
	int i = rand.nextInt(100);
	float j = rand.nextFloat();
	public  void mai() {
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		MathOps mathOps = new MathOps();
		mathOps.mai();
		
	}
}
