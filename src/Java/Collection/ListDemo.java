package Java.Collection;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String []args){
        List list=new LinkedList();
        for(int i=0;i<=5;i++){
            list.add("a"+i);
        }
        System.out.println(list);
        list.add(3,"a100");
        System.out.println(list);
        list.set(6,"a200");
        System.out.println(list);
        System.out.println((String)list.get(2)+"");
        System.out.println(list.indexOf("a3"));
        list.remove(1);
        System.out.println(list);
        System.out.println("1");
    }
}
