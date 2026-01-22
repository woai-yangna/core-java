package homework2;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/22
 */
public class No2 {
    public static void main(String[] args) {
        String[] ids={"22222222222223333","1234512312321312","312312312312312321"};
        Scanner sc =new Scanner(System.in);
        System.out.println("请放身份证");
        String id=sc.next();
        boolean b=false;
        for (String s : ids) {
            if (s.equals(id)){
                b=true;
                try {
                    throw new DefineException("可能是逃犯");
                }catch (DefineException e){
                    e.printStackTrace();
                }
            }
        }
        if(!b){
            System.out.println("可以入住");
        }
    }
}
