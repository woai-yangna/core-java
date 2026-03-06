package com.coder.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/10
 */
public class TimeInterval {
    public static int countMonth(LocalDate date){
        LocalDate nowTime=LocalDate.now();
        long between = ChronoUnit.MONTHS.between(date, nowTime);
        return (int) between;
    }
}
