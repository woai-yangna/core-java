package com.coder.inner;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.test();
    }
}
class Outer {
    private int x = 10;
    private static int z=20;
    class Inner {
        int x = 20;
        public void test() {
            System.out.println(x+"\t"+Outer.this.x);
        }
    }
}