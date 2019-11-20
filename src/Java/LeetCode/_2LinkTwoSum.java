package Java.LeetCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _2LinkTwoSum {
    /*public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x;}
    }*/
    public static void main(String []args){
        List<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.print(list);
    }
}
