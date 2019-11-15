package Java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {
    public static void main(String args[]){
        Collection c=new HashSet();//HashSet本身时没有顺序的
        c.add(new Name("f1","11"));
        c.add(new Name("f2","12"));
        c.add(new Name("f3","13"));
        //Iterator对象，每一个collection都有一个iterator方法，返回iterator对象
        //iterator对象中有三个方法，分别是hashNext().next(),remove()
        Iterator i=c.iterator();
        while(i.hasNext()){
            Name name=(Name)i.next();
            System.out.println(name.getFirstName()+"");
        }

    }
}
