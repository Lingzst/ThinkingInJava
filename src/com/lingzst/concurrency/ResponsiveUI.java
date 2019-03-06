package com.lingzst.concurrency;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class UnresponsiveUI {
	private volatile double d = 1;
	public UnresponsiveUI() throws Exception {
		while(d > 0)
			d = d + (Math.PI + Math.E);
		System.in.read();
	}
}

public class ResponsiveUI extends Thread {
	private static volatile double d = 1;
	public ResponsiveUI() {
		setDaemon(true);
		start();
	}
	public void run() {
		while(true) {
			d = d + (Math.PI + Math.E) / d;
		}
	}
	public static void main(String[] args) throws Exception {
//		new UnresponsiveUI();
		new ResponsiveUI();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.read();
		System.out.println(d);
	}
}
