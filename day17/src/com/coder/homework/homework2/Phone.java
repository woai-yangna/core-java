package com.coder.homework.homework2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/6
 */
public class Phone {
    public static String getPhoneNumber(Random random){
        String prefix="1";
        List<String> list1= Arrays.asList("3","5","7","8","9");
        int i = random.nextInt(list1.size());
        return prefix+list1.get(i)+getSuffix(random);
    }
    private static String getSuffix(Random random){
        String suffix="";
        for (int i = 0; i < 9; i++) {
            suffix+=random.nextInt(10);
        }
        return suffix;
    }
}
