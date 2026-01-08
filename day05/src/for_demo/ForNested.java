package for_demo;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/8
 */
public class ForNested {
    public static void main(String[] args) {
        for(int x=1;x<=9;x++){
            for(int y=1;y<=12;y++){
                for(int z=2;z<=36-x-y;z+=2) {
                    if(x+y+z==36 && 4*x+3*y+0.5*z==36){
                        System.out.println("男人："+x);
                        System.out.println("女人："+y);
                        System.out.println("小孩："+z);
                    }
                }
            }
        }
    }
}



