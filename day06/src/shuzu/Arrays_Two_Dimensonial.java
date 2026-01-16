package shuzu;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class Arrays_Two_Dimensonial {
    public static void main(String[] args) {
        int[][] c=new int[3][];
        int[] arr0={12,23};
        int[] arr1={34,45,56};
        int[] arr2={54,43,32};
        c[0]=arr0;
        c[1]=arr1;
        c[2]=arr2;
        for (int[] a : c) {
            for (int i : a) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
