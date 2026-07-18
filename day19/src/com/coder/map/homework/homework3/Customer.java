package com.coder.map.homework.homework3;

import java.util.Queue;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/7/18
 */
public class Customer {
    public void search(No3 no3){
        Queue<String> process = no3.getProcess();
        System.out.println(process.peek());
    }
}
