package com.coder.homework;

import java.io.*;
import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/23
 */
public class Register {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入用户名字");
        String name = sc.next();
        boolean b = FindName(name,"d:/r");
        if(b){
            System.out.println("注册失败");
        }else{
            System.out.println("输入密码");
            String password = sc.next();
            User user=new User();
            user.setName(name);
            user.setPassword(password);
            File dir=new File("d:/r");
            File file=new File(dir,name+".user");
            ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(file));
            os.writeObject(user);
            os.close();
        }
    }
    public static boolean FindName(String name, String dir){
        File f1=new File(dir);
        File[] files = f1.listFiles();
        String fileName= f1.getName();
        String substring = fileName.substring(0, fileName.lastIndexOf("."));
        for (File file : files) {
            if(name.equals(substring)){
                return true;
            }
        }
        return  false;
    }
}
