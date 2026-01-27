package com.coder.math.Enum;

import java.util.Random;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/26
 */
public class Test {
    public static void main(String[] args) {
        Goods goods=new Goods(1,"手机",StatusEnum.IN);
        StatusEnum[] values=StatusEnum.values();
        int x=new Random().nextInt(2);
        switch (values[x]){
            case IN :
                System.out.println("入库");
                break;
            case OUT:
                System.out.println("出库");
                break;
        }
    }
}
