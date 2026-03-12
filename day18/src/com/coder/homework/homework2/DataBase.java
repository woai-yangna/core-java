package com.coder.homework.homework2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/3
 */
public class DataBase {
    private static List<Staff> list;
    static{
        list=new ArrayList<>(6);
        list.add(new Staff("T1032","李白","男",25,
                Date.parse("2021-12-20"),10000,"吉林省长春市"));
        list.add(new Staff("C1048","杜甫","女",30,
                Date.parse("2017-10-10"),12000,"江苏省南京市"));
        list.add(new Staff("C1052","白居易","男",28,
                Date.parse("2019-05-22"),15000,"江苏省苏州市"));
        list.add(new Staff("T1035","李清照","女",31,
                Date.parse("2015-04-12"),14000,"吉林省吉林市"));
        list.add(new Staff("C1066","陆游","男",40,
                Date.parse("2019-05-22"),20000,"江苏省南京市"));
        list.add(new Staff("C1088","贺知章","男",35,
                Date.parse("2021-12-20"),16000,"上海市"));
    }
    public static List<Staff> getList(){
        return list;
    }
    public static void showStaffInformation(){
        for (Staff staff : list) {
            System.out.println(staff);
        }
    }

}
