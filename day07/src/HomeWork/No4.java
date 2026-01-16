package HomeWork;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class No4 {
    public static void main(String[] args) {
        int[] x={1,12,3,4,5,10};
        boolean b=zz(x,11);
        System.out.println("b= "+b);
    }
    public static boolean zz(int[] x,int y) {
        Arrays.sort(x);
        int i = Arrays.binarySearch(x, y);
        return i>=0;
    }
}
