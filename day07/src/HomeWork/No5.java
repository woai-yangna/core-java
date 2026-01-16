package HomeWork;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/13
 */
public class No5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入一个国家");
        String country=sc.next();
        boolean b=isCountry(country);
        System.out.println(b?"是常任理事国":"不是常任理事国");
    }
    public static boolean isCountry(String country){
        String[] countries={"中国","美国","英国","法国","俄罗斯"};
        for (String s : countries) {
            if(s.equals(country)){
                return true;
            }
        }
        return false;
    }
}
