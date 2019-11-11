package com.indra.javapractice.main;

import com.indra.javapractice.java8.StreamPractice;

public class StreamMainClass {
    public static void main(String[] args) {
        StreamPractice streamPractice = new StreamPractice();
        streamPractice.loadAllCollection();
        System.out.println(streamPractice.getEmpList() + "\n" + streamPractice.getEmployeeMap() + "\n" + streamPractice.getEmployeeSet());
    }
}
