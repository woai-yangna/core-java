package com.coder.homework2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/11/10
 */
public class No2 {
    public static void main(String[] args) {
        RunThread t1=new RunThread(1,3);
        RunThread t2=new RunThread(3,5);
        Thread t3=new Thread(t1,"乌龟");
        Thread t4=new Thread(t2,"兔子");
        t3.start();
        t4.start();
    }
    static class RunThread implements Runnable{
        private int min;
        private int max;
        private Random random;
        private boolean rest=false;
        public RunThread() {
        }
        public RunThread(int min,int max){
            this.min=min;
            this.max=max;
            random=new Random();
        }
        @Override
        public void run() {
            int length=0;
            while(length<100){
                int i = random.nextInt(max - min + 1) + min;
                length+=i;
                String name = Thread.currentThread().getName();
                if(name.equals("兔子")){
                    if(length>=70 && !rest){
                        try {
                            System.out.println("兔子停下xia");
                            rest=true;
                            TimeUnit.MILLISECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println(name+"跑"+length);
            }
        }
    }
}
