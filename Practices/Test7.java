package com.itheima.Practices;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

public class Test7 {
    public static void main(String[] args) {
        String str="Nice To See You";
        int aNull=reNull(str);//11
        System.out.println("字符串的长度为："+str.length());//15
        String re=str.substring(aNull+1);//包头不包尾
        System.out.println("最后一个单词是："+re);
        int length=str.length()-1-aNull;//最后一个单词长度str.length()-1下标从0开始
        System.out.println("长度为："+length);
    }
    //返回最后一个空格的位置
    public static int reNull(String str){
        char[] arr=str.toCharArray();
        int[] arr1=new int[str.length()];
        int number=0,j=0;
        for (int i= arr.length-1; i > 0 ; i--) {
            if (arr[i]==' '){
                arr1[j]=i;
                j++;
                System.out.println("空格的位置是："+i);
            }
        }
        number=arr1[0];
        System.out.println(number);
        return number;
    }
}
