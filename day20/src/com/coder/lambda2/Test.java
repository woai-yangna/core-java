package com.coder.lambda2;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/8/6
 */
public class Test {
    public static void main(String[] args) {
        //MyInter inter=()-> System.out.println("hello");
        /*MyInter inter1=()->{
            System.out.println("hello");
            System.out.println("lambda");
        }*/
        /*MyInter2<String> inter2=(x)->{
            System.out.println(x);
        };*/
//        MyInter3 inter3=x->Math.abs(x);
        MyInter4 inter4=(x,y)->{
            int sum=1;
            for (int i = 0; i <=y; i++) {
                sum*=x;
            }
            return sum;
        };
    }
    interface MyInter{
        void test();
    }
    interface MyInter1{
        void test();
    }
    interface MyInter2<T>{
        void test(T t);
    }
    interface MyInter3{
        Integer abs(Integer x);
    }
    interface MyInter4{
        int pow(int x,int y);
    }
}
