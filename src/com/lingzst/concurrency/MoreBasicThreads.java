package com.lingzst.concurrency;

public class MoreBasicThreads  {
	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			new Thread(new LiftOff()).start();
		}
		System.out.println("Waiting for LiftOff");
	}
	
}
