package homeword;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class Demo6 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for(int m=1;m<i;m++){
                System.out.print(" ");//写这个图形的时候集得不要换行
            }
            for (int j = 1; j <=20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
