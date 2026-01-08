package homeword;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class Demo3 {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++) {
            for (int j = 0; j <=50; j++) {
                if((i+j)==50 && ((2*i)+(4*j))==120){
                    System.out.println("鸡有"+i+"个"+'\t'+"兔有"+j+"个");
                }else{
                    continue;
                }
            }
        }

    }
    
}
