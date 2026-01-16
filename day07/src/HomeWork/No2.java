package HomeWork;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class No2 {
    public static void main(String[] args) {
        int m= juedui(-3);
        System.out.println(m);
    }
    public static int juedui(int x){
        return x>=0? x:-x;
//        if(x>=0){
//            return x;
//        }else{
//            return -x;
//        }
    }
}
