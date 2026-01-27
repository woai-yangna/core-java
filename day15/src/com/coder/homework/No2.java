package com.coder.homework;

import java.util.Locale;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/26
 */
public class No2 {
    public static void main(String[] args) {
        String property = System.getProperty("os.name");
        System.out.println(property);
        property=property.substring(0,property.indexOf(" ")).toUpperCase(Locale.ROOT);
        System.out.println(property);
        switch (SystemEnum.valueOf(property)){
            case WINDOWS:
                System.out.println("推介使用IE浏览器");
                break;
            case LINUX:
                System.out.println("推介使用Chrome浏览器");
                break;
            case MAC:
                System.out.println("推介使用ww浏览器");
        }
    }
}
