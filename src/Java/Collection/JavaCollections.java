package Java.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaCollections {
    public static void main(String []args){
        List l1=new LinkedList();
        List l2=new LinkedList();
        for(int i=0;i<=9;i++){
            l1.add("a"+i);
        }
        System.out.println(l1);
        Collections.shuffle(l1);
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1,"a5"));
        for (int i=0;i<=9;i++){
            l2.add("b"+i);
        }
        Collections.addAll(l1,l2);//只有当两个List中的数据数量一致时，才能使用copy方法
        System.out.println(l1);
    }
}
