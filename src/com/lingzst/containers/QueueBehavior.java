package com.lingzst.containers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import com.lingzst.generic.Generator;

public class QueueBehavior {
	private static int count = 10;
	static <T> void test(Queue<T> queue, Generator<T> gen) {
		for(int i = 0; i < count; i++) {
			queue.add(gen.next());
		}
		while(queue.peek() != null)
			System.out.println(queue.remove() + " ");
		System.out.println();
	}
	static class Gen implements Generator<String> {
		String[] s = ("one two three four five six seven " +"eight nine ten").split(" ");
		int i;
		public String next() {
			return s[i++];
		}
	}
	public static void main(String[] args) {
		test(new LinkedList<String>(), new Gen());
		test(new PriorityQueue<String>(), new Gen());
		test(new ArrayBlockingQueue<>(count), new Gen());
	}
}
