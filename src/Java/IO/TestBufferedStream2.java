package Java.IO;

import java.io.*;

public class TestBufferedStream2 {
    public static void main(String []args) throws IOException {
        try{
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("E:\\Demo5"));
            BufferedReader bufferedReader=new BufferedReader(new FileReader("E:\\Demo5"));
            String s=null;
            for (int i = 0; i <=100 ; i++) {
                s=String.valueOf(Math.random());
                bufferedWriter.write(s);
                bufferedWriter.newLine();//每向文件中写入一个字节则换行一次
                bufferedWriter.flush();
            }
            while((s=bufferedReader.readLine())!=null){//BufferedReader中的readLine方法可以直接读文件中的一行，和read方法不同，单纯使用read只能以字节为单位进行读取
                System.out.println(s);
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
