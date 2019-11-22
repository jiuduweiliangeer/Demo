package Java.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransForm1 {
    public static void main(String []args){
        try{
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("E:\\Demo6.txt"));
            outputStreamWriter.write("abcdefghijklmn");
            System.out.println(outputStreamWriter.getEncoding());
            outputStreamWriter.close();
            String m="IBM500";
            outputStreamWriter=new OutputStreamWriter(new FileOutputStream("E:\\Demo6.txt",true),m);//true表示在当前文件已有数据的情况下，接在数据后面继续写入数据，如果不加入true，则会覆盖当前文本，造成数据丢失
            //该构造方法可以指定字符编码
            outputStreamWriter.write("abcdefghijklmn");
            System.out.println(outputStreamWriter.getEncoding());
            outputStreamWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
