package homeword;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */

    public class demo1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x;
            while (true) {
                System.out.println("请输入一个值");
                x = sc.nextInt();
                if (x <= 1) {
                    System.out.println("请重新输入");
                } else if (x == 2) {
                    System.out.println("输入的是素数：" + x);
                    break;
                } else {
                    boolean isPrime = true;

                    for (int i = 2; i < x; i++) {
                        if (x % i == 0) {
                            isPrime = false;
                            System.out.println("输入的不是素数，请重新输入一个值");
                            break;
                        }
                    }

                    if (isPrime) {
                        System.out.println("输入的是素数：" + x);
                        break;
                    }
                }
            }

            sc.close();
        }



    /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个值");
        int x = sc.nextInt();
        while(true) {
            if (x <= 1) {
                System.out.println("请重新输入");
                x=sc.nextInt();
            } else if (x > 1 && x != 2) {
                for (int i = 2; i < x; i++) {
                    if (x % i == 0) {
                        System.out.println("输入的不是素数，请重新输入一个值");
                        x=sc.nextInt();
                        break;
                    } else {
                        System.out.println("输入的是素数");
                    }
                }
            } else {
                System.out.println("输入的是素数：" + 2);
            }*/
}
