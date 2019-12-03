package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class _5_longestPalindrome {
    public String Length(String s){
        int start[]=new int[1000];
        int end[]=new int[1000];
        int start1[]=new int[1000];
        int end1[]=new int[1000];
        int temp[]=new int[1000];//如果不是回文串存放0
        int ans=0;
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i = 0; i <s.length() ; i++) {
            map.put(s.charAt(i),i);
        }
        System.out.print(map);
        for (int i = 0,j=0,k=0,l=0; i <s.length();i++) {
            if(s.charAt(i)!=start1[l]){//babad//0 b,1 a,//acbbca//accbaabc(NO)//cbba 0
                start[k]=i;
                start1[k]=s.charAt(i);
                if(map.get(s.charAt(i))==i){
                    l++;
                    j++;
                }
                k++;
            }else{
                end[j]=i;
                end1[j]=s.charAt(i);
                l++;
                j++;
            }
        }

        int count=0;
        int sss=0;
        int b=0;
        if(end[b]==0){
            b=1;
        }else{
            b=0;
        }
        for (;end[b]!=0; b++) {
            int left=start[b];
            int right=end[b];
            for(int L=left,R=right;L!=R&&L+1!=R;L++,R--){
                if(s.charAt(L+1)==s.charAt(R-1)){
                    count++;
                }else{
                    break;
                }
            }
            if(count==(right-left)/2){
                temp[b]=right-left+1;
                count=0;
            }else{
                temp[b]=0;
            }
        }
        int max=0;
        int index=0;
        for (int i = 0; i <temp.length ; i++) {
            if(max>temp[i]){
                continue;
            }else{
                max=temp[i];
                index=i;
            }
        }
        int m=start[index];
        int n=end[index];
        String ss="";
        if(n+1==s.length()){
            ss=s.substring(m);
        }else{
            ss=s.substring(m,n+1);
        }
        return ss;
    }
}
//代码有错误，错误在于不能查找三个以上的相同的数据，end的判定有一定问题，暂时这样