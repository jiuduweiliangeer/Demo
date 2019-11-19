package Java.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String []args){
        Set s=new HashSet();
        s.add("hello");
        s.add("world");
        s.add(new Name("f1","f2"));
        s.add(new Integer(100));
        s.add(new Name("f1","f2"));//只能传入一次，Name中已经重写了equals方法，当数据一样时，就相等
        s.add("hello");//Set集合中不允许重复数据
        System.out.println(s);//输出乱序，Set集合中的数据为无序且不能重复的
    }
}
