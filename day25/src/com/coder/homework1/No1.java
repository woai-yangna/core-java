package com.coder.homework1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/11/10
 */
public class No1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task1=new FutureTask<>(()->{
            int sum=0;
            for (int i = 1; i <= 500; i++) {
                sum+=i;
            }
            return sum;
        });
        FutureTask<Integer> task2=new FutureTask<>(()->{
            int sum=0;
            for (int i = 501; i <= 1000; i++) {
                sum+=i;
            }
            return sum;
        });
        Thread t1=new Thread(task1);
        t1.start();
        Thread t2=new Thread(task2);
        t2.start();
        Integer x = task1.get();
        Integer y = task2.get();
        System.out.println(x+y);
    }

}
