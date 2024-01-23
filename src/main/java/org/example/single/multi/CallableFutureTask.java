package org.example.single.multi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableFutureTask {
    public static void run() throws ExecutionException, InterruptedException {

    Callable task = () -> "Hello. My name is " + Thread.currentThread().getName() + ". I was invoked by FutureTask!";

        FutureTask<String> future = new FutureTask<>(task);
        new Thread(future).start();
        System.out.println(future.get());
    }
}
