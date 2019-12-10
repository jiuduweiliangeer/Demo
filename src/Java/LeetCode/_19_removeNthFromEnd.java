package Java.LeetCode;
/*给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.*/
public class _19_removeNthFromEnd {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x;}
    }
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode listNode=new ListNode(0);
        ListNode p;
        ListNode temp;
        listNode.next=head;
        p=listNode;
        temp=listNode;
        int count=0;
        for (int i = 0; head.next!=null ; i++) {
            count++;
            head=head.next;
        }
        for (int i = 0; i <count-n+2; i++) {
            p=temp;
            temp=temp.next;
        }
        p.next=temp.next;
        return listNode.next;
    }
}
/*删除倒数第n个数据可以改成L-n+2个数据，统计链表长度即可
* 使用双指针进行变换*/