package HomeWork;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/14
 */
public class No1 {
    public static void main(String[] args) {
        /*int[] x={12,34,56,13};
        int[] y=Arrays.copyOf(x,4);
        Arrays.sort(y);
        boolean b=Arrays.equals(x,y);
        System.out.println("是否有序吗？"+b);*/
        int[] x={12,43,34,45,56};
        boolean b=true;
        for (int i = 0; i < x.length-1; i++) {
            if(x[i]>x[i+1]){
                b=false;
                break;
            }
        }
        System.out.println(b?"有序":"无序");
    }
}
