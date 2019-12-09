package Java.LeetCode;

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
        _15_threesums threesums=new _15_threesums();
        int []nums={-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> lists=threesums.threeSums(nums);
        System.out.println(lists);
    }
}
