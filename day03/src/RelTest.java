/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/6
 */
public class RelTest {
    public static void main(String[] args) {


        int x=10;
        int y=5;
        int z=2;
        boolean b3 =(x<y) && (5 /0 >z);
        boolean b4 =(x<y) || (5 /0 >z);
        System.out.println(b3);



        /*Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字比较：");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        boolean b1=x>y;
        boolean b2=y>z;
        boolean b3=b1 & b2;
        boolean b4=b1 | b2;
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(!b4);*/

        /*boolean b=x>y;
        boolean b1=x>=y;
        boolean b2=x<=y;
        boolean b3=x==y;
        boolean b4=x!=y;
        System.out.println(x+"是不是大于"+y+":"+b);
        System.out.println(x+"是不是大于等于"+y+":"+b1);
        System.out.println(x+"是不是小于等于"+y+":"+b2);
        System.out.println(x+"是不是等于"+y+":"+b3);
        System.out.println(x+"是不是不等于"+y+":"+b4);*/


    }
}
