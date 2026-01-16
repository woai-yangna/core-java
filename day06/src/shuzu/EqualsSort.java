package shuzu;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class EqualsSort {
    public static void main(String[] args) {
        int[] x=new int[10000];
        for (int i = 0; i <x.length ; i++) {
            x[i]=(int)(Math.random()*100000000);
        }
        long t1= System.currentTimeMillis();//得到一个从1970-01-01 00：00：00到现在的世间
        for (int i = 0; i <x.length-1 ; i++) {
            for (int j = 0; j <x.length-1-i ; j++) {
                if(x[j]>x[j+1]){
                    int t=x[j];
                    x[j]=x[j+1];
                    x[j+1]=t;
                }
            }
        }
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
