package com.coder.likea;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public interface MyInter {
    //public MyInter(){}
    int X = 10;
    void test();//抽象方法  default
}

interface MyInter1 {
    void test1();
}

interface MyInter2 extends MyInter, MyInter1 {
    void test2();
}

class MyImpl1 implements MyInter2{
    public void test(){}
    public void test1(){}
    public void test2(){}
}

class MyImpl implements MyInter {
    public void test() { //访问权限  相同或更宽松，不能更严格
    }
}
class MyImpl2 implements MyInter{
    public void test() { //访问权限  相同或更宽松，不能更严格
    }
}
class MyImpl3 implements MyInter,MyInter1{

    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}
class F{
    public void test(){
    }
}
class S extends F implements MyInter,MyInter1{
/*
    @Override
    public void test() {
    }
*/

    @Override
    public void test1() {

    }
}