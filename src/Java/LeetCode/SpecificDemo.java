package Java.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*程序测试专用*/
public class SpecificDemo {
    public static void main(String []args){
/*        _5_CurrentlongestPalindrome currentlongestPalindrome=new _5_CurrentlongestPalindrome();
        String s=currentlongestPalindrome.solutin("cdbakj");
        System.out.println(s);*/
/*        _6_convert convert=new _6_convert();
        String s=convert.convert("LEETCODEISHIRING",4);
        System.out.println(s);*/
/*        _8_myatoi myatoi=new _8_myatoi();
        int s=myatoi.myatoi("    -88827   5655  U");
        System.out.println(s);*/
/*        _15_threesums threesums=new _15_threesums();
        int []nums={-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> lists=threesums.threeSums(nums);
        System.out.println(lists);*/
        _54_spiralOrder spiralOrder=new _54_spiralOrder();
        int [][]nums={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list=new ArrayList<Integer>();
        list=spiralOrder.spiralOrder(nums);
        System.out.println(list);
    }
}
