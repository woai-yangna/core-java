package shuzu;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/10
 */
public class selection {
    public static void main(String[] args) {
        int [] x={15,7,12,2,8};
        for(int z=0;z<x.length-1;z++) {
            int minIndex = z;
            for (int i = z+1; i < x.length; i++) {
                if (x[i] < x[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != z) {
                x[z] = x[z] ^ x[minIndex];
                x[minIndex] = x[minIndex] ^ x[z];
                x[z] = x[z] ^ x[minIndex];
            }
            System.out.println("第"+(z+1)+"轮结束");
            for (int a : x) {
                System.out.print(a + "\t");
            }
            System.out.println();
        /*
            int temp=0;
            x[0]=x[minIndex];
            x[minIndex]=temp;
         */
        }
    }
}
