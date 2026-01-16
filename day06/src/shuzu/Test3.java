package shuzu;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/9
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入学生人数");
        int len=sc.nextInt();
        int[] scores = new int[len];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请为学生录入分数");
            scores[i] = sc.nextInt();
        }
        int sum=0;
        for (int a : scores) {
            sum+=a;
        }
        System.out.println("总成绩："+sum);
        System.out.println("平均成绩"+sum*1.0/len);

        /*for (int score : scores) {
            System.out.println(score);
        }*/
        int max = scores[0];
        for (int i = 1; i <len ; i++) {
            if(scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println(max);
    }

}
