package com.coder.inner;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test2 {
    public static void main(String[] args) {
        OuterLocal local=new OuterLocal();
        local.test();
    }
}
class OuterLocal{
    private int x=10;
    private static void test2(){
    }
    public void testn(){

    }
    public void test(){
        int y=10;
        class InnerLocal{
            public void test1(){
                System.out.println(y);
            }
        }
        InnerLocal local=new InnerLocal();
        local.test1();
    }

}