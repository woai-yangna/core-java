package homeword;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            int d = a ^ 3 + b ^ 3 + c ^ 3;
            if (d == i) {
                System.out.println("水仙花数：" + i);
                continue;
            }
        }
    }
}
