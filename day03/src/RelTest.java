import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/6
 */
public class RelTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字比较：");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        boolean b=x>y;
        boolean b1=x>=y;
        System.out.println(x+"是不是大于"+y+":"+b);
        System.out.println(x+"是不是大于等于"+y+":"+b1);

    }
}
