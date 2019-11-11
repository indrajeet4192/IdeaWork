package com.indra.javapractice.Threads;

public class ThreadPractice extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("I am Thread Number :"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
