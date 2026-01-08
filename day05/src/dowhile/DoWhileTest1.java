package dowhile;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class DoWhileTest1 {
    public static void main(String[] args) {
        int i =1;
        int s=0;
        do{
            s+=i;
            i++;
        }while(i<=100);
        System.out.println(i);
    }
}
