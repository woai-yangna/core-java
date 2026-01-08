package while_demo;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class Game1 {
    public static void main(String[] args) {
       /* double d=Math.random()*3;
        int x=(int)d+5;
        System.out.println(x);*/

        int p=300;
        int b=500;
        int i =1;
        while(true){
            System.out.println("第"+(i++)+"个回合");
            int  pg=(int)(Math.random()*4)+5;
            b=b-pg;
            System.out.println("玩家攻击暗影主宰，暗影主宰掉了"+pg+"还剩"+b+"点血");
            if (b<=0){
                break;
            }

            int bg =(int)(Math.random()*3)+3;
            p=p-bg;
            System.out.println("玩家还剩"+p+"点血");
            System.out.println("------------------------------");
            if (p<=0){
                break;
            }
        }
//        if(b<=0){
//            System.out.println("玩家胜利");
//        }else {
//            System.out.println("暗影主宰胜利");
//        }

        System.out.println(b<=0?"玩家胜利":"主宰胜利");
    }
}
