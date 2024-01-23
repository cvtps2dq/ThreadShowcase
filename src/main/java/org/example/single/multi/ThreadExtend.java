package org.example.single.multi;

public class ThreadExtend extends Thread{
    @Override
    public void run(){
        System.out.println("Hello. My name is " + currentThread().getName() + ". I was invoked by " +
                "creating an extension of Thread class!");
    }
}

