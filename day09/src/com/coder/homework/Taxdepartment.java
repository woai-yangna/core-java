package com.coder.homework;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
/*      (1)1.0升(含)以下360元
        (2)1.0升以上至1.6升(含) 420元
        (3)1.6升以上至2.0升(含) 540元
        (4)2.0升以上至2.5升(含) 800元
        (5)2.5升以上至3.0升(含) 1800元
        (6)3.0升以上至4.0升(含) 2800元
        (7)4.0升以上3600元*/
public class Taxdepartment {
    public void tax(Car[] cars) {
        int total = 0;
        for (Car car : cars) {
            double pailiang = car.getPailiang();
            String b = car.getBrand();

            if (pailiang <= 1.0) {
                System.out.println(b + "收取360");
                total += 360;
            } else if (pailiang <= 1.6) {
                System.out.println(b + "收取420");
                total += 420;
            } else if (pailiang <= 2.0) {
                System.out.println(b + "收取540");
                total += 540;
            } else if (pailiang <= 2.5) {
                System.out.println(b + "收取800");
                total += 800;
            }else if(pailiang<=3.0) {
                System.out.println(b + "收取1800");
                total += 1800;
            }else if(pailiang<=4.0) {
                System.out.println(b + "收取2800");
                total += 2800;
            }else{
                System.out.println(b + "收取3600");
                total += 3600;
            }
        }
        System.out.println("税务局总共收取了"+total+"的费用");
    }
}
