package com.lingzst.typeinformation;

class C implements A {
	public void f() {
		System.out.println("f()");
	}

	@Override
	public void g() {
		System.out.println("g()");
	}
	
	public void u() {
		System.out.println("u()");
	}
	
}
public class HiddenC {
	public static A makeA() {
		return new C();
	}
}