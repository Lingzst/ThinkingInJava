package com.lingzst.io;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class IntBufferDemo {
	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		IntBuffer ib = bb.asIntBuffer();
		ib.put(new int[] {11,23,323,3123,3123,13,123,213});
		System.out.println(ib.get(3));
		ib.put(3,1811);
		ib.flip();
		while(ib.hasRemaining()) {
			int i = ib.get();
			System.out.println(i);
		}
	}
}
