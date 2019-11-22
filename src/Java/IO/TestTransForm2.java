package Java.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestTransForm2 {
    public static void main(String []args){
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);//System.in表示输入，他是等待的标准输入，需要输入数据
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String s=null;
        try{
            s=bufferedReader.readLine();
            while(s!=null){
                if (s.equalsIgnoreCase("exit")){
                    break;
                }
                System.out.print(s.toUpperCase());//转换成大写
                s=bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//阻塞式方法or同步式方法
