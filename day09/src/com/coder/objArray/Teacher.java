package com.coder.objArray;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Teacher {
    public void sign(Student[] students){
        for (Student student : students) {
            String gender= student.getGender();
            if(gender.equals("男")){
                System.out.println(student.getName()+"到");
            }else{
                System.out.println(student.getName()+"有");
            }
        }

    }
}
