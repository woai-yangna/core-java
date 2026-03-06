package com.coder.homework;

import java.time.LocalDate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/2
 */
public class WangZhe {
    public static int buySkin(LocalDate date,LocalDate date1) {
        LocalDate week1 = date.plusDays(7);
        LocalDate week2 = date.plusDays(14);
        LocalDate week3 = date.plusDays(28);
        int i = date1.compareTo(week1);
        if (i <= 0) {
            return 8;
        } else {
            int j=date1.compareTo(week2);
            if(j<=0){
                return 9;
            }else {
                int k= date1.compareTo(week3);
                if(k<=0){
                    return 10;
                }else {
                    return -1;
                }
            }

        }

    }
}
