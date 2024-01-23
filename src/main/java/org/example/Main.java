package org.example;

import org.example.single.SingleThread;
import org.example.single.multi.CallableFutureTask;
import org.example.single.multi.RunnableLambda;
import org.example.single.multi.RunnableTask;
import org.example.single.multi.ThreadExtend;

public class Main {
    public static void main(String[] args) throws Exception {

        //DEFINITIONS//
        ThreadExtend threadExtend = new ThreadExtend();
        RunnableTask runnableTask = new RunnableTask();
        RunnableLambda runnableLambda = new RunnableLambda();
        //DEFINITIONS//

        // no other threads. should launch on main thread
        SingleThread.execute();

        // launching thread using thread extend class
        threadExtend.start();

        // launching thread using runnable interface
        runnableTask.run();

        // launching thread using runnable interface
        // using lambda expr.
        runnableLambda.run();

        // launching thread using FutureTask
        CallableFutureTask.run();

        // this example just scratches the paint from the threading capabilities
        // in lab tasks we have done:
        // iterative parallelism -> parallel file I/O
        // recursive parallelism -> matrix determinant calculations
        // used semaphores to "limit" thread access -> smokers problem (multiple smokers, but one table)

        // this course was fun.

    }
}