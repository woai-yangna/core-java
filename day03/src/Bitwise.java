/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class Bitwise {
    public static void main(String[] args) {
       /* int x=8;
        int y=5;
        //不通过第三方变量做交换处理

        x=x^y;
        y=y^x;
        x=x^y;
        System.out.println(x&y);*/

      /*  //按位取反
        int x=2;
        System.out.println(~x);*/

        //左移一位相当于乘2   右移相当于除2
//


        int x=10;
        int y=5;
        int z=6;
        boolean b= (x>y) | (y<z) & (x<z);
        System.out.println(b);

    }
}
