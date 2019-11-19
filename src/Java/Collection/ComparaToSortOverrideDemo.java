package Java.Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparaToSortOverrideDemo {
    public static void main(String []args){
        List list=new LinkedList();
        list.add(new Name("Karl","M"));
        list.add(new Name("Steven","Lee"));
        list.add(new Name("John","o"));
        list.add(new Name("Tom","M"));
        System.out.println(list);
        Collections.sort(list);//如果不重写comparaTo方法，则无法判断Name中数据的类型，无法进行比较，程序会出现错误
        System.out.println(list);
    }
}
