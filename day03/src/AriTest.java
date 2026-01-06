/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/6
 */
public class AriTest {
    public static void main(String[] args) {
        /*int i=10;
        System.out.println(i);
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);*/


        /*int i=10;
        int j=i++;
        System.out.println(j);
        System.out.println(i);*/

        //特殊情况

        /*int i=10;
        i=i++;  //换成++i值为11
        System.out.println(i);*/

        int i=10;  //i=10
        int j=i++;  //i=11,j=10
        int m=i+++j; //i++执行 m=21 i=12 j =10
        int n=j--+m; //n=31 j=9
        System.out.println(i);
        System.out.println(j);
        System.out.println(m);
        System.out.println(n);


    }
}
