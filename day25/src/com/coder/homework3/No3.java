package com.coder.homework3;

import java.io.*;
import java.text.DecimalFormat;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/11/10
 */
public class No3 {
    public static void main(String[] args) {
        new Thread(new File2(new File("d:/aa/x.mp3"),new File("d:/aa/y.mp3"))).start();
        new Thread(new File2(new File("d:/aa/x1.mp3"),new File("d:/aa/y1.mp3"))).start();
        new Thread(new File2(new File("d:/aa/x2.mp3"),new File("d:/aa/y2.mp3"))).start();

    }
}
class File2 implements Runnable{
    private  File src;
    private  File dest;

    public File2(File src, File dest) {
        this.src = src;
        this.dest = dest;
    }
    @Override
    public void run() {
        try {
            File1.copyFile(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class File1{
    public static void copyFile(File src,File dest) throws IOException {
        if(!src.isFile()){
                System.out.println("文件不存在");
        }
        byte[] b=new byte[1024];
        int x;
        double d=0;
        DecimalFormat format=new DecimalFormat("##.##");
        try(BufferedInputStream bs=new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bx=new BufferedOutputStream(new FileOutputStream(dest));
            ) {
            while ((x = bs.read(b)) != -1) {
                bx.write(b,0,x);
                d+=x;
                double y=d/ src.length();
                if(y!=1)
                System.out.println("复制文件"+src.getName()+"进度"+format.format(y*100)+"%");
            }
            System.out.println(src.getName()+"文件复制完成");
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
