package Java.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _54_spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> list=new ArrayList<Integer>();
        int flag=1;
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        System.out.println(matrix[0][0]);
        int s= Integer.parseInt(null);
        int k=0;
        int j=0;
        while (k<=m){
            if(matrix[k][j]!=s){
                list.add(matrix[k][j]);
                matrix[k][j]=s;
            }else{
                if(matrix[k][j+1]!=s){
                    j++;
                }else if(matrix[k+1][j]!=s){
                    k++;
                }
            }
        }
        System.out.println(matrix[0][0]);
        return list;
    }
}
/*
* {[1,2,3]
*   [4,5,6]
*   [7,8,9]}
* 定义一个flag确定列数的加减，为正顺时针，为反逆时针
* 一个单循环，在进行遍历时就不断加入list中即可*/
