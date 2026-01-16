package shuzu;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/9
 */
public class Test1 {
    public static void main(String[] args) {
        int[] x={12,23,21,43,15};
        int len =x.length;
        for (int i = 0; i <len ; i++) {
            System.out.println(x[i]);
        }
        for (int a : x) {
            System.out.println(a);
        }   //x.for
        for (int i = x.length - 1; i >= 0; i--) {
          System.out.println(x[i]);
        }   //倒着写  x.forr
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }   //x.fori


    }
}
