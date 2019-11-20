package Java.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {//字符流输出
    public static void main(String []args){
        FileWriter writer=null;
        try{
            writer=new FileWriter("E:\\Demo4.txt");//如果没有该文件，程序会自动创建一个文件，ps：只能帮助写文件，不能写目录，所以得先创建目录
            for (int i = 0; i <+50000 ; i++) {
                writer.write(i);
            }//写入了世界上大部分的文字
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    }
}
