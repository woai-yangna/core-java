package homeword;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            int sum=0;
            for (int j = 1; j <i ; j++) {
                if(i%j==0){
                    sum += j;
                }
            }
            if (i==sum){
                System.out.println(i);
            }
        }
    }
}
