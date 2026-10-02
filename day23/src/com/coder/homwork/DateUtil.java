package com.coder.homwork;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/2
 */
public class DateUtil {
    public static String format(long timestamp){
        Date date=new Date(timestamp);
        ZonedDateTime zonedDateTime = date.toInstant().atZone(ZoneId.systemDefault());
        LocalDateTime datetime=zonedDateTime.toLocalDateTime();
        return datetime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
    }
}
