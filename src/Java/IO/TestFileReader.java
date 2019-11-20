package Java.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {//字符流输入,不存在字节流输入出现汉字乱码的情况
    public static void main(String []args){
        FileReader fileReader=null;
        int c=0;
        try{
            fileReader=new FileReader("E:\\IDEA\\JAVA高级\\src\\Java\\IO\\TestFileReader.java");
            int in=0;
            while((c=fileReader.read())!=-1){
                System.out.print((char)c);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到该文件");
        } catch (IOException e) {
            System.out.println("文件读取错误");
        }
    }
}
