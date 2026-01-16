package shuzu;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class ArraysFill {
    public static void main(String[] args) {
        int[] x=new int[5];
        /*for (int i = 0; i < x.length; i++) {
            x[i]=100;
        }*/
//        Arrays.fill(x,200);//不管你原来值，都直接替换
        //起始位置包含，结束位置不包含  [0, 200, 200, 0, 0]
        Arrays.fill(x,1,3,200);
        System.out.println(Arrays.toString(x));
    }
}
