package com.lingzst.concurrency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;

class LiftOffRunner implements Runnable {

    private BlockingQueue<LiftOff> rockets;

    public LiftOffRunner(BlockingQueue<LiftOff> queue) {
        rockets = queue;
    }

    public void add(LiftOff liftOff) {
        try {
            rockets.put(liftOff);
        } catch (InterruptedException e) {
            System.out.println("Interrupted during put()");
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                LiftOff rocket = rockets.take();
                rocket.run();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted during run take()");
        }
        System.out.println("Exiting LiftOffRunner");
    }

}

public class TestBlockingQueues {
    static void getKey() {
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void getKey(String msg) {
        System.out.println(msg);
        getKey();
    }

    static void test(String msg, BlockingQueue<LiftOff> queue) {
        System.out.println(msg);
        LiftOffRunner runner = new LiftOffRunner(queue);
        Thread t = new Thread(runner);
        t.start();
        for (int i = 0; i < 5; i++) {
            runner.add(new LiftOff(5));
        }
        getKey("Press 'Enter' (" + msg + " test");
        t.interrupt();
        System.out.println("Finished " + msg + " test");
    }

    public static void main(String[] args) {
        test("LinkedBlockingQueue", new LinkedBlockingDeque<>());
        test("ArrayBlockingQueue", new ArrayBlockingQueue<>(3));
        test("SynchronousQueue", new SynchronousQueue<>());
    }
}
