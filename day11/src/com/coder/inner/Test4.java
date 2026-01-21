package com.coder.inner;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test4 {
    public static void main(String[] args) {
        OuterFinal outerFinal=new OuterFinal();
        outerFinal.test();
    }
}
class OuterFinal{
    public void test(){
        int x=10;
        class InnerFinal{
            public void add(){
                //x=20;
                System.out.println(x);
            }
        }
        new InnerFinal().add();
    }
}