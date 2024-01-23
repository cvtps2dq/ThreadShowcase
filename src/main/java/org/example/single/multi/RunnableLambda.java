package org.example.single.multi;

public class RunnableLambda {
    Runnable task = () -> System.out.println("Hello. My name is " + Thread.currentThread().getName()
            + ". I was invoked by " +
            "Runnable interface! (using lambda expression)");

    public void run(){
        Thread thread = new Thread(this.task);
        thread.start();
    }
}
