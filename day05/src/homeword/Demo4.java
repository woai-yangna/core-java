package homeword;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class Demo4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i+"是素数");
                }
        }
    }
}
