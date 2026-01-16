package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class No3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请选择彩票类型 3.3D类型  5.5D类型");
        int t=sc.nextInt();
        while (true){
            if(t==3 ||t==5){
                break;
            }
            System.out.println("请重新输入");
            t=sc.nextInt();
        }
        System.out.println("请录入要购买的注数");
        int z=sc.nextInt();
        int[][] x=ll(t,z);
        print(x);
    }
    public static int[][] ll(int t,int z){
        int[][] x=new int[z][t];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j]=(int)(Math.random()*10);
            }
        }
        return x;
    }
    public static void print(int[][] x){
        for (int[] a : x) {
                System.out.println(Arrays.toString(a));
            /*for (int w : a) {
                System.out.print(w+"\t");
            }*/
        }
    }
}
