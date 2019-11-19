package Java.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String []args){
        Set s1=new HashSet();
        Set s2=new HashSet();
        //Set和List容器类都具有Constructor(Collection c)
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s2.add("d");
        s2.add("a");
        s2.add("b");
        Set sn=new HashSet(s1);
        //构造方法用以初始化容器类
        sn.retainAll(s2);
        //retainAll表示求交集
        Set su=new HashSet(s1);
        su.addAll(s2);
        //addAll表示，把s2全部加入su中，运行结果有区别是因为Set无需且不能重复，导致s2中的部分数据没有被添加到su中
        System.out.println(sn);
        System.out.println(su);
    }
}
