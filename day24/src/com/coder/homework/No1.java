package com.coder.homework;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/23
 */
public class No1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User login = login();
        if(login==null){
            System.out.println("登陆失败");
        }else{
            Student student=new Student();
            student.setName(readInfo("student.name"));
            student.setGender(readInfo("student.gender"));
            student.setAge(Integer.parseInt(readInfo("student.age")));
            serialize(student);
        }
        Teacher teacher=new Teacher();
        teacher.setName(readInfo("teacher.name"));
        teacher.setGender(readInfo("teacher.gender"));
        teacher.setAge(Integer.parseInt(readInfo("teacher.age")));
        saveTeacherInfo(teacher);
    }
    public static User login() throws IOException, ClassNotFoundException {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入用户名字");
        String name = sc.next();
        boolean b = Register.FindName(name,"d:/r");
        if(!b){
            System.out.println("登录失败");
        }else{
            ObjectInputStream os= new ObjectInputStream(new FileInputStream("d:/r/" + name + ".user"));
            User o = (User)os.readObject();
            String password = o.getPassword();
            System.out.println("用户输入密码");
            String pass = sc.next();
            if(pass.equals(password)){
                System.out.println("登录成功");
                return o;
            }else{
                System.out.println("失败");
            }
        }
        return null;
    }
    public static String readInfo(String k){
        ResourceBundle bundle=ResourceBundle.getBundle("com.coder.homework.info");
        return bundle.getString(k);
    }
    public static void serialize(Student student) throws IOException {
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("d:/s"));
        os.writeObject(student);
        os.close();
    }
    public static void saveTeacherInfo(Teacher teacher) throws IOException {
        DataOutputStream d=new DataOutputStream(new FileOutputStream("d:/teacher"));
        d.writeUTF(teacher.getName());
        d.writeInt(teacher.getAge());
        d.close();
    }
    public static void log(User user) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("d:/human.log"));
        bufferedWriter.write("操作人"+user.getName());
        bufferedWriter.newLine();
        bufferedWriter.write("系统时间"+ LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        bufferedWriter.newLine();
        File file1=new File("d:/student");
        File file2=new File("d:/teacher");
        bufferedWriter.write(file1.getName()+",文件大小:"+file1.length());
        bufferedWriter.newLine();
        bufferedWriter.write(file2.getName()+",文件大小:"+file2.length());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
