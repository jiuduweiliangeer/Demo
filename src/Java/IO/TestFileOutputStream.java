package Java.IO;
import java.io.*;
public class TestFileOutputStream {
    public static void main(String []args){
        int b=0;
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("E:\\Demo.txt");
            out=new FileOutputStream("E:\\Demo2.txt");
            while((b=in.read())!=-1){
                out.write(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("文件复制错误");
            System.exit(-1);
        }
        System.out.println("文件已复制");
    }
}
