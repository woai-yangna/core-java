package shuzu;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class Bubble {
    public static void main(String[] args) {
      int[] x={15,7,12,2,8,16};
      for(int i=0;i<x.length-1;i++){
          for(int j=0;j<x.length-1;j++){
              if(x[j]>x[j+1]){
                  int t=x[j];
                  x[j]=x[j+1];
                  x[j+1]=t;
              }
          }
      }
        for (int a : x) {
            System.out.print(a+"\t");
        }
    }
}
