package com.lingzst.arrays;

public class test {
	public static void main(String[] args) {
		Myclass myclass = new Myclass();
		change(myclass);
		System.out.println(myclass.val);
	}
	private static void change(Myclass myclass) {
//		myclass = new Myclass();
		myclass.val = 2;
	}
}

