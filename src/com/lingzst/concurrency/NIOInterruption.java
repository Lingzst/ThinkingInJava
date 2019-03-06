package com.lingzst.concurrency;

import java.io.IOException;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NIOBlcked implements Runnable{
    private final SocketChannel sc;
    public NIOBlcked(SocketChannel sc) {
        this.sc = sc;
    }
    @Override
    public void run() {
        System.out.printf("Waiting for read() in " + this);
        try {
            sc.read(ByteBuffer.allocate(1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
public class NIOInterruption {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();


    }
}
