package com.lingzst.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.imageio.stream.FileImageInputStream;

public class GetChannel {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		FileChannel fc;
		try {
			fc = new FileOutputStream("data.txt").getChannel();
			fc.write(ByteBuffer.wrap("Some text ".getBytes()));
			fc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		fc = new FileInputStream("data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining())
			System.out.print((char)buff.get());
		
	}
}
