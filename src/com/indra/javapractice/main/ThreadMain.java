package com.indra.javapractice.main;

import com.indra.javapractice.Threads.ThreadPractice;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadPractice threadPractice = new ThreadPractice();
        ThreadPractice threadPractice2 = new ThreadPractice();
        threadPractice.start();
        threadPractice2.start();
        //threadPractice2.join();
    }
}
