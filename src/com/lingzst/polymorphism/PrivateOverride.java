package com.lingzst.polymorphism;

public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
		System.out.println(po instanceof Test);
	}
}

class Derived extends PrivateOverride {
	public void f() {
		System.out.println("public f()");
	}
}

class Test extends PrivateOverride{
	
}