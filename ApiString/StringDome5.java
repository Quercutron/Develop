package com.itheima.ApiString;

import java.util.Scanner;

public class StringDome5 {
    //字符串颠倒。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = stringTo(sc.next());
        System.out.println(str);
    }
    public static String stringTo(String str){
        String result="";
        for (int j = str.length()-1; j>=0; j--) {
            result=result+str.charAt(j);
        }
        return result;
    }
}
