package com.itheima.Practices;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        //生成验证码.长度为5，大小写字母都有，数字随机。
        char[] arr=new char[52];
        //定义大小写数组
        for (int i = 0; i < arr.length; i++) {
            if (i<26){
                arr[i]=(char)(97+i);
            }else{
                arr[i]=(char) (65+i-26);
            }
        }
        System.out.println(arr);
        Random r=new Random();
        String str="";
        for (int i = 0; i < 4; i++) {
            int anInt = r.nextInt(arr.length);
            str=str+arr[anInt];
        }
        System.out.println(str);
        int number= r.nextInt(10);
        str=str+number;
        System.out.println(str);
        String s = randomString(str);
        System.out.println(s);
    }
    //打乱字符串顺序
    public static String randomString(String str){
        char[] arr=str.toCharArray();
        Random r=new Random();
        char c;
        for (int i = 0; i < arr.length; i++) {
            int nextInt = r.nextInt(arr.length);
            c=arr[i];
            arr[i]=arr[nextInt];
            arr[nextInt]=c;
        }
        String strs=new String(arr);
        return strs;
    }
}
