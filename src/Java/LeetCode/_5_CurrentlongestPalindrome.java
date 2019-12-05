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
        while(left>=0&&right<len&&s.charAt(left)==s.charAt(right)){//&&的判定顺序得注意，否则容易造成边界不对而进入循环的问题
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
/*基于中心扩散的Manacher算法
* 最基本的中心扩散会出现缝隙中的问题
* 所以我们先向整个字符串中插入一个间隔符号，让整个字符串变成奇数，每一个间隔都有下标
* 由于直接插入会造成很大的时间复杂度，所以原则用空间来换时间，
* 新建一个StringBuilder对象，遍历字符串时进行写入，需要注意的是最后一个间隔符需要在循环结束后进行写入
* 然后就是进行中心扩散，因为我们插入了数据，所以中心扩散之后得到的长度就是步长，具体可以画图来进行理解
* 最后使用字符串切割的底层实现方法来返回得到的回文串*/