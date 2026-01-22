package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/22
 */
public class No1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入一个数");
        double c=0;

        try {
            c=sc.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("你录入的不是一个数");
            return;
        }
        double d=c*1.8+32;
        System.out.println("华氏温度:"+d);
    }
}
