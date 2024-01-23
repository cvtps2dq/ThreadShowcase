package org.example.single.multi;

public class RunnableTask {
    Runnable task = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello. My name is " + Thread.currentThread().getName() + ". I was invoked by " +
                    "Runnable interface!");
        }
    };

    public void run(){
        Thread thread = new Thread(this.task);
        thread.start();
    }
}
