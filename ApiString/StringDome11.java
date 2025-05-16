package com.itheima.ApiString;

import java.util.Scanner;

public class StringDome11 {
    //利用StringBuilder对字符串进行反转比较
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next();

        String sb=new StringBuilder().append(str).reverse().toString();
//    int[] arr={1,2,3,4};
    if (str.equals(sb)){
        System.out.println("这是一个对称字符串");
    }else {
        System.out.println("这不是一个对称字符串");
    }
    }
//    public static boolean stringRevers(String str){
//        StringBuilder sb=new StringBuilder();
//        String re=sb.append(str).reverse().toString();
//        boolean result=re.equals(sb.append(str).reverse());
//        return result;
//    }
}
