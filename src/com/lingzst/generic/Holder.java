package com.lingzst.generic;

public class Holder<T> {
	public T a;
	public Holder(T a) {
		this.a = a;
	}
	public void set(T a) {
		this.a = a;
	}
	public T get() {
		return a;
	}
	public static void main(String[] args) {
		System.out.println(new Holder<>("fjsfoe").a);
		
	}
}
