package shuzu;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] x={12,34,21,52,43};
        //快速排序算法>选择排序>冒泡排序
        Arrays.sort(x);
        for (int a : x) {
            System.out.println(a+"\t");
        }
    }
}
