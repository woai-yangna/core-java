import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/5
 */
public class day02 {
    public static void main(String[] args) {
        //第一题 数字123反转
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的数：");
        int the_first=scanner.nextInt();
        int the_two=the_first/100;
        int the_three=(the_first-the_two*100)/10;
        int the_four=the_first%10;
        System.out.print(the_four);
        System.out.print(the_three);
        System.out.println(the_two);

        //第二题 保留两位小数
        System.out.println("请输入小数：");
        double d1=scanner.nextDouble();
        d1=d1*100;
        int d2=(int)d1;
        //这里也可以把100换成小数已达到相同的效果，在100后面加个d
        double d3=(double)d2/100;
        System.out.println("所得结果为：");
        System.out.println(d3);


        //作业三  四舍五入保留两位小数
        System.out.println("请输入小数：");
        double d4=scanner.nextDouble();
        d4=d4*100+0.5;
        int d5=(int)d4;
        //这里也可以把100换成小数已达到相同的效果，在100后面加个d
        double d6=(double)d5/100;
        System.out.println("所得结果为：");
        System.out.println(d6);

    }
}
