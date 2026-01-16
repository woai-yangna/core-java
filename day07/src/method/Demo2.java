package method;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class Demo2 {
    public static void main(String[] args) {
        int x =10;
        System.out.println(x);
        change(x); //传的是值没传地址
        System.out.println(x);
        int[] y={10,2,3};
        change1(y);
        System.out.println(y[0]);
        String z="aaa";
        change2(z);
        System.out.println(z);//传的字面量值
    }
    public static void change(int x){
        x=x*10;
    }
    public static void change1(int[] x){
        x[0]=100;
    }
    public static void change2(String x){
        x="bbb";
    }
}
