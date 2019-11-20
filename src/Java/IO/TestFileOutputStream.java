package Java.IO;
import java.io.*;
public class TestFileOutputStream {//字节流输出容易出现汉字读取乱码的情况
    public static void main(String []args){
        int b=0;
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("E:\\Demo.txt");
            out=new FileOutputStream("E:\\Demo3.txt");//FileOutputStream如果没有其中的路径，系统会自动创建一个文件
            while((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();//管道用完记得关闭
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
