package com.indra.javapractice.utils;

import com.indra.javapractice.service.ValidationServiceRequest;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class StaticPractice {
    static ValidationServiceRequest validationServiceRequest = null;
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        validationServiceRequest.printMessage();
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>();
       /* StaticPractice staticPractice = (StaticPractice) Class.forName("StaticPractice").newInstance();
        staticPractice.displayMessage();*/
        System.out.println(returnException(1));

    }
    static Exception returnException(int i){
        if(i>0){
            return new Exception();
        }else{
            throw new RuntimeException();
        }
    }

    private void displayMessage() {
        System.out.println("I am static practice display message");
    }

    public StaticPractice() {
        System.out.println("I am constructor");
    }

    private static StaticPractice staticPac = null;

    static{
        staticPac = new StaticPractice();
    }
}
