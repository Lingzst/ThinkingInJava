package com.lingzst.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {
	public void run() {
		try {
			while(true) {
				TimeUnit.MICROSECONDS.sleep(1000);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService exec =  Executors.newCachedThreadPool(new DaemonThreadFactory());
		for(int i = 0; i < 10; i++)
			exec.execute(new DaemonFromFactory());
		System.out.println("All daemons started");
		TimeUnit.MILLISECONDS.sleep(2);
	}

}
