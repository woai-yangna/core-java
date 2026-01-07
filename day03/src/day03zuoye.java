import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class day03zuoye {
    public static void main(String[] args) {
        //题目1
        /*Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int min_1 = x < y ? x : y;
        int min_2 = min_1 < z ? min_1 : z;
        System.out.println(min_2);*/

        //题目2
        Scanner scanner =new Scanner(System.in);
        int x = scanner.nextInt();
        int y = x*9;
        int z = y>9? (y/10+y%10) : y;
        int m = z*27+7;
        System.out.println("你的姓名是"+m);






    }
}
