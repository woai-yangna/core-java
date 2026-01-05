/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/5
 */
import java.util.Scanner;
public class FromKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        long l=scanner.nextLong();
        double d=scanner.nextDouble();
        int z=x+y;

        System.out.println(z);
    }
}
