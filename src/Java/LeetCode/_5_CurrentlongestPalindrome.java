package Java.LeetCode;
/*题目描述
* 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。*/
/*动态规划，中心扩散*/
public class _5_CurrentlongestPalindrome {
    public String solutin(String s){
        if(s.length()<2){
            return s;
        }
        int start=0;
        int maxLine=1;
        int len=s.length();
        int slen=len*2+1;
        String tempstring=addBunder(s,'#');
        for (int i = 0; i <slen ; i++) {
            int step=step(tempstring,i);
            if(step>maxLine){
                maxLine=step;
                start=(i-maxLine)/2;
            }
        }
        return s.substring(start,start+maxLine);//字符串方法，切割返回
    }
    public int step(String s,int center){
        int steptemp=0;
        int left=center-1;
        int right=center+1;
        int len=s.length();
        while(left>=0&&right<len&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            steptemp++;
        }
        return steptemp;
    }//中心扩散判断步长
    public String addBunder(String s,char divide){
        if(s.length()==0){
            return "";
        }
        if(s.indexOf(divide)!=-1){
            throw new IllegalArgumentException("传入参数错误");
        }
        StringBuilder stringBuilder=new StringBuilder();//缓存方法，便于使用
        for (int i = 0; i <s.length() ; i++) {
            stringBuilder.append(divide);
            stringBuilder.append(s.charAt(i));
        }
        stringBuilder.append(divide);
        return stringBuilder.toString();
    }//插入建个符，准确判断步长
}
