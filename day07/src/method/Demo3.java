package method;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class Demo3 {
    public static void main(String[] args) {
        add(12,13,14,143);
    }
    public static void add(int... x){//这边x你当个数组就行
        for (int i : x) {
            System.out.println(i);
        }
    }
}
