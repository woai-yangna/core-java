package HomeWork;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/14
 */
public class No4 {
    public static void main(String[] args) {
        String[][] cards=new String[4][13];
        String[] types={"黑桃","红桃","梅花","方块"};
        String[] palyCards={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
               cards[i][j]=types[i]+palyCards[j];
            }
        }
        for (String[] a : cards) {
            for (String s : a) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }
    }
}
