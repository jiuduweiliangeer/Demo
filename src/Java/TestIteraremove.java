package Java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIteraremove {
    public static void main(String []args){
        Collection c=new HashSet();
        c.add(new Name("fff1","1111"));
        c.add(new Name("f2","12"));
        c.add(new Name("fff3","1113"));
        for (Iterator i=c.iterator();i.hasNext();){
            Name name=(Name)i.next();
            if(name.getLastName().length()<3){
                i.remove();//这里只能执行i的remove方法，因为在使用了Iterator之后就已经对这个hashmap加了锁，只有Iterator能够访问。
            }
        }
        System.out.println(c);
    }
}
