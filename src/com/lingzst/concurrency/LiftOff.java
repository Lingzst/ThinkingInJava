package com.lingzst.concurrency;

public class LiftOff implements Runnable{
	protected int countDown = 10;
	private static int countTask = 0;
	private final int id = countTask++;
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ")";
	}
	public void run() {
		while(countDown-- > 0) {
			System.out.print(status());
		}
	}

}
