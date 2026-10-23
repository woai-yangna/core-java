package com.coder.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/23
 */
public class Login {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入用户名字");
        String name = sc.next();
        boolean b = Register.FindName(name,"d:/r");
        if(!b){
            System.out.println("注册失败");
        }else{
            ObjectInputStream  os= new ObjectInputStream(new FileInputStream("d:/r"+name));
            User o = (User)os.readObject();
            String password = o.getPassword();
            System.out.println("用户输入密码");
            String pass = sc.next();
            if(pass.equals(password)){
                System.out.println("注册成功");
            }else{
                System.out.println("失败");
            }
        }
    }

}
