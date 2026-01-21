package com.coder.inner;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test1 {
    public static void main(String[] args) {
        OuterStatic.InnerStatic innerStatic=new OuterStatic.InnerStatic();
        innerStatic.test();
        OuterStatic.InnerStatic.test1();
    }
}
class OuterStatic{
    private int x=10;
    public static void test1(){
    }
    static class InnerStatic{
        private static int y=20;
        public static void test1(){

        }
        public void test(){
            test1();
            OuterStatic outer=new OuterStatic();
            System.out.println(outer.x);
        }
    }
}