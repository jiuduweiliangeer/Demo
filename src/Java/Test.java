package Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Test {
    public static void main(String []args){
        Collection c=new HashSet();
        //可以放入不同的对象
        c.add("hello");
        c.add(new Name("f1","11"));
        c.add(new Integer(100));
        c.remove("hello");
        c.remove(new Integer(100));
        System.out.println(c.remove(new Name("f1","11")));//不是同一个对象，地址不同，这里使用的时equals，当地址不同的时候不能相等
        System.out.println(c.size());
        System.out.println(c);
    }
}
