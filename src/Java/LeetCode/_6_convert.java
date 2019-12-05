package Java.LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

L   C   I   R
E T O E S I I G
E   D   H   N
之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。

请你实现这个将字符串进行指定行数变换的函数：

string convert(string s, int numRows);
示例 1:

输入: s = "LEETCODEISHIRING", numRows = 3
输出: "LCIRETOESIIGEDHN"
示例 2:

输入: s = "LEETCODEISHIRING", numRows = 4
输出: "LDREOEIIECIHNTSG"
解释:

L     D     R
E   O E   I I
E C   I H   N
T     S     G
*/
public class _6_convert {
    public String convert(String s,int numRow){
        List<StringBuilder> temp= new ArrayList<StringBuilder>();
        int flag=1;//用flag来判定是正序还是倒序，在遍历数组的同时将数据放入另外一个数组
        if(numRow==1){
            return s;
        }else if(numRow==0){
            throw new IllegalArgumentException("行数输入错误");
        }else{
            for (int i = 0; i <numRow ; i++) {
                temp.add(new StringBuilder());
            }//向temp中加入numrow行字符串对象
            for (int i = 0,j=0;i <s.length();i++) {
                if(flag==1){
                    temp.get(j).append(s.charAt(i));//先寻找当前需要的字符串对象位置，再向该字符串中传入数据。
                    j++;// 1 ,2, 3,4
                    if(j==numRow){
                        flag=-1;
                        j=numRow-2;
                    }
                }else{
                    temp.get(j).append(s.charAt(i));//2,1,0
                    j--;// 1,0,-1
                    if(j<0){
                        flag=1;
                        j=1;
                    }
                }
            }
            String ans="";
            for (int i = 0; i <numRow ; i++) {
                ans+=temp.get(i);
            }//将字符串对象连接在一起
            return ans.trim();//消除前后空格
        }
    }
}
