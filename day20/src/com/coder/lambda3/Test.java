package com.coder.lambda3;

import java.util.function.Consumer;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/8/13
 */
public class Test {
    public static void main(String[] args) {
        testConsumer();
    }
    public static void testConsumer(){
        Consumer<Integer> c1=money-> System.out.println("客户1花"+money+"元,买了游戏装备");
        buy(1000,c1);
    }
    public static void buy(int money, Consumer<Integer> consumer){
        consumer.accept(money);
    }
}
