package com.lingzst.typeinformation;

public class RealObject implements Interface {

	@Override
	public void doSomething() {
		System.out.println("real doSomething");
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("real somethingElse");
	}
	

}
