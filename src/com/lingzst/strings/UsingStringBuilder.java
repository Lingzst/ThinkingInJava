package com.lingzst.strings;

import java.util.Random;

public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString() {
		StringBuilder results = new StringBuilder("[");
		for (int i = 0; i < 25; i++) {
			results.append(rand.nextInt(100));
			results.append(", ");
		}
		results.delete(results.length() - 2, results.length());
		results.append("]");
		return results.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}
