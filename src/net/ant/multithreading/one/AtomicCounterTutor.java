package net.ant.multithreading.one;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AtomicCounterTutor {
    int counter = 0;

    class TestThread implements Runnable{
        String threadName;

        public TestThread(String threadName){
            this.threadName = threadName;
        }


        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter++;
                Thread.yield();
            }
        }
    }

    @Test
    public void testThread() {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(new TestThread("t" + i)));
        }
        System.out.println("Starting threads");

        for (int i = 0; i < 100; i++) {
            threads.get(i).start();
        }

        try {
            for (int i = 0; i < 100; i++) {
                threads.get(i).join();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Counter = " + counter);


    }
}
