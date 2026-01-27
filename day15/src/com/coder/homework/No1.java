package com.coder.homework;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/26
 */
public class No1 {
    public static void main(String[] args) {
        Timer timer=new Timer();
        Random random = new Random();
        int range=1000;
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                System.out.println(getRandom(random,1000));
            }
        },0,2);
    }
    public static int getRandom(Random random,int range){
        return random.nextInt(range);
    }
}
