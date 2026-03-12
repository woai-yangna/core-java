package com.coder.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/10
 */
public class Test {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        //不是按照顺序放的，按照hash散列函数放的
        set.add("sss");
        set.add("abc");
        set.add("ttt");
        set.add("yyy");
        set.add("xxx");
        System.out.println(set);

    }
}
