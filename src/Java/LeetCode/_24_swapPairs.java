package Java.LeetCode;

import java.util.List;

/*给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 

示例:

给定 1->2->3->4, 你应该返回 2->1->4->3.*/
public class _24_swapPairs {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public ListNode swapPairs(ListNode head){
        ListNode node = head;
        //辅助虚拟头节点
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        ListNode pre=dummyHead;
        ListNode ptr=pre.next;
        while (ptr!=null&&ptr.next!=null){
            ListNode temp=ptr.next;
            ListNode temp1=ptr.next.next;
            pre.next=temp;
            temp.next=ptr;
            pre=ptr;
            ptr=temp1;
        }
        pre.next=ptr;
        return dummyHead.next;
    }
}
