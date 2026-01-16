package method;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(ceil(-3.5));
        int[] x={1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(x));
    }
    //完成大于等于给定浮点数的最小整数 -3.0 -3 -2 -1
    public static int ceil(double d){
        if (d > 0) {
            int x=(int)d;
            if (x == d) {
                return x;
            }else{
                return x+1;
            }
        }else{
            return (int)d;
        }
    }
    public static int sum(int[]x){
        int sum=0;
        for (int a : x) {
            sum+=a;
        }
        return sum;
    }
}
