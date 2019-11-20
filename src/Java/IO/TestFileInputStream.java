package Java.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {//字节流输入
    public static void main(String []args){
        int b=0;
        FileInputStream in=null;
        try{
            in=new FileInputStream("E:\\Demo.txt");//在java中使用字符串表示路径需要双反斜杠
        } catch (FileNotFoundException e) {
            System.out.println("找不到当前文件");
            System.exit(-1);
        }
        try{
            long num=0;
            while((b=in.read())!=-1){//当文件读完之后返回值为-1
                System.out.println((char) b);
                num++;
            }
            in.close();
            System.out.println(num);
        } catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
    }
}
