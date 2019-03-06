package com.lingzst.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//进入公园人数类
class Count {
	private int count = 0;
	private Random rand = new Random(47);
	public synchronized int increment() {
		int temp = count;
		if(rand.nextBoolean())
			Thread.yield();				//加快线程切换
		return count = ++temp;
	}
	public synchronized int value() {
		return count;
	}
}
 
class Entrance implements Runnable {
	//Entrance共享公园人口数
	private static Count count = new Count();
	//公园所有入口
	private static List<Entrance> entrances = new ArrayList<Entrance>();
	//此入口进入的人数量
	private int number  = 0;
	//入口id
	private final int id;
	//禁止入内参数
	private static volatile boolean canceled = false;
	//初始化入口，必将此入口注册到入口list
	public  Entrance(int id) {
		this.id = id;
		entrances.add(this);
	}
	//共享的禁止入内操作
	public static void cancel() {
		canceled = true;
	}

	@Override
	public void run() {
		while(!canceled) {
			synchronized(this) {
				++number;
			}
			System.out.println(this + " Total: " + count.increment());
			try {
				TimeUnit.MICROSECONDS.sleep(100);
			} catch(InterruptedException e) {
				System.out.println("sleep interrunpted");
			}
		}
		System.out.println("Stopping " + this);
	}
	
	public synchronized int getValue() {
		return number;
	}
	
	public String toString() {
		return "Entrance " + id + ": " + getValue();
	}
	
	public static int sumEntrances() {
		int sum = 0;
		for(Entrance entrance : entrances) {
			sum += entrance.getValue();
		}
		return sum;
	}
	
	public static int getTotalCount() {
		return count.value();
	}
}
public class OrnamentalGarden {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++) {
			exec.execute(new Entrance(i));
		}
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Entrance.cancel();
		exec.shutdown();
		try {
			if(!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
				System.out.println("Some tasks were not terminated");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Total: "+ Entrance.getTotalCount());
	}
}
