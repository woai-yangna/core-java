package if_test;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class If_Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int i=scanner.nextInt();
        boolean b=i%2==0;
        if(b){
            System.out.println("是偶数");
        }
    }
}
