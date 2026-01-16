package shuzu;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class ArrayEq {
    public static void main(String[] args) {
        int[] x={12,23,34,45,56};
        int[] y= Arrays.copyOf(x,x.length);
        boolean b=Arrays.equals(x,y);
        System.out.println("b = " + b);

        int i=Arrays.compare(x,y);
        System.out.println("i = " + i);
    }
}
