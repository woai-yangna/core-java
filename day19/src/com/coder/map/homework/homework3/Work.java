package com.coder.map.homework.homework3;

import java.util.Queue;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/7/18
 */
public class Work {
    public void doWork(No3 no3){
        Queue<String> process= no3.getProcess();
        Queue<String> newProcess=no3.getNewProcess();
        String peek = process.peek();
        if(!peek.equals("已全部完成")) {
            String process1 = process.poll();
            newProcess.offer(process1);
        }
    }
}
