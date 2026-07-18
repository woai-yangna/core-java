package com.coder.map.homework.homework3;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/7/18
 */
public class Test {
    public static void main(String[] args) {
        No3 no=new No3();
        no.setN("sykaijians123");
        no.setProcess(getProcess());
        no.setNewProcess(new ArrayDeque<>());
        Work work=new Work();
        work.doWork(no);
        Customer customer=new Customer();
        customer.search(no);
    }
    public static Queue<String> getProcess(){
        Queue<String> queue=new ArrayDeque<>();
        queue.offer("货品已出库");
        queue.offer("上门收取快递");
        queue.offer("送到快递分包中心");
        queue.offer("货物运输途中");
        queue.offer("货物已由快递员送货到小区分配中心");
        queue.offer("货物已被取走");
        queue.offer("已全部完成");
        return queue;
    }
}
