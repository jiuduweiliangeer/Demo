package Java.LeetCode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _2_LinkTwoSum {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x;}
    }
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
       /* ListNode p=l1;
        ListNode q=l2;
        ListNode reListtemp=new ListNode(0);
        ListNode reList=reListtemp;
        int temp=0;
        while(p!=null||q!=null){
            if(p==null){
                reList.next=new ListNode((temp+q.val)%10);
                if(temp+q.val==10){
                    temp=1;
                }else{
                    temp=0;
                }
            }else if(q==null){
                reList.next=new ListNode((temp+p.val)%10);
                if(temp+p.val==10){
                    temp=1;
                }else{
                    temp=0;
                }
            }else if((temp+p.val+q.val)<10){
                reList.next=new ListNode(temp+p.val+q.val);
                temp=0;
            }else if ((temp+p.val+q.val)>=10){
                reList.next=new ListNode((temp+p.val+q.val)%10);
                temp=1;
            }
            if(p==null){
                q=q.next;
            }else if(q==null){
                p=p.next;
            }else{
                p=p.next;
                q=q.next;
            }
            reList=reList.next;
        }
        if(temp==1){
            reList.next=new ListNode(1);
        }
        return reListtemp.next;*/
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    }

/*从左向右相加，范围为0-9
        当值为0时，第二位在总值+1，ps:此处有一个问题，当一个值本身为0时，无论其余值是多少，都不进位
        定位中间值为temp,temp大为0，最小为1；
        三种情况
        temp+q.val+p.val>10
        sum=(temp+q.val+p.val)%10
        temp=1
        temp+q.val+p.val<10
        sum=(temp+q.val+p.val)%10
        temp=0
        temp+------=10
        sum=0
        temp=1
        int qtemp=(q!=null) ? q.val : 0
        int ptemp=(p!=null) ? q.val : 0
        sum=temp+qtemp+ptemp
        temp=sum/10
        relist.next=new ListNode(sum%10)
        if()....next
        if()....next*/
