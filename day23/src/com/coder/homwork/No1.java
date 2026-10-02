package com.coder.homwork;

import java.io.File;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/17
 */
public class No1 {
    public static void main(String[] args) {
        File[] file1 = File.listRoots();
        for (File file2 : file1) {
            System.out.println(file2);
            File[] file3 = file2.listFiles();
            for (File file4 : file3) {
                long l = file4.lastModified();
                System.out.println("\t\t"+DateUtil.format(l));
                if(file4.isDirectory()){
                    System.out.println("\t<DIR>");
                }else{
                    System.out.println("\t"+file4.length());
                }
                System.out.println("\t"+file4.getName());
            }
        }
    }
}
