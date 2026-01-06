/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/6
 */
public class StringAri {
    public static void main(String[] args) {
        int i=10;
        int j=10;
        String x="结果";
        String s1="20";
        String y=s1+(i+j);
        System.out.println(y);
        System.out.println(x+i+j);//结果10  +起到了连字符作用️
    }
}
