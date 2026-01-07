package com.coder.pested;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class Game {
    public static void main(String[] args) {
        //石头剪刀步
        double d=Math.random();
        int s=(int) (d*3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("英雄好汉请出题：0 石头   1 剪刀   2 布");
        int u = scanner.nextInt();
        if (u==0){
            System.out.println("我出的是石头");
            if (s==0){

            }else if(s==1){

            }else{

            }
        }else if(u==1) {


        }else if(u==2){

        }else {
            System.out.println("出错了");
        }



    }
}
