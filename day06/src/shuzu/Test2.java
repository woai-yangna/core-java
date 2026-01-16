package shuzu;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/9
 */
public class Test2 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        int[] y = {5,6,7,8,9};
        int[] z= new int[x.length+y.length];
        for (int i = 0; i <z.length; i++) {
            if(i<x.length){
                z[i]=x[i];
            }else{
                z[i]=y[i-x.length];
            }
        }
        for (int a : z) {
            System.out.println(a);
        }
    }

}
