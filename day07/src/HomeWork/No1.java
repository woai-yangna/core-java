package HomeWork;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class No1 {
    public static void main(String[] args) {
        double[] x={3.1415,5.6789,4.523,7.658};
        fu(x);
        System.out.println(Arrays.toString(x));
    }
    public static void fu(double[] x){
        for (int i = 0; i <x.length ; i++) {
            x[i]=kk(x[i]);
        }
    }
    public static double kk(double v){
        return (int)(v*100+0.5)/100D;
    }
}
