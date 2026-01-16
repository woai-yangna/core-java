package HomeWork;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/14
 */
public class No5 {
    public static void main(String[] args) {
        int[][] y=new int[10][];
        for (int i = 0; i < y.length; i++) {
            y[i]=new int[i+1];
        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                if (i == j || j == 0) {
                    y[i][j]=1;
                }else{
                    y[i][j]=y[i-1][j-1]+y[i-1][j];//y[2][1]=y[1][0]+y[1][1]
                }
            }
        }
        for (int[] a : y) {
            for (int i : a) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
