package com.coder.hasa;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test {
    public static void main(String[] args) {
        Temple temple=new Temple();
        temple.setName("少林寺");
        temple.setArea(2000);

        Temple temple1=new Temple();
        temple1.setName("土地庙");
        temple1.setArea(500);

        Mountain mountain=new Mountain();
        mountain.setName("嵩山");
        mountain.setTemple(temple1);

        Monk monk=new Monk();
        monk.setName("觉远");
        monk.becomeMonk(mountain);
    }
}
