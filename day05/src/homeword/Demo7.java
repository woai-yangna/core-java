package homeword;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class Demo7 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5; j++) {
                if(i==1||i==5||(i+j)==6){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
