package shuzu;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] x={12,23,21,56,24,19};
        Arrays.sort(x);//如果没排序可能返回负值
        System.out.println(Arrays.toString(x));
        int i =Arrays.binarySearch(x,56);
        System.out.println(i);
    }
}
