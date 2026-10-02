import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/2
 */
public class FileUtil {
    public static void write(List<String> names,String filename){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<String> read(String filename){
        List<String> list=new ArrayList<>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filename));
            String name;
            while((name=reader.readLine())!=null){
                list.add(name);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<String> getName(){
        Scanner sc =new Scanner(System.in);
        List<String> list=new ArrayList<>();
        System.out.println("请录入人员姓名,直到'完成'结束");
        while (true){
            String name=sc.next();
            if("完成".equals(name)){
                break;
            }
            list.add(name);
        }
        return list;
    }
    public static String getFileName(String suffix){
        String x = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy年MM月"));
        return x+"_"+suffix+".txt";
    }
}
