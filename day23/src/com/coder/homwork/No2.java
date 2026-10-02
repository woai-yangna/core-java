package com.coder.homwork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/2
 */
public class No2 {
    public static void main(String[] args) {
        copyDir(new File("D:/aa"),new File("d:/xx"));
    }
    public static void copyDir(File srcDir,File destDir) {
        destDir.mkdirs();
        File[] files = srcDir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
               copy(file,new File(destDir,file.getName()));
            } else {
                    copyDir(file,new File(destDir,file.getName()));
            }
        }
    }
    public static void copy(File srcFile,File destFile){
        try (
                FileReader reader=new FileReader(srcFile);
                FileWriter writer=new FileWriter(destFile);
        ){
            reader.transferTo(writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
