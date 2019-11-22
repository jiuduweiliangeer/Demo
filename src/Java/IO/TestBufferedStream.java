package Java.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class TestBufferedStream {
    public static void main(String []args){
        try{
            FileInputStream fileInputStream=new FileInputStream("E:\\IDEA\\JAVA高级\\src\\Java\\HelloWorld.java");
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
            int c=0;
            System.out.println(bufferedInputStream.read());
            System.out.println(bufferedInputStream.read());
            bufferedInputStream.mark(100);//标记输入流的当前位置，readlimit表示允许在标记位置无效之前读取许多字节
            for (int i = 0; i <10 && ((c=bufferedInputStream.read())!=-1) ; i++) {
                System.out.println((char) c+" ");
            }
            System.out.println();
            bufferedInputStream.reset();//将此流重新定位到上次在此输入流上调用mark的位置
            for (int i = 0; i <10 && ((c=bufferedInputStream.read())!=-1) ; i++) {
                System.out.println((char) c+" ");
            }
            bufferedInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
