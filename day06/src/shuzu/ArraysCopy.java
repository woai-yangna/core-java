package shuzu;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class ArraysCopy {
    public static void main(String[] args) {
        int[] x={12,23,34,45,32,51};
        int[] y= Arrays.copyOf(x,5);
        System.out.println(Arrays.toString(y));
        int[] z=Arrays.copyOfRange(x,1,5);
        System.out.println(Arrays.toString(z));


    }
}
